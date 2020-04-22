package ru.itis.cloud.profiles.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.cloud.profiles.dto.User;
import java.util.List;


public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAll();
}