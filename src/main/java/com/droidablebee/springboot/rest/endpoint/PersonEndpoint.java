package com.droidablebee.springboot.rest.endpoint;

import com.droidablebee.springboot.rest.controller.JSONRequest;
import com.droidablebee.springboot.rest.controller.JSONResponse;
import com.droidablebee.springboot.rest.controller.Test;
import com.droidablebee.springboot.rest.controller.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.droidablebee.springboot.rest.service.PersonServiceImpl;
import org.springframework.web.context.annotation.RequestScope;

@RestController

public class PersonEndpoint  {

	@Autowired
	TestService tt;
	@Autowired
	JSONResponse ans1;
	@Autowired
	JSONResponse ans2;
	@Autowired
	JSONRequest req;


	@GetMapping("/test")
	public String justTest(){

		long id = 12;


		System.out.println(tt.getAllPersons(id));


		return tt.getAllPersons(id);
	}

	@RequestScope
	@PostMapping("/test2")
	public JSONResponse test2(String a){

		req.calc(a,"test2");

		return ans1;
	}

    @RequestScope
	@PostMapping("/test3")
	public JSONResponse test3(String b){

		req.calc2(b,"test3");
		return ans2;
	}


}