package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PlayerActionDailyEntitySqlProvider {

    public String countByExample(PlayerActionDailyEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("player_action_daily");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PlayerActionDailyEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("player_action_daily");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PlayerActionDailyEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("player_action_daily");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getReportDate() != null) {
            sql.VALUES("report_date", "#{reportDate,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayerCount() != null) {
            sql.VALUES("player_count", "#{playerCount,jdbcType=INTEGER}");
        }
        
        if (record.getCharCount() != null) {
            sql.VALUES("char_count", "#{charCount,jdbcType=INTEGER}");
        }
        
        if (record.getLoginCount() != null) {
            sql.VALUES("login_count", "#{loginCount,jdbcType=INTEGER}");
        }
        
        if (record.getLogoffCount() != null) {
            sql.VALUES("logoff_count", "#{logoffCount,jdbcType=INTEGER}");
        }
        
        if (record.getOnlineTime() != null) {
            sql.VALUES("online_time", "#{onlineTime,jdbcType=BIGINT}");
        }
        
        if (record.getDeviceCount() != null) {
            sql.VALUES("device_count", "#{deviceCount,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PlayerActionDailyEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel_id");
        sql.SELECT("server_id");
        sql.SELECT("report_date");
        sql.SELECT("player_count");
        sql.SELECT("char_count");
        sql.SELECT("login_count");
        sql.SELECT("logoff_count");
        sql.SELECT("online_time");
        sql.SELECT("device_count");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("player_action_daily");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PlayerActionDailyEntity record = (PlayerActionDailyEntity) parameter.get("record");
        PlayerActionDailyEntityExample example = (PlayerActionDailyEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("player_action_daily");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getReportDate() != null) {
            sql.SET("report_date = #{record.reportDate,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayerCount() != null) {
            sql.SET("player_count = #{record.playerCount,jdbcType=INTEGER}");
        }
        
        if (record.getCharCount() != null) {
            sql.SET("char_count = #{record.charCount,jdbcType=INTEGER}");
        }
        
        if (record.getLoginCount() != null) {
            sql.SET("login_count = #{record.loginCount,jdbcType=INTEGER}");
        }
        
        if (record.getLogoffCount() != null) {
            sql.SET("logoff_count = #{record.logoffCount,jdbcType=INTEGER}");
        }
        
        if (record.getOnlineTime() != null) {
            sql.SET("online_time = #{record.onlineTime,jdbcType=BIGINT}");
        }
        
        if (record.getDeviceCount() != null) {
            sql.SET("device_count = #{record.deviceCount,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("player_action_daily");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("report_date = #{record.reportDate,jdbcType=VARCHAR}");
        sql.SET("player_count = #{record.playerCount,jdbcType=INTEGER}");
        sql.SET("char_count = #{record.charCount,jdbcType=INTEGER}");
        sql.SET("login_count = #{record.loginCount,jdbcType=INTEGER}");
        sql.SET("logoff_count = #{record.logoffCount,jdbcType=INTEGER}");
        sql.SET("online_time = #{record.onlineTime,jdbcType=BIGINT}");
        sql.SET("device_count = #{record.deviceCount,jdbcType=INTEGER}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        PlayerActionDailyEntityExample example = (PlayerActionDailyEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PlayerActionDailyEntityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}