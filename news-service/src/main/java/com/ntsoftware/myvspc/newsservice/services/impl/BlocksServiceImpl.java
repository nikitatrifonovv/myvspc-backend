package com.ntsoftware.myvspc.newsservice.services.impl;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlockEntity;
import com.ntsoftware.myvspc.newsservice.repositories.BlockRepo;
import com.ntsoftware.myvspc.newsservice.services.BlocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BlocksServiceImpl implements BlocksService {

    BlockRepo repository;

    @Autowired
    public BlocksServiceImpl(BlockRepo repository) {
        this.repository = repository;
    }

    @Override
    public BlockEntity addBlock(BlockEntity block) {
        return repository.save(block);
    }

    @Override
    public List<BlockEntity> addBlocks(List<BlockEntity> blocks) {
        return repository.saveAll(blocks);
    }

    @Override
    public List<BlockEntity> getAllBlocks() {
        return repository.findAll();
    }

    @Override
    public List<BlockEntity> getAllBlocksByNewId(UUID newsId) {
        return repository.findAllByNewsId(newsId);
    }

    @Override
    public void deleteBlockById(UUID id) {

    }

    @Override
    public void deleteAllBlocksByNewsId(UUID newsId) {

    }
}
