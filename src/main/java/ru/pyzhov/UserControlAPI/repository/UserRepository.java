package ru.pyzhov.UserControlAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pyzhov.UserControlAPI.model.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    void deleteByEmail(String email);
}
