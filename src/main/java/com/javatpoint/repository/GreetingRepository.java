package com.javatpoint.repository;
	import org.springframework.data.repository.CrudRepository;  
	import com.javatpoint.model.HelloWorld;  
	public interface GreetingRepository extends CrudRepository<HelloWorld, Integer>  
	{  
	}  
	

