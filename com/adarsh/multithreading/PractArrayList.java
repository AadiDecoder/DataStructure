package com.adarsh.multithreading;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PractArrayList {

    public static void main(String[] args){
       List<String> citiesName = new ArrayList<>();

       citiesName.add("Hyderabad");
       citiesName.add("Delhi");
       citiesName.add("Noida");
       citiesName.add("Mirzapur");

       Iterator it = citiesName.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
}
