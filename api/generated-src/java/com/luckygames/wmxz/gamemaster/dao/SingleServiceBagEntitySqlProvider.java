package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagEntity;
import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SingleServiceBagEntitySqlProvider {

    public String countByExample(SingleServiceBagEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("single_service_bag");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SingleServiceBagEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("single_service_bag");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SingleServiceBagEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("single_service_bag");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNumberBackgroundActivationCodes() != null) {
            sql.VALUES("number_background_activation_codes", "#{numberBackgroundActivationCodes,jdbcType=INTEGER}");
        }
        
        if (record.getNumberSingleServiceActivationCodes() != null) {
            sql.VALUES("number_single_service_activation_codes", "#{numberSingleServiceActivationCodes,jdbcType=INTEGER}");
        }
        
        if (record.getDifferentialBatch() != null) {
            sql.VALUES("differential_batch", "#{differentialBatch,jdbcType=VARCHAR}");
        }
        
        if (record.getSingleServiceStatus() != null) {
            sql.VALUES("single_service_status", "#{singleServiceStatus,jdbcType=INTEGER}");
        }
        
        if (record.getSingleServiceName() != null) {
            sql.VALUES("single_service_name", "#{singleServiceName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SingleServiceBagEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("`status`");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("number_background_activation_codes");
        sql.SELECT("number_single_service_activation_codes");
        sql.SELECT("differential_batch");
        sql.SELECT("single_service_status");
        sql.SELECT("single_service_name");
        sql.FROM("single_service_bag");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SingleServiceBagEntity record = (SingleServiceBagEntity) parameter.get("record");
        SingleServiceBagEntityExample example = (SingleServiceBagEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("single_service_bag");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNumberBackgroundActivationCodes() != null) {
            sql.SET("number_background_activation_codes = #{record.numberBackgroundActivationCodes,jdbcType=INTEGER}");
        }
        
        if (record.getNumberSingleServiceActivationCodes() != null) {
            sql.SET("number_single_service_activation_codes = #{record.numberSingleServiceActivationCodes,jdbcType=INTEGER}");
        }
        
        if (record.getDifferentialBatch() != null) {
            sql.SET("differential_batch = #{record.differentialBatch,jdbcType=VARCHAR}");
        }
        
        if (record.getSingleServiceStatus() != null) {
            sql.SET("single_service_status = #{record.singleServiceStatus,jdbcType=INTEGER}");
        }
        
        if (record.getSingleServiceName() != null) {
            sql.SET("single_service_name = #{record.singleServiceName,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("single_service_bag");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("number_background_activation_codes = #{record.numberBackgroundActivationCodes,jdbcType=INTEGER}");
        sql.SET("number_single_service_activation_codes = #{record.numberSingleServiceActivationCodes,jdbcType=INTEGER}");
        sql.SET("differential_batch = #{record.differentialBatch,jdbcType=VARCHAR}");
        sql.SET("single_service_status = #{record.singleServiceStatus,jdbcType=INTEGER}");
        sql.SET("single_service_name = #{record.singleServiceName,jdbcType=VARCHAR}");
        
        SingleServiceBagEntityExample example = (SingleServiceBagEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SingleServiceBagEntityExample example, boolean includeExamplePhrase) {
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