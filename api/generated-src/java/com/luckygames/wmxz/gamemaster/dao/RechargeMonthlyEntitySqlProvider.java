package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RechargeMonthlyEntitySqlProvider {

    public String countByExample(RechargeMonthlyEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("recharge_monthly");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RechargeMonthlyEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("recharge_monthly");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(RechargeMonthlyEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("recharge_monthly");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenDate() != null) {
            sql.VALUES("open_date", "#{openDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRechargeAmount() != null) {
            sql.VALUES("recharge_amount", "#{rechargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRechargeYear() != null) {
            sql.VALUES("recharge_year", "#{rechargeYear,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeMonth() != null) {
            sql.VALUES("recharge_month", "#{rechargeMonth,jdbcType=INTEGER}");
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

    public String selectByExample(RechargeMonthlyEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("open_date");
        sql.SELECT("recharge_amount");
        sql.SELECT("recharge_year");
        sql.SELECT("recharge_month");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("recharge_monthly");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        RechargeMonthlyEntity record = (RechargeMonthlyEntity) parameter.get("record");
        RechargeMonthlyEntityExample example = (RechargeMonthlyEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("recharge_monthly");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenDate() != null) {
            sql.SET("open_date = #{record.openDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRechargeAmount() != null) {
            sql.SET("recharge_amount = #{record.rechargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRechargeYear() != null) {
            sql.SET("recharge_year = #{record.rechargeYear,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeMonth() != null) {
            sql.SET("recharge_month = #{record.rechargeMonth,jdbcType=INTEGER}");
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
        sql.UPDATE("recharge_monthly");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("open_date = #{record.openDate,jdbcType=TIMESTAMP}");
        sql.SET("recharge_amount = #{record.rechargeAmount,jdbcType=DECIMAL}");
        sql.SET("recharge_year = #{record.rechargeYear,jdbcType=INTEGER}");
        sql.SET("recharge_month = #{record.rechargeMonth,jdbcType=INTEGER}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        RechargeMonthlyEntityExample example = (RechargeMonthlyEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RechargeMonthlyEntityExample example, boolean includeExamplePhrase) {
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