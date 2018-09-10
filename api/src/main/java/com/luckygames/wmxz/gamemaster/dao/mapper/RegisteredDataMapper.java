package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.RegisteredDataEntity;
import com.luckygames.wmxz.gamemaster.dao.RegisteredDataEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RegisteredDataSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.RegisteredData;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.EquipmentSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface RegisteredDataMapper extends RegisteredDataEntityMapper<RegisteredDataEntity> {

    @SelectProvider(type = RegisteredDataSqlProvider.class, method = "searchPage")
    List<RegisteredData> searchPage(EquipmentSearchQuery query);
}
