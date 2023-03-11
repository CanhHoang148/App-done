package com.app.controll;

import com.app.model.entity.Center;
import com.app.model.response.ResponseObject;
import com.app.service.CenterService;
import com.app.service.Imple.CenServiceIMP;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CenterControllerTest {
    @Mock
    CenterService centerService;
    @InjectMocks
    CenServiceIMP cenServiceIMP;
    @Test
    void getAllCenter() {

    }

    @Test
    void addCenter() {
    }

    @Test
    void editCenter() {
    }

    @Test
    void delete() {

    }

    @Test
    void getAllFresherOfCenter() {
    }
}