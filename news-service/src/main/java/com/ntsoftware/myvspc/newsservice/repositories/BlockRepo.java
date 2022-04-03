package com.ntsoftware.myvspc.newsservice.repositories;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlockRepo extends JpaRepository<BlockEntity, UUID> {

}
