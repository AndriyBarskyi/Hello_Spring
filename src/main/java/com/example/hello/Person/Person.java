package com.example.hello.Person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private Integer age;
    private String name;
    private String greeting;
}
