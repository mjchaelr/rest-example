package com.mjchael.rest.example.repository;

import com.mjchael.rest.example.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
