package com.example.demo;

import com.example.demo.controller.ProfileController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = "spring.profiles.active=test")
@ExtendWith(SpringExtension.class)
public class ProfileControllerTest {

    @Autowired
    private ProfileController profileController;

    @Test
    public void testProfileMessage() {
        String expectedMessage = "Welcome to the Test Environment!";
        String actualMessage = profileController.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}

