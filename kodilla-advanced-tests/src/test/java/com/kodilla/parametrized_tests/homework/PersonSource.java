package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {

    static Stream<Arguments> provideKilogramsDataForBMI() {
        return Stream.of(
                Arguments.of(new Person(1.70, 60.0), "Normal (healthy weight)"),
                Arguments.of(new Person(1.60, 90.0), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.60, 45.0), "Underweight")
        );
    }
}
