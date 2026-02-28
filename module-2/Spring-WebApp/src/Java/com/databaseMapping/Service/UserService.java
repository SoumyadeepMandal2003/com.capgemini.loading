package com.databaseMapping.Service;

import com.databaseMapping.Model.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(long id);
    void addUser(User user);
}
