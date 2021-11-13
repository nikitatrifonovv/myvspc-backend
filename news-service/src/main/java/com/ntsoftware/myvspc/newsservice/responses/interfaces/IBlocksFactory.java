package com.ntsoftware.myvspc.newsservice.responses.interfaces;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlocksEntity;

import java.util.List;

public interface IBlocksFactory {
    List<BlocksEntity> getAllBlocksByNewsId(long id);
}
