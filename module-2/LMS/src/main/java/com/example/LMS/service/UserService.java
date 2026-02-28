package com.example.LMS.service;

import com.example.LMS.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();
    private Long idCounter = 1L;

    public void register(User user) {
        user.setId(idCounter++);
        users.add(user);
    }

    public boolean login(String email, String password) {
        return users.stream()
                .anyMatch(u -> u.getEmail().equals(email)
                        && u.getPassword().equals(password));
    }
}