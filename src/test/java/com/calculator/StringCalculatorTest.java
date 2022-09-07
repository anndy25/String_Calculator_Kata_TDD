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

    //Task 3:
    //TODO:- Allow alphabets to be included with numbers. The numeric value for the alphabet would be equal to its position.
    @Test
    void should_return_sum_for_number_and_alphabet(){
        assertEquals(10,stringCalculator.add("8,a,a"));
        assertEquals(49,stringCalculator.add("10,a,z,10,b"));
        assertEquals(90,stringCalculator.add("p,q,r,s,t"));
    }

    // Task 4:
    // TODO:- Calling add with a negative number will throw an exception “Negatives not allowed” - and the negative that was passed.

    @Test
    void should_throw_exception_for_negative_number(){
        assertThrows(RuntimeException.class,()->stringCalculator.add("-1,2,4"),"Negatives not allowed -1 ");
        assertThrows(RuntimeException.class,()->stringCalculator.add("-1,-2,4"),"Negatives not allowed -1 -2 ");
    }

    // Task 5:
    // TODO:- Numbers bigger than 1000 should be ignored.

    @Test
    void should_number_ignored_if_gt_thousand(){
        assertEquals(3,stringCalculator.add("2,1,1002"));
        assertEquals(1200,stringCalculator.add("1000,1001,200"));
        assertEquals(0,stringCalculator.add("1002,1001,2002"));
    }







}