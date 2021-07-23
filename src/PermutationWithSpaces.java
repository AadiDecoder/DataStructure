public class PermutationWithSpaces {
    public static void main(String []args){
        String str="ABC";
        String op=""+str.charAt(0);
        String inp=str.substring(1);
//        System.out.println(op+" "+inp);

        solve(inp,op);

    }

    private static void solve(String inp, String op) {
        if(inp.length()==0)
        {
            System.out.println(op);
            return;
        }
        String op1=op+"-"+inp.charAt(0);
        String op2=op+""+inp.charAt(0);
        String in1=inp.substring(1);
        solve(in1,op1);
        solve(in1,op2);
        return ;

    }
}
