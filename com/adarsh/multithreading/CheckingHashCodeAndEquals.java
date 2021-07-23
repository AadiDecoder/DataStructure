package com.adarsh.multithreading;

public class CheckingHashCodeAndEquals {
    public static void main(String[] args){
        Student student1 = new Student("Adarsh",1);
        Student s2=student1;

        System.out.println(student1==s2);
        System.out.println(student1.hashCode());
        System.out.println(s2.hashCode());

    }
}

class Student{
    String name;
    int id;

    public Student(String name,int id) {
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
