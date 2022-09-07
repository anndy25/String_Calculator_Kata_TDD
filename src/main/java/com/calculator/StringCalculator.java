package com.calculator;

import java.util.*;
import java.util.stream.Collectors;

public class StringCalculator {
    int add(String num){
        int sum=0;
        if(num.length()!=0){
            List<Integer>list= Arrays.stream(num.split(","))
                    .map(map->map.length()==1 && 'a'<=map.charAt(0) && map.charAt(0)<='z' ?   map.charAt(0)-'a'+1:Integer.parseInt(map)
                    ).collect(Collectors.toList());
            sum=list.stream().reduce(Integer::sum).orElseThrow();
        }

        return sum;
    }



}
