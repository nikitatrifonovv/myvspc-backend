package com.ntsoftware.myvspc.newsservice.services;

import com.ntsoftware.myvspc.newsservice.entities.dao.MetaDataEntity;

public interface MetaDataService {
    MetaDataEntity addMetaData(MetaDataEntity metaDataEntity);

    void deleteMetaData(long id);

    MetaDataEntity getMetaDataById(long id);

    String getTypeNameById(long id);
}
