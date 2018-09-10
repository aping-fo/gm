package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.BaseInformationEntity;
import com.luckygames.wmxz.gamemaster.dao.BaseInformationEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.BaseInformationSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.BaseInformation;
import org.apache.ibatis.annotations.SelectProvider;

public interface BaseInformationMapper extends BaseInformationEntityMapper<BaseInformationEntity> {
    @SelectProvider(type = BaseInformationSqlProvider.class, method = "searchById")
    BaseInformation searchById(Integer charId);

    @SelectProvider(type = BaseInformationSqlProvider.class, method = "updateByCharId")
    void updateByCharId(BaseInformation baseInformation);
}
