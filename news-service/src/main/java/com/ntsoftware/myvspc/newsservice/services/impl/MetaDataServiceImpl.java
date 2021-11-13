package com.ntsoftware.myvspc.newsservice.services.impl;

import com.ntsoftware.myvspc.newsservice.entities.dao.MetaDataEntity;
import com.ntsoftware.myvspc.newsservice.repositories.MetaDataRepository;
import com.ntsoftware.myvspc.newsservice.repositories.MetaDataTypesRepository;
import com.ntsoftware.myvspc.newsservice.services.MetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetaDataServiceImpl implements MetaDataService {

    @Autowired
    MetaDataTypesRepository mdTypesRepository;

    @Autowired
    MetaDataRepository mdRepository;

    @Override
    public MetaDataEntity addMetaData(MetaDataEntity metaDataEntity) {
        return mdRepository.save(metaDataEntity);
    }

    @Override
    public void deleteMetaData(long id) {
        mdRepository.deleteById(id);
    }

    @Override
    public MetaDataEntity getMetaDataById(long id) {
        return mdRepository.findById(id).get();
    }

    @Override
    public String getTypeNameById(long id) {
        return mdTypesRepository.findById(id).get().getName();
    }
}
