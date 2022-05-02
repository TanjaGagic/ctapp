package com.javatpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.HelloWorld;
import com.javatpoint.repository.GreetingRepository;



@Service
public class GreetingService {

	@Autowired


	GreetingRepository greetingRepository;
	
	public HelloWorld getGreetingById(int id)   
	{  
	return greetingRepository.findById(id).get();  
	}  
}
