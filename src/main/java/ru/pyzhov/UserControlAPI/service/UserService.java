package ru.pyzhov.UserControlAPI.service;

import ru.pyzhov.UserControlAPI.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserByEmail(String email);

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(String email);
}
