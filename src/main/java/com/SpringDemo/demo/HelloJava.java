package com.SpringDemo.demo;

import com.SpringDemo.demo.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloJava {

    @GetMapping
    public String Hello() {
        return "Hello World!";
    }

    @PostMapping("SavePerson")
    public @ResponseBody Person savePerson(@RequestBody Person person) {

    }
}
