package com.ntsoftware.myvspc.scheduleservice.repositories;

import com.ntsoftware.myvspc.scheduleservice.entities.dao.CallsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallsRepository extends JpaRepository<CallsEntity,Integer> {
}
