package com.adarsh.multithreading;

import com.sun.codemodel.internal.JForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExceptionClass {

    public static void main(String []args) {

//        Predicate p = i -> {
//            if ( i % 2 ==0 )
//               System.out.println("Hey its Even");
//            else
//                System.out.println("Hey its Odd");
//        };
        List<Integer> arr=  Arrays.asList(1,4,6,8,9,10);
        Predicate<Integer> p = i-> {
            if(i % 2 == 0) {
                System.out.println("Hey Adarsh its true :) ");
                return true;
            }
            else{
                return false;
            }
        };

        List<Integer> arFilter=arr.stream().filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> arMapped=arr.parallelStream().map(a->formatting(a)).collect(Collectors.toList());
       // arFilter.forEach(System.out::println);

       // arMapped.forEach(System.out::println);
        Boolean holder= arr.stream().map(i->formatting(i)).noneMatch(i->i>=18);
        System.out.println(holder);

//        p.test(10);
    }

    private static Integer formatting(Integer a) {
        if(a>5){
            return a+10;
        }
        return a;
    }
}
