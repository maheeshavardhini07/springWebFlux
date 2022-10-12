package com.kgisl.webflux2.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.webflux2.entity.StudentMongo;

@Repository
public interface StudentRepository extends ReactiveMongoRepository<StudentMongo, String>{
    
}
