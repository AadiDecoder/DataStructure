package com.Adarsh.collection;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args){
//        Set<String> newSet = new HashSet<String>();
//        newSet.add("Adarsh");
//        newSet.add("Papa");

//        System.out.println(newSet);

        ArrayList<Person> people=new ArrayList();
        people.add(new Person("adarsh"));
        people.add(new Person("utkarsh"));
        people.add(new Person("Shakshi"));
//
        List<String> names=new ArrayList<>();
        names.add("Pravesh");
        names.add("Beena");
        //people.add(new Date());
//        System.out.println(people.get(0));
//        String firstName = people.get(0);

       List<String> withTitle=people.stream().map(name -> con(name.getName())).filter(p->p.startsWith("A")).collect(Collectors.toList());

        List<String> collect = people.parallelStream().map(name -> con(name.getName())).filter(p -> p.length() == 7).collect(Collectors.toList());
        //System.out.println(withTitle);
//        System.out.println(collect);


        //even odd with functional prograaming in java
        List<Integer> intList = Arrays.asList(11,12,13,14,15);

        List<Integer> collect1 = intList.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
//        collect1.forEach(c -> System.out.println(c));


        int i=10;
        //Annonymous way to instantiate and call method
        checkEvenOrOdd(i, new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if(i % 2==0){

                    return true;
                }
                else{
                    return false;
                }
            };
        });

        //its same as above but here we calling Lambda way to solve
//        checkEvenOrNot(9 , k -> k%2==0);



        Predicate<Integer> isEven = j -> j % 2 == 0;
        IntPredicate isOdd = argument -> argument % 2 == 1;
//        System.out.println(isEven.test(17));

        run r=()-> System.out.println("callung run interface");
        r.running();
    }

    private static String con(String name) {
        return name.toUpperCase();
    }


    private static void checkEvenOrOdd(Integer i,Predicate<Integer> predicate) {
        if(predicate.test(i)){
            System.out.println("Its Even");
        }
        else{
            System.out.println("false");
        }
    }

    private static void checkEvenOrNot(int i ,Predicate<Integer> p) {
            if(p.test(i)){
                System.out.println("Its Even");;
            }
            else{
                System.out.println("Its odd");
            }
    }

    //using lambda with user defined functional interference





//    private static void printallWithA(ArrayList<Person> people, Predicate<Person> predicate) {
//        for (Person p : people) {
//            System.out.println(2);
//            if(predicate.test(p))
//                System.out.println(p.getName());
//        }
//    }
//




}

class Person{
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface run{
    public void running();
}





