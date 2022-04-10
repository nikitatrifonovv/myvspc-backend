package com.ntsoftware.myvspc.newsservice.repositories;

import com.ntsoftware.myvspc.newsservice.entities.dao.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImageRepo extends JpaRepository<ImageEntity, UUID> {

}
