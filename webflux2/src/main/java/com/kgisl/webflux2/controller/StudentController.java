package com.kgisl.webflux2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.webflux2.entity.StudentMongo;
import com.kgisl.webflux2.service.StudentService;

// import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/students")
// @AllArgsConstructor
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Flux<StudentMongo> getAll() {
        System.out.println("::GET_ALL Students::");
        return studentService.getAll();
    
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Mono<StudentMongo> getById(@PathVariable("id") String id) {
        System.out.println("::Will Return a StudentMongo::");
        return studentService.getById(id);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CONTINUE)
    public Mono<StudentMongo> updateById(@PathVariable("id") final String id, @RequestBody final StudentMongo student) {
        System.out.println("::Update the StudentMongo record::");
        return studentService.update(id, student);
    }
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<StudentMongo> save(@RequestBody final StudentMongo student) {
        return studentService.save(student);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public Mono<Void> delete(@PathVariable String id) {
        System.out.println("::Will delete a StudentMongo::");
        return studentService.delete(id);
    }
}
