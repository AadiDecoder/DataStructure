public class PermutationLetterChange {
    public static void main(String[] args)
    {
        String cc="a1B2";

        caseChange(cc,"");
    }

    private static void caseChange(String cc, String s) {
        char c;
        if(cc.length()==0)
        {
            System.out.println(s);
            return;
        }

//        String op2=s+cc.charAt(0);
        String cc1=cc.substring(1);
        if(Character.isLetter(cc.charAt(0))) {
            int caseChange = cc.charAt(0);
            if(caseChange>=97)
            {
                 c= (char) ((char)caseChange-32);
            }
            else{
                 c= (char) ((char)caseChange+32);
            }
            String op1=s+c;
            caseChange(cc1,op1);
            caseChange(cc1,s+cc.charAt(0));
        }
        else{
              String op1=s+cc.charAt(0);
              caseChange(cc1,op1);
        }
//        char c= (char) ((char)caseChange-32);



        return;
    }
}
