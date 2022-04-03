package com.ntsoftware.myvspc.newsservice.controllers;

import com.google.gson.Gson;
import com.ntsoftware.myvspc.newsservice.entities.AssembledNewsPreview;
import com.ntsoftware.myvspc.newsservice.entities.dao.BlockEntity;
import com.ntsoftware.myvspc.newsservice.requests.AssembledNewsRequest;
import com.ntsoftware.myvspc.newsservice.services.AssembleService;
import com.ntsoftware.myvspc.newsservice.services.BlocksService;
import com.ntsoftware.myvspc.newsservice.services.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/news", produces = MediaType.APPLICATION_JSON_VALUE)
public class NewsController {
    Logger logger = LoggerFactory.getLogger(NewsController.class);
    Gson serializer = new Gson();

    NewsService newsService;
    BlocksService blocksService;

    AssembleService assembleService;

    @Autowired
    public NewsController(NewsService newsService, BlocksService blocksService) {
        this.newsService = newsService;
        this.blocksService = blocksService;
    }

    @PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody AssembledNewsRequest body) {
        assembleService.disassembleAndSave(body);
        logger.info("Added new news: " + serializer.toJson(body));

    }

    @GetMapping(value = "/blocks", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BlockEntity> getAllBlocksByNewsId(@RequestParam(name = "news_id") UUID newsId) {
        return assembleService.assembleAllBlocksByNews(newsId);
    }

    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AssembledNewsPreview> getAllSimpleNews() {
        return assembleService.assembleAllNewsPreview();
    }
}
