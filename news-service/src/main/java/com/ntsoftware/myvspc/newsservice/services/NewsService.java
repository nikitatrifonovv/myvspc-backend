package com.ntsoftware.myvspc.newsservice.services;


import com.ntsoftware.myvspc.newsservice.entities.dao.NewsEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NewsService {
    NewsEntity addNews(NewsEntity entity);
    List<NewsEntity> addAllNews(List<NewsEntity> entities);
    Optional<NewsEntity> getNewsById(UUID id);
    List<NewsEntity> getAllNews();
    List<NewsEntity> getAllNewsSortedByTime();
    void deleteNewsById(UUID id);
}
