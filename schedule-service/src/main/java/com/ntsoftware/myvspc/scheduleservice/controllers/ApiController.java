package com.ntsoftware.myvspc.scheduleservice.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("health")
    public String checkHealth(){
        return "Schedule service is working.";
    }
}

