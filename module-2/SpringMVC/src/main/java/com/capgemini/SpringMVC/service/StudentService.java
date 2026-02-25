package com.capgemini.SpringMVC.service;

import com.capgemini.SpringMVC.model.Student;
import com.capgemini.SpringMVC.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentdao;

    public void saveStudent(Student student) {
        studentdao.saveStudent(student);
    }
}