package com.example.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ApplicationContextTest {

    @Test
    void testApplicationContext() {

        ApplicationContext context = new AnnotationConfigApplicationContext(HeloWordConfirguration.class);

        Assertions.assertNotNull(context);
        
    }
}
