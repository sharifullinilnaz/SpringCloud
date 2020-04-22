package ru.itis.cloud.profiles.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.cloud.profiles.dto.User;
import ru.itis.cloud.profiles.services.UsersService;

import java.util.List;

@RestController
@Slf4j
public class ProfilesController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/profiles")
    public List<User> getUsers() {
        log.info("Get request");
        return usersService.getUsers();
    }
}

