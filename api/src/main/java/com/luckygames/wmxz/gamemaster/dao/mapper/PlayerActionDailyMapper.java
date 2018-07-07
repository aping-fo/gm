package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailySqlProvider;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntityMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionDaily;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface PlayerActionDailyMapper extends PlayerActionLogEntityMapper<PlayerActionDailyEntity> {
    @SelectProvider(type = PlayerActionDailySqlProvider.class, method = "queryPlayerDailyReportSingleDate")
    List<PlayerActionDaily> queryPlayerDailyReportSingleDate(String date);

    @SelectProvider(type = PlayerActionDailySqlProvider.class, method = "queryPlayerActionDailyRegisterReport")
    List<PlayerActionDaily> queryPlayerActionDailyRegisterReport(CommonSearchQuery query);

    @SelectProvider(type = PlayerActionDailySqlProvider.class, method = "queryPlayerActionDailyCharacterReport")
    List<PlayerActionDaily> queryPlayerActionDailyCharacterReport(CommonSearchQuery query);

    @SelectProvider(type = PlayerActionDailySqlProvider.class, method = "queryPlayerActionDailyCharacterAnalysisReport")
    List<PlayerActionDaily> queryPlayerActionDailyCharacterAnalysisReport(CommonSearchQuery query);
}