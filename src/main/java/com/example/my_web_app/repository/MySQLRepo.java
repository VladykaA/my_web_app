package com.example.my_web_app.repository;

import com.example.my_web_app.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface MySQLRepo extends CrudRepository<Person, Integer> {
}
