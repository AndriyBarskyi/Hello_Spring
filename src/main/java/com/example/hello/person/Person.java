package com.example.hello.person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private Integer age;
    private String name;
    private String greeting;
}
