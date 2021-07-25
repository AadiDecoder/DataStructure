package StringPract;

import java.util.StringTokenizer;

public class ReverseString {
    public static void main(String[] args) {
        String name="My Name is Adarsh";
        StringTokenizer st=new StringTokenizer(name," ");
        char[] ch=new char[name.length()];
        int j=0;
        int k=0;
        while(st.hasMoreTokens()) {
            String newStr=st.nextToken();
//            System.out.println(newStr);
            for (int i = newStr.length()-1; i >= 0; i--) {
                ch[j] = newStr.charAt(i);
                j++;
            }
//            System.out.println("j "+j);
            if(j!=name.length())
                ch[++j]=' ';

        }

        String rev=new String(ch);
        System.out.println(rev);
    }
}
