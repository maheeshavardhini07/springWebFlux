package com.kgisl.webflux2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.webflux2.entity.StudentMongo;
import com.kgisl.webflux2.repository.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Flux<StudentMongo> getAll() {
        return studentRepository.findAll();
       }
      public Mono<StudentMongo> getById(String id) {
        return studentRepository.findById(id);
       }
      public Mono<StudentMongo> update(String id, StudentMongo student) {
        return studentRepository.save(student);
       }
      public Mono<StudentMongo> save(StudentMongo student) {
        return studentRepository.save(student);
       }
       
       public Mono<Void> delete(String id) {
        return studentRepository.deleteById(id);
       }
}
