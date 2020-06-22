package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;

@Configuration
public class CarFactory {

    @Bean
    public Car dependingOnSeason() {
        Car car;
        if (MonthDay.now().isAfter(MonthDay.of(6,20)) || MonthDay.now().isBefore(MonthDay.of(9,21))) {
            car = new Cabrio();
        } else if (MonthDay.now().isAfter(MonthDay.of(12,20)) || MonthDay.now().isBefore(MonthDay.of(3,21))) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }
}

