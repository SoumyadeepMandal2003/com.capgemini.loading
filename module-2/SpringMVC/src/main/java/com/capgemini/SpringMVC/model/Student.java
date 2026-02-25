package com.capgemini.SpringMVC.model;



public class Student {

    private String name;
    private String email;

    // Default constructor is required by Spring for form binding
    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}