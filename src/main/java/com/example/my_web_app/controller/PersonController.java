package com.example.my_web_app.controller;

import com.example.my_web_app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    /*@GetMapping("/print/eng")
    public String printEng(Locale locale) {
        Person person = service.findPerson();
        String s = "<h1>" + person.getNameEng() + " </h1>\n<a href=\"http://localhost:8090/\">Back</a>";
        return locale.toString();
    }

    @GetMapping("/print/ukr")
    public String printUkr(Locale locale) {
        Person person = service.findPerson();
        String s = "<h1>" + person.getNameUkr() + " </h1>\n<a href=\"http://localhost:8090/\">Повернутися</a>";
        return locale.toString();
    }*/
}