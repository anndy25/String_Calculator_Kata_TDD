package com.calculator;

import java.util.*;
import java.util.stream.Collectors;

public class StringCalculator {
    int add(String num){
        int sum=0;
        if(num.length()!=0){
           List<Integer>list= Arrays.stream(num.split(",")).map(Integer::parseInt).collect(Collectors.toList());
           sum=list.stream().reduce(Integer::sum).orElseThrow();
        }

        return sum;
    }



}
