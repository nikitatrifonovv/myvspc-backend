package com.ntsoftware.myvspc.newsservice.services.impl;

import com.ntsoftware.myvspc.newsservice.entities.AssembledNewsPreview;
import com.ntsoftware.myvspc.newsservice.entities.dao.BlockEntity;
import com.ntsoftware.myvspc.newsservice.repositories.NewsTypeRepo;
import com.ntsoftware.myvspc.newsservice.requests.AssembledNewsRequest;
import com.ntsoftware.myvspc.newsservice.services.AssembleService;
import com.ntsoftware.myvspc.newsservice.services.BlocksService;
import com.ntsoftware.myvspc.newsservice.services.ImageService;
import com.ntsoftware.myvspc.newsservice.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AssembleServiceImpl implements AssembleService {

    NewsService newsService;
    BlocksService blocksService;
    ImageService imageService;

    NewsTypeRepo typeRepository;

    @Autowired
    public AssembleServiceImpl(NewsService newsService, BlocksService blocksService, ImageService imageService, NewsTypeRepo typeRepository) {
        this.newsService = newsService;
        this.blocksService = blocksService;
        this.imageService = imageService;
        this.typeRepository = typeRepository;
    }

    @Override
    public void disassembleAndSave(AssembledNewsRequest request) {
        var news = newsService.addNews(request.getNews());
        var blocks = request.getBlocks();
        for (var block : blocks) {
            block.setNewsId(news.getId());
        }
        blocksService.addBlocks(blocks);
    }

    @Override
    public List<BlockEntity> assembleAllBlocksByNews(UUID newsId) {
        return blocksService.getAllBlocksByNewId(newsId);
    }

    @Override
    public List<AssembledNewsPreview> assembleAllNewsPreview() {
        var allNews = newsService.getAllNews();
        List<AssembledNewsPreview> assembledNewsPreviews = new ArrayList<>();
        for (var n : allNews) {
            var assembledNewsPreview = AssembledNewsPreview.builder()
                            .newsId(n.getId())
                            .title(n.getTitle())
                            .subTitle(n.getSubTitle())
                            .createdAt(n.getCreatedAt())
                            .creator(n.getCreator())
                            .type(n.getType())
                            .typeName(typeRepository.getById(n.getType()).getName())
                            .imageId(n.getImagePreviewId())
                            .build();
            assembledNewsPreviews.add(assembledNewsPreview);
        }
        assembledNewsPreviews.sort((o1, o2) -> o2.getCreatedAt().compareTo(o1.getCreatedAt()));

        return assembledNewsPreviews;
    }
}
