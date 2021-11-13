package com.ntsoftware.myvspc.newsservice.services;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlocksEntity;

import java.util.List;

public interface BlocksService {
    BlocksEntity addBlock(BlocksEntity block);

    List<BlocksEntity> addBlocks(List<BlocksEntity> blocks);

    List<BlocksEntity> getAllBlocks();

    List<BlocksEntity> getAllBlocksByNewId(long id);

    void deleteBlockById(long id);

    void deleteAllBlocksByNewsId(long id);
}
