package ru.pyzhov.UserControlAPI.service.impl;

import ru.pyzhov.UserControlAPI.model.User;
import ru.pyzhov.UserControlAPI.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(String email) {
        // todo
    }
}
