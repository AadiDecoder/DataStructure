package com.Adarsh.dp;

public class LongestPalindromicSubsequence {
    public static void main(String [] args)
    {
       String a="agbcba";
       char[] chX=a.toCharArray();

       StringBuilder b=new StringBuilder(a);

       String a1 = b.reverse().toString();
//       System.out.println(a1);
      char[] chY=a1.toCharArray();
       int xl=a.length();
       int yl=a1.length();

        int dp[][] = new int[xl + 1][yl + 1];


        for (int i = 0; i < xl + 1; i++) {
            for (int j = 0; j < yl + 1; j++) {
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if (chX[i - 1] == chY[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[xl][yl]);
    }
}
