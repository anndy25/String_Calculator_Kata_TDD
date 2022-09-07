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

    //Task 1:
    //TODO:- The method can take numbers as a string separated by comma and will return their sum
    @Test
    void should_return_sum_for_two_number() {
        assertEquals(5,stringCalculator.add("2,3"));
        assertEquals(10,stringCalculator.add("5,5"));
        assertEquals(45,stringCalculator.add("45,0"));
    }

    //Task 2:
    //TODO:- Allow the add method to handle an unknown amount of numbers
    @Test
    void should_return_sum_for_unknown_number(){
        assertEquals(100,stringCalculator.add("50,10,40"));
        assertEquals(10,stringCalculator.add("1,2,2,1,3,1"));
        assertEquals(25,stringCalculator.add("10,5,5,5"));
    }

    
    

}