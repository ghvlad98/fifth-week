package spring.react.service;

import spring.react.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> getUserById(String id);


    User create(User user);
}
