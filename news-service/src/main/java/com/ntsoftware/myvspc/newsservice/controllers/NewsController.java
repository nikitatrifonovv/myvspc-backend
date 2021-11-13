package com.ntsoftware.myvspc.newsservice.controllers;

import com.google.gson.Gson;
import com.ntsoftware.myvspc.newsservice.entities.SimpleNews;
import com.ntsoftware.myvspc.newsservice.requests.NewsMetaBlocksRequest;
import com.ntsoftware.myvspc.newsservice.responses.SimpleNewsResponse;
import com.ntsoftware.myvspc.newsservice.responses.factories.BlocksFactory;
import com.ntsoftware.myvspc.newsservice.responses.factories.SimpleNewsFactory;
import com.ntsoftware.myvspc.newsservice.responses.interfaces.INewsFactory;
import com.ntsoftware.myvspc.newsservice.services.BlocksService;
import com.ntsoftware.myvspc.newsservice.services.MetaDataService;
import com.ntsoftware.myvspc.newsservice.services.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/news", produces = MediaType.APPLICATION_JSON_VALUE)
public class NewsController {

    Logger logger = LoggerFactory.getLogger(NewsController.class);

    Gson serializer = new Gson();

    @Autowired
    NewsService newsService;

    @Autowired
    MetaDataService metaDataService;

    @Autowired
    BlocksService blocksService;

    @PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody NewsMetaBlocksRequest request) {

        request.getNews().setMeta_data(metaDataService.addMetaData(request.getMeta()).getId());

        //id новости
        long n_id = newsService.addNews(request.getNews()).getId();

        //Установка свзяи между новостью и блоком
        for(var block: request.getBlocks()){
            block.setNews(n_id);
            blocksService.addBlock(block);
        }

        request.getNews().setMeta_data(metaDataService.addMetaData(request.getMeta()).getId());

        newsService.addNews(request.getNews());
        logger.info("Added new news: " + serializer.toJson(request));

    }

    @GetMapping(value = "allblocks", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllBlocks(){
        return serializer.toJson(blocksService.getAllBlocks());
    }

    @GetMapping(value = "/blocks", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllBlocksByNewsId(@RequestParam(name = "news_id") long news_id) {

        BlocksFactory blocksFactory = new BlocksFactory(blocksService);
        return serializer.toJson(blocksFactory.getAllBlocksByNewsId(news_id));
    }

    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SimpleNews> getAllSimpleNews() {

        INewsFactory simpleNewsFactory = new SimpleNewsFactory(newsService,metaDataService);

        SimpleNewsResponse response = (SimpleNewsResponse) simpleNewsFactory.createNewsResponse();

        return response.getNewsList();
    }
}
