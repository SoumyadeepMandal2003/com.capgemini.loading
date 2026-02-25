package com.capgeminii.SpringMVC.controller;

import ch.qos.logback.core.model.Model;
import com.capgeminii.SpringMVC.model.Student;
import com.capgeminii.SpringMVC.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public String register(@ModelAttribute Student student, Model model) {
        //MVC Flow - @ModelAttribute binds form data to Student Object
        studentService.saveStudent(student);

        //1.MVC flow - Model sends data to JSP View
        model.addAttribute("name", student.getName());
        return "Success";

    }

}
