package StringPract;

import java.util.HashMap;
import java.util.Map;

public class MostOccuring {

    public static void main(String[] args) {
        String name = "Adarsh";

//        for(Character c: name.toCharArray()){
//
//        }
//        int ch[] = new int[256];
//        for (int i = 0; i < name.length(); i++) {
//            ch[name.charAt(i)]++;
//        }
//        int max = -1;  // Initialize max count
//        char result = ' ';   // Initialize result
//        for (int i = 0; i < name.length(); i++) {
//            if (max < ch[name.charAt(i)]) {
//                max = ch[name.charAt(i)];
//                result = name.charAt(i);
//            }
//        }
//
//        System.out.println(result);

        Map<Character , Integer> occur=new HashMap<>();

        for(Character c: name.toCharArray()){
               if(occur.containsKey(c)){
                   occur.put(c,occur.get(c)+1);
               }
               else{
                   occur.put(c,1);
               }
        }
        Map.Entry<Character, Integer> maxEntry = null;
        for(Map.Entry<Character,Integer> entry : occur.entrySet())
        {
            if(maxEntry == null)
            {
                System.out.println(entry+" vfg");
                maxEntry = entry;
            }

            else if(maxEntry.getValue() < entry.getValue())
            {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey());

    }
}
