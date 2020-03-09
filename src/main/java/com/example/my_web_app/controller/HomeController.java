package com.example.my_web_app.controller;

import com.example.my_web_app.model.Person;
import com.example.my_web_app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private PersonService service;

    @RequestMapping(value = { "/", "/homePage" })
    public String staticResource(Model model) {
        Person person = service.findPerson();

        return "homePage";
    }
}