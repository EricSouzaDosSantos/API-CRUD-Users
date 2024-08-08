package com.user.crud.controller;

import com.user.crud.model.Users;
import com.user.crud.repository.UsersRepository;
import com.user.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UsersController {

    @Autowired
    public UsersRepository repository;

    @Autowired
    public UserService userService;

    //método responsavél por retornar todos os usuários cadastrados na banco h2
    @GetMapping
    public List<Users> GetAllUsers() {
        List<Users> users = repository.findAll();
        return users;
    }

    //Retorna um usuário especifico através do id dele
    @GetMapping(path = { "/{id}" })
    public ResponseEntity GetById(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    //método responsavél por salvar os usuários no h2
    @PostMapping
    public Users PostUsers(@RequestParam String name,
                           @RequestParam String cpf,
                           @RequestParam String birthDate,
                           @RequestParam String email){
            Users user = new Users();
            user.setName(name);
            String CPFFormat = userService.FormatCPF(cpf);
            String BirthFormat = userService.FormatBirthDate(birthDate);
            user.setCpf(CPFFormat);
            user.setBirthDate(BirthFormat);
            user.setEmail(email);
            System.out.println("User Registered with sucessfully");
            return repository.save(user);
    }

    //método responsaavél por atualizar algum usuário já cadastrado no h2
    @PutMapping
    public Users UpdatePet(@RequestBody Users user) {
        if (user.getId() > 0) {
            System.out.println("User updated with sucessfully");
            return repository.save(user);
        }
        return null;
    }

    //método responsavél por deletar um usuário especifico através do seu id
    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity <?> DeleteById(@PathVariable long id) {
        System.out.println("User deleted with sucessfully");
        System.out.println("User "+repository.findById(id)+" deleted with sucessfully");
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
