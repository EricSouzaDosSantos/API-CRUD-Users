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
    public ResponseEntity GetById(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Users PostUsers(@RequestBody Users users){
            Users user = repository.save(users);
            System.out.println("User Registered with sucessfully");
            return user;
    }

    /* @PutMapping("/{id}")
    public ResponseEntity<Users> UpdateById(@RequestBody Users user, @PathVariable("id") long id){

    }*/
    @PutMapping
    public Users UpdatePet(@RequestBody Users user) {
        if (user.getId() > 0) {
            System.out.println("User updated with sucessfully");
            return repository.save(user);
        }
        return null;
    }

}
