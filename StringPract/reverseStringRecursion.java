package StringPract;

public class reverseStringRecursion {
    public static void main(String[] args) {
        String name="Adarsh";
         reverse(name);

    }

    private static void reverse(String name) {
        if(name.length()<=1){
            System.out.println(name.charAt(name.length()-1));
            return;
        }
        System.out.print(name.charAt(name.length()-1));
        reverse(name.substring(0,name.length()-1));

        return ;
    }
}
