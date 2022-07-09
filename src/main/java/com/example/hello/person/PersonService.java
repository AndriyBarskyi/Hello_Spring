package com.example.hello.person;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@Service
public class PersonService {
    @GetMapping
    public static List<Person> getListOfPeople() {
        return List.of(new Person(26, "Stepan", "Hello, I am Stepan"), new Person(30, "Yulia", "Helloooo!"));
    }
}
