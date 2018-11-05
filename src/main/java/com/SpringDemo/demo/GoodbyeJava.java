package com.SpringDemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/goodbye")
public class GoodbyeJava {

    @GetMapping("/goodbye")
    public String Goodbye() {
        return "Goodbye World!";
    }
}

