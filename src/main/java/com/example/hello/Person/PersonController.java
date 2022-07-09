package com.example.hello.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {
    @GetMapping
    public static List<Person> getListOfPeople() {
        return List.of(new Person(26, "Stepan", "Hello, I am Stepan"), new Person(30, "Yulia", "Helloooo!"));
    }
}