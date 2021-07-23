package com.adarsh.multithreading;


import java.util.function.Function;

public class MethodReferenceEx {
    public static void MyThread(){
        System.out.println("Adarsh inside voidMyThread");
    }

    public static int extend(int i){
        if(i>10) return i-10;
        return 0;
    }

    public static void main(String[] args) {
        Thread t=new Thread(MethodReferenceEx::MyThread);
        t.start();

//        Function<Integer,Integer> f = t1->{
//            if(t1>8) return t1+10;
//            else return 0;
//        };
//        int t1=f.apply(11);
//        System.out.println(t1);

        Function<Integer , Integer> f2= MethodReferenceEx::extend;
        int t1=f2.apply(11);



    }
}


