package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    private Calculator calculator = new Calculator();
    int a = 5;
    int b = 8;

    @Test
    public void testSum() {
        //Given
        //When
        int sumResult = calculator.sum(a, b);
        //Then
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        //Given
        //When
        int substractResult = calculator.substract(a, b);
        //Then
        assertEquals(-3, substractResult);
    }

    @Test
    public void testPower() {
        //Given
        //When
        int resultPower = calculator.toPowerOf(a, b);
        //Then
        assertEquals(390625, resultPower);
    }

}
