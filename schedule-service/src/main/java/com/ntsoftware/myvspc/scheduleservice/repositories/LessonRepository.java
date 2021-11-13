package com.ntsoftware.myvspc.scheduleservice.repositories;

import com.ntsoftware.myvspc.scheduleservice.entities.dao.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<LessonEntity,Long> {
    List<LessonEntity> findAllByGroupAndSubgroupAndSemester(Integer group_id,Integer subgroup, Integer semester);
    List<LessonEntity> findAllByGroupAndSubgroupAndSemesterAndDayofweek(Integer group_id, Integer subgroup, Integer semester, Integer dayofweek);
    List<LessonEntity> findAllByGroupAndSubgroupAndSemesterAndDayofweekOrderByNumberAsc(Integer group_id, Integer subgroup, Integer semester, Integer dayofweek);
}
