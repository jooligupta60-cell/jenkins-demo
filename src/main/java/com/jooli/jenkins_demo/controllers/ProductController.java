package com.jooli.jenkins_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product")
    public String Product(){
        return "Hello Prodcut";
    }
}
