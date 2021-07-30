package com.goanna.controller;

import com.goanna.controller.Entity.MyName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

    //private static final String template = "Hello my name is, %s!";

    @GetMapping("/testime")
    public String myName(@RequestParam(value = "name", defaultValue = "Azza") String name) {
        return "Hey my name is: " + (new MyName(name)).getName();
    }
}