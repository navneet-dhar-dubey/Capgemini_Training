package com.dhardubey.mockito_training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhardubey.mockito_training.model.Training;

public interface TrainingRepo extends JpaRepository<Training, Integer>{
  
}
