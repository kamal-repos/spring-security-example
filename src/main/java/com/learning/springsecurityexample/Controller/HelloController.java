package com.learning.springsecurityexample.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    @PreAuthorize("hasAnyRole('admin')")
    @GetMapping("/admin")
    public String sayHelloForAdmin(){
        return "Hello to Admin from rest service!";
    }

    @PreAuthorize("hasAnyRole('user')")
    @GetMapping("/user")
    public String sayHelloForUser(){
        return "Hello to User from rest service!";
    }
}
