package com.mjchael.rest.example.bootstrap;

import com.mjchael.rest.example.model.User;
import com.mjchael.rest.example.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User mike = new User();
        mike.setFirstName("John");
        mike.setLastName("Doe");
        userRepository.save(mike);

    }
}
