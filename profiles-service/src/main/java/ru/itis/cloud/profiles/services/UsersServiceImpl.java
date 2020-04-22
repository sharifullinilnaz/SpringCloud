package ru.itis.cloud.profiles.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.cloud.profiles.dto.User;
import org.springframework.stereotype.Service;
import ru.itis.cloud.profiles.repository.UsersRepository;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getUsers() {
        return usersRepository.findAll();
    }

}
