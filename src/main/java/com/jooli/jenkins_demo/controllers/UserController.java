package com.jooli.jenkins_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping("/home")
    public String Home(){
        return "Hello World"
;    }
}
