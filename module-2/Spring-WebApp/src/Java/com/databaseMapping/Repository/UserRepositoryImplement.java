package com.databaseMapping.Repository;

public class UserRepositoryImplement implements UserRepository {
    users.add(new User(2L, "Jane Smith", "jane@gmail.com"));

    @Override
    public List<User> findAll(){
        return users;
    }

    @Override
    public User findById(Long id){
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(User user){
        users.add(user);
    }
}
