package StringPract;

import java.util.HashMap;
import java.util.Map;


public class printDuplicates {
    public static void main(String[] args){
        String con="Java and Javascript";

//        Map<Character, Integer> dupOccur=new HashMap<>();
//        for(Character c: con.toCharArray()) {
//            if (dupOccur.containsKey(c)) {
//                dupOccur.put(c, dupOccur.get(c) + 1);
//            }
//            else {
//                if (c.toString().equals("-")) {
//                } else {
//
//                    dupOccur.put(c, 1);
//                }
//            }
//        }
//
//      for(Map.Entry<Character,Integer> entry:dupOccur.entrySet()){
//          if(entry.getValue()>1){
//              System.out.println(entry.getKey());
//          }
//      }

        int ch[] = new int[256];
        for (int i = 0; i < con.length(); i++) {
            if((((Character) con.charAt(i)).toString().equals(" ")))
            {
            }else{
                ch[con.charAt(i)]++;
            }
        }
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
        for (int i = 0; i < 256; i++) {
            if (ch[i]>1) {
                result = (char)i;
                System.out.println(result);

            }
        }
        System.out.println("sdds");

    }
}
