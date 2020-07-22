package com.kodilla.basic_assertion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BooleanResultCheckTestSuite {

    @Test
    public void shouldReturnTrue() {
        //Given
        Calculator calculator = new Calculator();
        //When
        int sumResult = calculator.sum(6, 4);
        //Then
        Assert.assertTrue(ResultChecker.assertEquals(10, sumResult));
    }
}
