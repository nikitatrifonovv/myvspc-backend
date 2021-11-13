package com.ntsoftware.myvspc.newsservice.services.impl;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlocksEntity;
import com.ntsoftware.myvspc.newsservice.repositories.BlocksRepository;
import com.ntsoftware.myvspc.newsservice.services.BlocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocksServiceImpl implements BlocksService {

    @Autowired
    BlocksRepository blocksRepository;

    @Override
    public BlocksEntity addBlock(BlocksEntity block) {
        return blocksRepository.save(block);
    }

    @Override
    public List<BlocksEntity> addBlocks(List<BlocksEntity> blocks) {
        return blocksRepository.saveAll(blocks);
    }

    @Override
    public List<BlocksEntity> getAllBlocks() {
        return blocksRepository.findAll();
    }

    @Override
    public List<BlocksEntity> getAllBlocksByNewId(long id) {
        return blocksRepository.findAllByNewsOrderByPosition(id);
    }

    @Override
    public void deleteBlockById(long id) {
        blocksRepository.deleteById(id);
    }

    @Override
    public void deleteAllBlocksByNewsId(long id) {
        blocksRepository.deleteAllByNews(id);
    }
}
