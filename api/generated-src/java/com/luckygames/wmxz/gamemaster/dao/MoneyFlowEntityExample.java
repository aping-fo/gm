package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoneyFlowEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyFlowEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Status value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Status value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Status value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Status value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Status value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Status value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Status> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Status> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Status value1, Status value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Status value1, Status value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Long value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Long value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Long value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Long value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Long value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Long> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Long> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Long value1, Long value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Long value1, Long value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNull() {
            addCriterion("`server_name` is null");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNotNull() {
            addCriterion("`server_name` is not null");
            return (Criteria) this;
        }

        public Criteria andServerNameEqualTo(String value) {
            addCriterion("`server_name` =", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotEqualTo(String value) {
            addCriterion("`server_name` <>", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThan(String value) {
            addCriterion("`server_name` >", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThanOrEqualTo(String value) {
            addCriterion("`server_name` >=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThan(String value) {
            addCriterion("`server_name` <", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThanOrEqualTo(String value) {
            addCriterion("`server_name` <=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLike(String value) {
            addCriterion("`server_name` like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotLike(String value) {
            addCriterion("`server_name` not like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameIn(List<String> values) {
            addCriterion("`server_name` in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotIn(List<String> values) {
            addCriterion("`server_name` not in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameBetween(String value1, String value2) {
            addCriterion("`server_name` between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotBetween(String value1, String value2) {
            addCriterion("`server_name` not between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeIsNull() {
            addCriterion("money_type is null");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeIsNotNull() {
            addCriterion("money_type is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeEqualTo(Integer value) {
            addCriterion("money_type =", value, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeNotEqualTo(Integer value) {
            addCriterion("money_type <>", value, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeGreaterThan(Integer value) {
            addCriterion("money_type >", value, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("money_type >=", value, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeLessThan(Integer value) {
            addCriterion("money_type <", value, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("money_type <=", value, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeIn(List<Integer> values) {
            addCriterion("money_type in", values, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeNotIn(List<Integer> values) {
            addCriterion("money_type not in", values, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeBetween(Integer value1, Integer value2) {
            addCriterion("money_type between", value1, value2, "moneyType");
            return (Criteria) this;
        }

        public Criteria andMoneyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("money_type not between", value1, value2, "moneyType");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIsNull() {
            addCriterion("change_money is null");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIsNotNull() {
            addCriterion("change_money is not null");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyEqualTo(Integer value) {
            addCriterion("change_money =", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotEqualTo(Integer value) {
            addCriterion("change_money <>", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyGreaterThan(Integer value) {
            addCriterion("change_money >", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_money >=", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyLessThan(Integer value) {
            addCriterion("change_money <", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("change_money <=", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIn(List<Integer> values) {
            addCriterion("change_money in", values, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotIn(List<Integer> values) {
            addCriterion("change_money not in", values, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyBetween(Integer value1, Integer value2) {
            addCriterion("change_money between", value1, value2, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("change_money not between", value1, value2, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldIsNull() {
            addCriterion("change_bind_gold is null");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldIsNotNull() {
            addCriterion("change_bind_gold is not null");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldEqualTo(Integer value) {
            addCriterion("change_bind_gold =", value, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldNotEqualTo(Integer value) {
            addCriterion("change_bind_gold <>", value, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldGreaterThan(Integer value) {
            addCriterion("change_bind_gold >", value, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_bind_gold >=", value, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldLessThan(Integer value) {
            addCriterion("change_bind_gold <", value, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldLessThanOrEqualTo(Integer value) {
            addCriterion("change_bind_gold <=", value, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldIn(List<Integer> values) {
            addCriterion("change_bind_gold in", values, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldNotIn(List<Integer> values) {
            addCriterion("change_bind_gold not in", values, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldBetween(Integer value1, Integer value2) {
            addCriterion("change_bind_gold between", value1, value2, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andChangeBindGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("change_bind_gold not between", value1, value2, "changeBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldIsNull() {
            addCriterion("left_gold is null");
            return (Criteria) this;
        }

        public Criteria andLeftGoldIsNotNull() {
            addCriterion("left_gold is not null");
            return (Criteria) this;
        }

        public Criteria andLeftGoldEqualTo(Integer value) {
            addCriterion("left_gold =", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldNotEqualTo(Integer value) {
            addCriterion("left_gold <>", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldGreaterThan(Integer value) {
            addCriterion("left_gold >", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_gold >=", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldLessThan(Integer value) {
            addCriterion("left_gold <", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldLessThanOrEqualTo(Integer value) {
            addCriterion("left_gold <=", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldIn(List<Integer> values) {
            addCriterion("left_gold in", values, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldNotIn(List<Integer> values) {
            addCriterion("left_gold not in", values, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldBetween(Integer value1, Integer value2) {
            addCriterion("left_gold between", value1, value2, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("left_gold not between", value1, value2, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldIsNull() {
            addCriterion("left_bind_gold is null");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldIsNotNull() {
            addCriterion("left_bind_gold is not null");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldEqualTo(Integer value) {
            addCriterion("left_bind_gold =", value, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldNotEqualTo(Integer value) {
            addCriterion("left_bind_gold <>", value, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldGreaterThan(Integer value) {
            addCriterion("left_bind_gold >", value, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_bind_gold >=", value, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldLessThan(Integer value) {
            addCriterion("left_bind_gold <", value, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldLessThanOrEqualTo(Integer value) {
            addCriterion("left_bind_gold <=", value, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldIn(List<Integer> values) {
            addCriterion("left_bind_gold in", values, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldNotIn(List<Integer> values) {
            addCriterion("left_bind_gold not in", values, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldBetween(Integer value1, Integer value2) {
            addCriterion("left_bind_gold between", value1, value2, "leftBindGold");
            return (Criteria) this;
        }

        public Criteria andLeftBindGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("left_bind_gold not between", value1, value2, "leftBindGold");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}