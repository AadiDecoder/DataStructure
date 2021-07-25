package StringPract;

public class permutationOfString {
    public static void main(String[] args) {
        String num="123";

        permutations(num,"");
    }

    private static void permutations(String ques   , String ans) {

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i <ques.length() ;i++){
            char ch=ques.charAt(i);
            String lp=ques.substring(0,i);
            String rp=ques.substring(i+1);
            String join=lp+rp;
            permutations(join,ans+ch);
        }
    }
}
