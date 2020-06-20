package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldAdded() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double testValue = bean.add(2,2);
        Assertions.assertEquals(4, testValue, 0.01);
    }

    @Test
    public void shouldSubtracted() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double testValue = bean.subtract(2,10);
        Assertions.assertEquals(-8, testValue, 0.01);
    }

    @Test
    public void shouldMultiplied() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double testValue = bean.multiply(0,10);
        Assertions.assertEquals(0, testValue, 0.01);
    }

    @Test
    public void shouldDivided() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double testValue = bean.divide(50,100);
        Assertions.assertEquals(0.5, testValue, 0.01);
    }
}
