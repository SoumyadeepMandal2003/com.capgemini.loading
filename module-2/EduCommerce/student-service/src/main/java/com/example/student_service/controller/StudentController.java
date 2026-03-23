package com.example.student_service.controller;


import com.example.student_service.entity.Student;
import com.example.student_service.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id){

        return service.getById(id);

    }

}