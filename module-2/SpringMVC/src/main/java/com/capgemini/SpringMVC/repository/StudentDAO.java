package com.capgemini.SpringMVC.repository;

import com.capgemini.SpringMVC.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

    public void saveStudent(Student student) {
        System.out.println("Saved to DB: " + student.getName());
    }
}
