package com.ntsoftware.myvspc.newsservice.services;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlockEntity;

import java.util.List;
import java.util.UUID;

public interface BlocksService {
    BlockEntity addBlock(BlockEntity block);
    List<BlockEntity> addBlocks(List<BlockEntity> blocks);
    List<BlockEntity> getAllBlocks();
    List<BlockEntity> getAllBlocksByNewId(UUID newsId);
    void deleteBlockById(UUID id);
    void deleteAllBlocksByNewsId(UUID newsId);
}
