package StringPract;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String str="india is great";
        char uni = 0;
        Map<Character , Integer> fnr=new LinkedHashMap<>();
        
        for(Character c: str.toCharArray()){
            if(fnr.containsKey(c)){
                
                fnr.put(c,fnr.get(c)+1);
            }
            else{
                fnr.put(c,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = fnr.entrySet();
        for(Map.Entry m:entries){
            if((int)m.getValue() == 1){
                uni=(char)m.getKey();
                break;
            }
        }
        System.out.println(uni);
        
    }
}
