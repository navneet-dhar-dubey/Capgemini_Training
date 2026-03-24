package com.dhardubey.mockito_training.service;

import java.util.List;

import com.dhardubey.mockito_training.model.Training;

public interface TrainingService {
	List<Training> findByTopic(String topic);
	Training findById(int trainingId);
	Training addTraining(Training training);
	Training updateTraining(Training training);
	boolean deleteTraining(int trainingId);
}

