package com.app.service.Imple;

import com.app.authentication.CustomUserDetails;
import com.app.model.user.User;
import com.app.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceIMPTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserServiceIMP userServiceIMP;

    @Test
    void loadUserByUsername() {
        String username = "canh";
        User user = new User();
        user.setUsername(username);
        user.setPassword("PASSWORD");
        when(userRepository.findByUsername(username)).thenReturn(user);
        CustomUserDetails userDetails = (CustomUserDetails) userServiceIMP.loadUserByUsername(username);
        assertNotNull(userDetails);
        assertEquals(username, userDetails.getUsername());
        assertEquals(user.getPassword(), userDetails.getPassword());
        assertTrue(userDetails.isEnabled());
        assertTrue(userDetails.isAccountNonExpired());
        assertTrue(userDetails.isAccountNonLocked());
        assertTrue(userDetails.isCredentialsNonExpired());
    }
    @Test
    void loadUserByUsernameNotFound(){
        String username = "canh";
        when(userRepository.findByUsername(username)).thenReturn(null);
        userServiceIMP.loadUserByUsername(username);
    }


}