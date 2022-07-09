package com.example.hello;

import com.example.hello.Person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class HelloApplicationTests {

    @Test
    void testSayHello() {
        Person person = new Person(22, "Andriy", "Hello, World!");
        Assert.isTrue("Hello, World!".equals(person.getGreeting()),
                "Message for hello world program test");
    }

}
