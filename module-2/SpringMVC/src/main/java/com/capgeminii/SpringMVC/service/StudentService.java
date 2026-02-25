package com.capgeminii.SpringMVC.service;

import com.capgeminii.SpringMVC.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentDAO studentdao;

    public void saveStudent(){
        studentdao.saveStudent(student);
    }
}
