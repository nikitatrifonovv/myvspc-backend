package com.ntsoftware.myvspc.newsservice.services.impl;

import com.ntsoftware.myvspc.newsservice.entities.dao.NewsEntity;
import com.ntsoftware.myvspc.newsservice.repositories.NewsRepository;
import com.ntsoftware.myvspc.newsservice.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsRepository newsRepository;

    @Override
    public NewsEntity addNews(NewsEntity entity) {
        return newsRepository.save(entity);
    }

    @Override
    public List<NewsEntity> addAllNews(List<NewsEntity> entities) {
        return newsRepository.saveAll(entities);
    }

    @Override
    public List<NewsEntity> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public List<NewsEntity> getAllNewsSortedByTime() {
        return null;
    }

    @Override
    public void deleteNewsById(long id) {
        newsRepository.deleteById(id);
    }
}
