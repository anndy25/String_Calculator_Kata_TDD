package com.calculator;

import java.util.*;
import java.util.stream.Collectors;

public class StringCalculator {
    int add(String num){
        int sum=0;
        if(num.length()!=0){
            List<Integer>list= stringToIntList(num);
            isNegative(list);
            sum=list.stream().reduce(Integer::sum).orElseThrow();
        }


        return sum;
    }
    List<Integer> stringToIntList(String num){
        num=removeNextLine(num);
        List<Integer> list=Arrays.stream(num.split(","))
                     .map(map->map.length()==1 && 'a'<=map.charAt(0) && map.charAt(0)<='z' ?   map.charAt(0)-'a'+1:Integer.parseInt(map)
                     ).
                     filter((number)->number<=1000).
                     collect(Collectors.toList());
        if(list.size()==0) list.add(0);
        return list;
    }

    String removeNextLine(String num){
      if(num.contains("\n")){
          String[] numberString=num.split("\n");
          StringBuilder sb=new StringBuilder();
          for(String str:numberString){
              if(str.length()!=0)
                  sb.append(str);
              if(sb.length()>0 && sb.charAt(sb.length()-1)!=',')
                  sb.append(",");
          }
          return sb.toString();
      }

       return num;
    }

    void isNegative(List<Integer> list){
        StringBuilder strNumber=new StringBuilder();
        list.stream().filter(num->num<0).forEach(map->strNumber.append(map).append(" "));
        if(strNumber.toString().length()>0)
            throw new RuntimeException("Negatives not allowed "+ strNumber.toString());
    }



}
