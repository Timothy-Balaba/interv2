package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.MyApiService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ControllerClass {
    @Autowired
    private MyApiService myApiService;

    @GetMapping()
    public List<User> getusers() throws JsonProcessingException {
        var users=myApiService.fetchDataFromApi();
        return users;
    }
}
