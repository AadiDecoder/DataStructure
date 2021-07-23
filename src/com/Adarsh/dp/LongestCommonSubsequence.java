package com.Adarsh.dp;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class LongestCommonSubsequence {
    public static void main(String args[]) {
        String x = "arbcdgh";
        String y = "abedfhr";

        char chX[] = x.toCharArray();
        char chY[] = y.toCharArray();


        int xl = chX.length;
        int yl = chY.length;
        int dp[][]=new int[xl+1][yl+1];
        for(int i=0;i<xl;i++){
            for(int j=0;j<yl;j++)
                dp[i][j]=-1;
        }

        int len = longestSub(chX, chY, xl, yl,dp);
        System.out.println(len);
    }
    private static int longestSub(char[] chX, char[] chY, int xl, int yl,int[][] dp) {
        if(xl==0 || yl==0){
            return 0;
        }
//lets add memoization here
       if(dp[xl-1][yl-1]!=-1){
//           System.out.println( dp[xl-1][yl-1]);
           return dp[xl-1][yl-1];
       }

        if(chX[xl-1]==chY[yl-1]){
            System.out.println(chX[xl-1]+" "+chY[yl-1]);
            return dp[xl-1][yl-1]= 1 + longestSub(chX,chY,xl-1,yl-1,dp);
        }
        else{
            return dp[xl-1][yl-1]=Math.max(longestSub(chX,chY,xl-1,yl,dp),longestSub(chX,chY,xl,yl-1,dp));
        }
    }



}
