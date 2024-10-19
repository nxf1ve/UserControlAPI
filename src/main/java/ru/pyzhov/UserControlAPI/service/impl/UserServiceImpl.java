package ru.pyzhov.UserControlAPI.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pyzhov.UserControlAPI.model.User;
import ru.pyzhov.UserControlAPI.repository.UserRepository;
import ru.pyzhov.UserControlAPI.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(String email) {
        userRepository.deleteByEmail(email);
    }
}
