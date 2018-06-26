package com.droidablebee.springboot.rest.service;

import com.droidablebee.springboot.rest.domain.Person;
import com.droidablebee.springboot.rest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



public interface PersonService {

    String findOne(Long id);
    Person save(Person person);
}
