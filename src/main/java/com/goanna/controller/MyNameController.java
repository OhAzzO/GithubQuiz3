package com.goanna.controller;

import com.goanna.controller.Entity.MyName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

    private static final String template = "Hello my name is, %s!";

    @GetMapping("/testime")
    public MyName myName(@RequestParam(value = "name", defaultValue = "Ofego") String name) {
        return new MyName(String.format(template, name));
    }
}