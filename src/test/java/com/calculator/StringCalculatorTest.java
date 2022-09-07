package com.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator stringCalculator =new StringCalculator();

    // Task 0:
    // TODO:-  for an empty string, it will return 0
    @Test
    void should_return_zero_for_empty_string(){
          assertEquals(0,stringCalculator.add(""));
    }
    

}