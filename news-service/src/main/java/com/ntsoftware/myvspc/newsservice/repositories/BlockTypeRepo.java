package com.ntsoftware.myvspc.newsservice.repositories;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlockTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockTypeRepo extends JpaRepository<BlockTypeEntity, Long> {

}
