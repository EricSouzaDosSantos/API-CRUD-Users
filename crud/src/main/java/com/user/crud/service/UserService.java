package com.user.crud.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public static String FormatCPF(String cpf){
        cpf = cpf.replaceAll("[^0-9]", ""); // Remover caracteres não numéricos
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
}
