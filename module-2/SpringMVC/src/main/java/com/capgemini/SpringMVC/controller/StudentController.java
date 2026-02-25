package com.capgemini.SpringMVC.controller;

import com.capgemini.SpringMVC.model.Student;
import com.capgemini.SpringMVC.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public String register(@ModelAttribute Student student, Model model) {
        // MVC Flow - @ModelAttribute binds form data to Student Object
        studentService.saveStudent(student);

        // MVC flow - Model sends data to JSP View
        model.addAttribute("name", student.getName());
        return "success";
    }

    @GetMapping("/register")
    public String showForm(){
        return "register";
    }
}