package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void packageShouldBeNotDeliveredIfHerWeightIsAbove30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testResult = bean.sendPackage("Kownackiego 5, Poznań", 30.01);
        Assertions.assertEquals("Package not delivered to: Kownackiego 5, Poznań", testResult);
    }


    @Test
    public void packageShouldBeDeliveredIfHerWeightIsUnder30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testResult = bean.sendPackage("Kownackiego 5, Poznań", 29.99);
        Assertions.assertEquals("Package delivered to: Kownackiego 5, Poznań", testResult);
    }

    @Test
    public void parametersShouldBeNotNull() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testResult = bean.sendPackage("Kownackiego 5, Poznań", 29.99);
        Assertions.assertNotNull(testResult);
    }

    @Test
    public void providedAddressIsNotTheSame() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testResult = bean.sendPackage("Kownackiego 5", 50.01);
        Assertions.assertNotEquals("Kownackiego 5, Poznań", testResult);
    }
}
