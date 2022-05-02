package com.javatpoint.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.model.HelloWorld;
import com.javatpoint.service.GreetingService;




@RestController
public class HelloWorldController {

	@RequestMapping(value="/hello-rest")
	public static String SecondTask() {
	    return "Hello World!!";
	}
	
	@RequestMapping("/hello")
    public ModelAndView ThirdTask() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Helloworld");
        return modelAndView;
    }  
	
	@Autowired  
	GreetingService greetingService;
	
	@GetMapping("/hello/{id}")  
	private HelloWorld getGreeting(@PathVariable("id") int id)   
	{  
	return greetingService.getGreetingById(id);
	}  
} 
