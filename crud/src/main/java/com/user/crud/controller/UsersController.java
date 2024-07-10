package com.user.crud.controller;

import com.user.crud.model.Users;
import com.user.crud.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UsersController {

    @Autowired
    public UsersRepository repository;

    @GetMapping
    public List<Users> GetAllUsers() {
        List<Users> users = repository.findAll();
        return users;
    }
}
