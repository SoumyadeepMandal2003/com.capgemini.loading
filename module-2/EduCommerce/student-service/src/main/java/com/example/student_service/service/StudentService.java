package com.example.student_service.service;


import com.example.student_service.entity.Student;
import com.example.student_service.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Student register(Student student){

        return repository.save(student);

    }

    public List<Student> getAll(){

        return repository.findAll();

    }

    public Student getById(Long id){

        return repository.findById(id).orElseThrow();

    }

}