package com.Adarsh.dp;

import java.util.Arrays;

public class _01KnapsackMemoization {
    public static int[][] t;

    public static void main(String [] args)
    {
        int[] wt={1,4,3,3};
        int[] val={1,4,5,7};
        int W=7;
        int N=wt.length;
//        t = new int[N+1][W+1];
//        for(int x=0;x<wt.length;x++)
//            Arrays.fill( t[x], -1 );
//        for(int i=0; i<wt.length;i++)
//        {
//            for(int j=0; j < w ; j++)
//            {
//                System.out.print(t[i][j]+" ");
//            }
//            System.out.println();
//        }
        // Declare the table dynamically
        int dp[][] = new int[N + 1][W + 1];

        // Loop to initially filled the
        // table with -1
        for(int i = 0; i < N + 1; i++)
            for(int j = 0; j < W + 1; j++)
                dp[i][j] = -1;
        int max=knapsackRec(wt,val,W,N,dp);
        System.out.println(max);

    }

    private static int knapsackRec(int[] wt, int[] val, int w, int n,int dp[][]) {

        if(n==0 || w==0)
        {
            return 0;
        }

        if(dp[n][w]!=-1) {
            return dp[n][w];
        }
        if(wt[n-1] <= w)
        {
            return dp[n][w]= Math.max(val[n-1] + knapsackRec(wt,val,w-wt[n-1],n-1,dp) ,knapsackRec(wt,val,w,n-1,dp));
        }
        else
        {
            return dp[n][w]=knapsackRec(wt,val,w,n-1,dp);
        }

    }
}
