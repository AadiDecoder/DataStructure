package com.Adarsh.dp;

public class shortestCommonSupersequence {

    public static void main(String [] args){
        String x = "Adarsh" ;
        String y = "rsh" ;

        char chX[] = x.toCharArray();
        char chY[] = y.toCharArray();

        int xl=chX.length;
        int yl=chY.length;
        int dp[][]=new int[xl+1][yl+1];


        for(int i=0;i<xl;i++){
            for(int j=0;j<yl;j++)
                dp[i][j]=-1;
        }

        int le=shortestCommon(chX,chY,xl,yl,dp);
        int l= (xl - le) + yl- le;
        System.out.println(le+l);

    }

    private static int shortestCommon(char[] chX, char[] chY, int xl, int yl,int[][] dp) {
        if(xl==0|| yl==0){
              return 0;
        }
        //memoization
        if(dp[xl-1][yl-1]!=-1)
            return dp[xl-1][yl-1];

        if(chX[xl-1]==chY[yl-1]){
            return dp[xl][yl]= 1+ shortestCommon(chX, chY, xl-1, yl-1, dp);

        }
        else{
            return dp[xl][yl]=Math.max(shortestCommon(chX, chY, xl-1, yl, dp),shortestCommon(chX, chY, xl, yl-1, dp));
        }
    }
}
