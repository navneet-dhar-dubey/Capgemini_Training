package com.dhardubey.mockito_training.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhardubey.mockito_training.model.Training;
import com.dhardubey.mockito_training.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {
	private TrainingService trainingService;
	
	@Autowired
	public TrainingController(TrainingService trainingService) {
		super();
		this.trainingService = trainingService;
	}
	
	
	@GetMapping("/{trainingid}")
	Training findById(@PathVariable int trainingid)
	{
		
		return trainingService.findById(trainingid);
	}
	
	
}
