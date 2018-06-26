package com.droidablebee.springboot.rest.controller;

import com.droidablebee.springboot.rest.domain.Person;
import com.droidablebee.springboot.rest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("testService")
public class Test implements TestService{


    @Autowired
    private PersonService personService;

    @Override
    public String getAllPersons(Long id){

        String ps = personService.findOne(id);

        return ps;
    }
}
