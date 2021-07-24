package StringPract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class removeDuplicates {
    public static void main(String args[]){
        String duplicate="SStrninng";
//        Map<Character, Integer> dup=new HashMap<>();
//        for(Character c: duplicate.toCharArray()){
//
//        }
        //lets do this with normal without any collection framework


        //after using Collection Framework
        HashSet<Character> dup=new LinkedHashSet<>();
        for(Character c: duplicate.toCharArray()){
            dup.add(c);
        }

        char[] cha=new char[dup.size()];
        for(char s:dup){
            System.out.print(s+" ");
        }

    }
}
