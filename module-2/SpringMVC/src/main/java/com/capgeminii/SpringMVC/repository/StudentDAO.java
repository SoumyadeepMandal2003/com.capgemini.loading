package com.capgeminii.SpringMVC.repository;

import com.capgeminii.SpringMVC.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

    public void saveStudent(Student student) {
        System.out.println("Saved to DB: " + student.getName());
    }
}
