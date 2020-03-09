package com.example.my_web_app.service;

import com.example.my_web_app.model.Person;
import com.example.my_web_app.repository.MySQLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private MySQLRepo repo;

    public Person findPerson() {
        return repo.findById(1).get();
    }
}
