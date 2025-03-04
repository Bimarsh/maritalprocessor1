package com.marital.repository;

import java.util.List;


import com.marital.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {

    List<User> findByGender(String gender);

}
