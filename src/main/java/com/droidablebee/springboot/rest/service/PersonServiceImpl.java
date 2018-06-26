package com.droidablebee.springboot.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.droidablebee.springboot.rest.domain.Person;
import com.droidablebee.springboot.rest.repository.PersonRepository;

@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService{

	@Autowired 
	private PersonRepository repository;


	@Override
	public String findOne(Long id) {

		System.out.println(repository.findAll());
		return "hello";
	}

	@Override
	public Person save(Person person) {
		
		return repository.saveAndFlush(person);
	}
}
