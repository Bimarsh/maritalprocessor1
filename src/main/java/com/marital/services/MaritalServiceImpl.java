package com.marital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marital.domain.MaritalPersonel;
//import com.marital.repository.MaritalRepository;

@Service
public class MaritalServiceImpl implements MaritalServices {

//	@Autowired
//	MaritalRepository repository;
	
	
	@Override
	public void createAccount(MaritalPersonel person) {
//		repository.save(person);

	}

	@Override
	public void createMatch(MaritalPersonel person) {
		

	}

}
