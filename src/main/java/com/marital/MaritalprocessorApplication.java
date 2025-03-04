package com.marital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marital.domain.MaritalPersonel;
import com.marital.services.MaritalServices;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class MaritalprocessorApplication implements CommandLineRunner {

	@Autowired
	MaritalServices service;
	
	public static void main(String[] args) {
		SpringApplication.run(MaritalprocessorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.createAccount(new MaritalPersonel());
		
	}
}
