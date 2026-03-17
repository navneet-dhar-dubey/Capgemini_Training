package com.gal.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gal.model.Training;

public interface TrainingRepository extends JpaRepository<Training,Integer>{

    @Query("SELECT course FROM Training course WHERE course.topic LIKE %:topicSearch%")
    List<Training> searchByCourseTopic(String topicSearch);

    @Query("SELECT course FROM Training course WHERE course.endDate >= :fromDate")
    List<Training> fetchActiveAndFuture(LocalDate fromDate);

}