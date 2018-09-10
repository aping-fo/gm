package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.NewUserSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.SigninSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class LogonStatisticsSqlProvider {
    public String searchPage(SigninSearchQuery query) {
        StringBuilder sql = new StringBuilder("select update_time,logon_count,logon_number,old_player_count,avg_logon_number,old_player_online_time,old_player_avg_online_time,old_player_arpu,active_player_count,loyal_player_count,total_registration,old_player_equipment from logon_statistics where 1=1 ");
        if (query.getChannelId() != null ) {
            sql.append(" and channel_id =#{channelId} ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(")  ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and DATE_FORMAT(update_time,'%Y-%m-%d') >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and DATE_FORMAT(update_time,'%Y-%m-%d') <= #{endDate}  ");
        }
        if (query.getPackageId()!=null) {
            sql.append(" and package_id = #{packageId}  ");
        }
        return sql.toString();
    }
}
