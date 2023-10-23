package com.example.demo.service;

import com.example.demo.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MyApiService {

    private final String apiUrl="https://jsonplaceholder.typicode.com/users";
    @Autowired
    private RestTemplate restTemplate;

    public List<User> fetchDataFromApi() throws JsonProcessingException {
        String response=restTemplate.getForObject(apiUrl, String .class);
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.readValue(response, new TypeReference<List<User>>() {
        });
    }
}
