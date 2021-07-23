package com.Adarsh.dp;

public class LongestCommonSubstring {

    public static void main(String [] args){
        String x = "heap";
        String y = "pea";

        char chX[] = x.toCharArray();
        char chY[] = y.toCharArray();

        int xl = chX.length;
        int yl = chY.length;
        int dp[][]=new int[xl+1][yl+1];
        for(int i=0;i<xl;i++){
            for(int j=0;j<yl;j++)
                dp[i][j]=-1;
        }
    int count=0;
        int len = longestSub(chX, chY, xl, yl,count,dp);

        int del=xl-len;
        int add=yl-len;
        System.out.println(del+" "+add);
//        System.out.println(len);
    }
    private static int longestSub(char[] chX, char[] chY, int xl, int yl,int count,int [][] dp) {
        if(xl==0 || yl==0){
            return 0;
        }
//lets add memoization here
        if(dp[xl-1][yl-1]!=-1){
//           System.out.println( dp[xl-1][yl-1]);
            return dp[xl-1][yl-1];
        }

        if(chX[xl-1]==chY[yl-1]){
//            System.out.println(chX[xl-1]+" "+chY[yl-1]);
            return longestSub(chX,chY,xl-1,yl-1,count+1,dp);
        }
        else{
            return Math.max(Math.max(count,longestSub(chX,chY,xl-1,yl,0,dp)),Math.max(count,longestSub(chX,chY,xl,yl-1,0,dp)));
        }
    }
}
