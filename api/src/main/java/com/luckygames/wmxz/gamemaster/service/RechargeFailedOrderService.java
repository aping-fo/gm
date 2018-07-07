package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntity;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeFailedOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeFailedOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;

public interface RechargeFailedOrderService extends BaseService<RechargeFailedOrderEntity> {
    Page<RechargeFailedOrder> searchPage(RechargeFailedOrderSearchQuery rechargeFailedOrderSearchRequest);

    void generateRechargeFailedOrderReportToday();

    RechargeFailedOrder findOne(Long channelId, Long serverId, Date date);

    void generateRechargeFailedOrderReportByDay(String date);
}
