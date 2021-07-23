import java.util.HashMap;

public class PrintSubset {
    public static void main(String[] args){
        HashMap<Integer , String> mp=new HashMap<>();
        String in="abc";
        solve(in , "");
    }

    private static void solve(String in, String out) {
        if(in.length()==0)
        {

            return;
        }
        String ip=in.substring(1);
        String op1=out;
        String op2=out;

        op2= op2 + in.charAt(0);
        solve(ip,op1);
        solve(ip,op2);
        return;
    }
}
