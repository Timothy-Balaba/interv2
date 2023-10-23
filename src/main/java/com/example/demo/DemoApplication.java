package com.example.demo;

import com.example.demo.service.MyApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

//	@Override
//	public void run(String... args) throws Exception {
//		var myApiService=new MyApiService();
//		var users=myApiService.fetchDataFromApi();
//		System.out.println(users);
//	}
}
