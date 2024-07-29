package com.user.crud.controller;

import com.user.crud.model.Users;
import com.user.crud.repository.UsersRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = { "/{id}" })
    public ResponseEntity getById(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

  
}
