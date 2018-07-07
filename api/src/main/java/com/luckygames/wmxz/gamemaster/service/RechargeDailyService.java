package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyEntity;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface RechargeDailyService extends BaseService<RechargeDailyEntity> {
    Page<RechargeDaily> searchPage(RechargeDailySearchQuery rechargeDailySearchRequest);

    List<RechargeDaily> searchList(RechargeDailySearchQuery rechargeDailySearchRequest);

    RechargeDaily findOne(Long channelId, Long serverId, Date date);

    RechargeDaily findOne(Long channelId, Long serverId, String date);

    void generateRechargeDailyReportToday();

    void generateRechargeDailyReportYesterDay();

    List<RechargeDaily> findByOneDate(String date);

    void generateRechargeDailyReportByDay(Date date);

    void generateRechargeDailyReportByDay(String date);
}
