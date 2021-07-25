package StringPract;

public class anagram {
    public static void main(String[] args) {
        String s1="armyy";
        String s2="maryr";
        boolean ana=false;
        char[] c1=s1.toCharArray();
        char[] c2=s1.toCharArray();

        int count[]=new int[256];
        for(int i=0;i<c1.length;i++){
            count[s1.charAt(i)]++;
        }

       if(s1.length()==s2.length()) {
           for (int j = 0; j < s2.length(); j++) {
               if (count[s2.charAt(j)] == 0) {
                   ana = false;
                   break;
               } else {
                   count[s2.charAt(j)]--; //if character got match , then reducing it by 1 , thus we can handle the repetitive charcater
                   ana = true;
               }
           }
       }
        System.out.println(ana);
    }
}
