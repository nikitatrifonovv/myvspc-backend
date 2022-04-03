package com.ntsoftware.myvspc.newsservice.services;

import com.ntsoftware.myvspc.newsservice.entities.dao.ImageEntity;

import java.util.UUID;

public interface ImageService {
    ImageEntity add(ImageEntity image);
    ImageEntity getById(UUID id);
    void deleteById(UUID id);
}
