package com.user.crud.repository;

import com.user.crud.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Long> {

}
