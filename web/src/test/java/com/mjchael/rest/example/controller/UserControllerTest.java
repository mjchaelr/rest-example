package com.mjchael.rest.example.controller;

import com.mjchael.rest.example.model.User;
import com.mjchael.rest.example.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserController userController;

    MockMvc mockMvc;

    List<User> users;

    @BeforeEach
    void setUp() {
        users = new ArrayList<>();
        User user = new User();
        user.setLastName("test");
        user.setLastName("mike");
        users.add(user);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();

    }

    @Test
    void findAllUsers() throws Exception {
        when(userRepository.findAll()).thenReturn(users);
        ArgumentCaptor<List<User>> argumentCaptor = ArgumentCaptor.forClass(List.class);

        mockMvc.perform(get("/users"))
                .andExpect(status().isOk());

        verify(userRepository, times(1)).findAll();
        verifyNoMoreInteractions(userRepository);
    }
}