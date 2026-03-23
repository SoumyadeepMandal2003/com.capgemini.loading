package com.example.student_service.controller;


import com.example.student_service.dto.AuthRequest;
import com.example.student_service.dto.AuthResponse;
import com.example.student_service.entity.Student;
import com.example.student_service.repository.StudentRepository;
import com.example.student_service.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final StudentRepository repository;
    private final JwtService jwtService;

    @PostMapping("/register")
    public Student register(@RequestBody Student student){

        return repository.save(student);

    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request){

        Student student = repository
                .findByEmail(request.getEmail())
                .orElseThrow();

        if(!student.getPassword().equals(request.getPassword())){
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtService.generateToken(student.getEmail());

        return new AuthResponse(token);
    }

}