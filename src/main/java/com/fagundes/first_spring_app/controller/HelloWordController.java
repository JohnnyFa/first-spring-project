package com.fagundes.first_spring_app.controller;

import com.fagundes.first_spring_app.domain.User;
import com.fagundes.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Jon Doe");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "") String filter, @RequestBody User body) {
        return "Hello World Post " + body.getName() + id + filter;
    }
}
