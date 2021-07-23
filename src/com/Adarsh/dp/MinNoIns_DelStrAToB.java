package com.Adarsh.dp;
//this time we find the lcs thru DP  : Bottom up approach
public class MinNoIns_DelStrAToB {
    public static void main(String[] args) {
        String a = "heap";
        String b = "pea";

        char chX[] = a.toCharArray();
        char chY[] = b.toCharArray();

        int xl = chX.length;
        int yl = chY.length;

        int result=0;
        int dp[][]=new int[xl+1][yl+1];


        for (int i = 0; i < xl + 1; i++)
        {
            for(int j=0; j <  yl + 1 ; j++)
            {
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(chX[i-1]==chY[j-1])
                {
                    dp[i][j]= 1 +dp[i-1][j-1];
                    result = Math.max(result,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        int del = a.length() - result;
        int add=b.length() -result;
        System.out.println(del+" "+add);


    }
}