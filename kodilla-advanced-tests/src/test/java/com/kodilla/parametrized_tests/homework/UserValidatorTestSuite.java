package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"xyz", "Lato2007", "mi.ks93", "ar-rtur-rO", "k_a_m-y-k111"})
    public void shouldReturnTrueForCorrectUserNameContent(String userName) {
        assertTrue(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"amix123@bingo.com", "r.a1234@tlen.pl", "ab_c@fiufiu.fr"})
    public void shouldReturnTrueForCorrectEmailContent(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "1b", "amir!@#$%^&*()", "wąskięwicz", "ąęźć", " "})
    public void shouldReturnFalseForIncorrectUserNameContent(String userName) {
        assertFalse(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"88alva@op.pl", "amigosrigos", "@zuzi.ro", "antek@radar", "ąźć@bravo.pl", " "})
    public void shouldReturnFalseForIncorrectEmailContent(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

}