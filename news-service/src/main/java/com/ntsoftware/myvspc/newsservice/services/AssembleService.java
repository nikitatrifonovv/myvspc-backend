package com.ntsoftware.myvspc.newsservice.services;

import com.ntsoftware.myvspc.newsservice.entities.AssembledNewsPreview;
import com.ntsoftware.myvspc.newsservice.entities.dao.BlockEntity;
import com.ntsoftware.myvspc.newsservice.requests.AssembledNewsRequest;

import java.util.List;
import java.util.UUID;

public interface AssembleService {

    void disassembleAndSave(AssembledNewsRequest request);

    List<BlockEntity> assembleAllBlocksByNews(UUID newsId);

    List<AssembledNewsPreview> assembleAllNewsPreview();

    AssembledNewsPreview assembleNewsPreviewById(UUID newsId);
}
