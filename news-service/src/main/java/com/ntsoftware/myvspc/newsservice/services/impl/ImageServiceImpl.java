package com.ntsoftware.myvspc.newsservice.services.impl;

import com.ntsoftware.myvspc.newsservice.entities.dao.ImageEntity;
import com.ntsoftware.myvspc.newsservice.repositories.ImageRepo;
import com.ntsoftware.myvspc.newsservice.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ImageServiceImpl implements ImageService {

    ImageRepo repository;

    @Autowired
    public ImageServiceImpl(ImageRepo repository) {
        this.repository = repository;
    }

    @Override
    public ImageEntity add(ImageEntity image) {
        return repository.save(image);
    }

    @Override
    public ImageEntity getById(UUID id) {
        return repository.getById(id);
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
