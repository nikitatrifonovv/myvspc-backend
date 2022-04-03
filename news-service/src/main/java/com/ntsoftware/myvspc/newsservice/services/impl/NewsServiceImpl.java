package com.ntsoftware.myvspc.newsservice.services.impl;

import com.ntsoftware.myvspc.newsservice.entities.dao.NewsEntity;
import com.ntsoftware.myvspc.newsservice.repositories.NewsRepo;
import com.ntsoftware.myvspc.newsservice.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NewsServiceImpl implements NewsService {

    NewsRepo repository;

    @Autowired
    public NewsServiceImpl(NewsRepo newsRepository) {
        this.repository = newsRepository;
    }

    @Override
    public NewsEntity addNews(NewsEntity entity) {
        return repository.save(entity);
    }

    @Override
    public List<NewsEntity> addAllNews(List<NewsEntity> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public Optional<NewsEntity> getNewsById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public List<NewsEntity> getAllNews() {
        return repository.findAll();
    }

    @Override
    public List<NewsEntity> getAllNewsSortedByTime() {
        return null;
    }

    @Override
    public void deleteNewsById(UUID id) {
        repository.deleteById(id);
    }
}
