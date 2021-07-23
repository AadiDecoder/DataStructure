public class PermutationCaseChange {
    public static void main(String[] args)
    {
        String cc="abc";

        caseChange(cc,"");
    }

    private static void caseChange(String cc, String s) {
        if(cc.length()==0)
        {
            System.out.println(s);
            return;
        }
        int caseChange=cc.charAt(0);
        char c= (char) ((char)caseChange-32);
        String op1=s+c;
        String op2=s+cc.charAt(0);
        String cc1=cc.substring(1);
        caseChange(cc1,op1);
        caseChange(cc1,op2);
        return;
    }
}
