package com.springprofile.SpringBootProfileDemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfilerController {
    @Value("${spring.profile.constant}")
    private String profile;
    @GetMapping("/profiles")
    public String profileDemo(){
        return "Name of profile is::"+profile;
    }
}
