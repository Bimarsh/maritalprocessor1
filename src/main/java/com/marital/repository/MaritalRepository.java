package com.marital.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marital.domain.MaritalPersonel;

public interface MaritalRepository extends MongoRepository<MaritalPersonel, String> {
	
	List<MaritalPersonel> findByAgeLessThanAndGenderNot(String age, String gender);

}
