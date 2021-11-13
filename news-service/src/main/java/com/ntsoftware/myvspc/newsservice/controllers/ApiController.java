package com.ntsoftware.myvspc.newsservice.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("health")
    public String checkHealth(){
        return "News service is working.";
    }
}

