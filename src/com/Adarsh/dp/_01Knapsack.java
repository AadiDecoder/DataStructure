package com.Adarsh.dp;

import java.util.Arrays;

public class _01Knapsack {


    public static void main(String [] args)
    {
        int[] wt={1,4,3,3};
        int[] val={1,4,5,7};
        int w=7;
//        t=new int[wt.length+1][w+1];
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
        int max=knapsack(wt,val,w,wt.length);
        System.out.println(max);

    }

    private static int knapsack(int[] wt, int[] val, int w, int n) {
//       System.out.println(t[n][w]);
        if(n==0 || w==0)
        {
            return 0;
        }
//        if(t[n][w]!=-1)
//            return t[n][w];
        if(wt[n-1] <= w)
        {
            return Math.max(val[n-1] + knapsack(wt,val,w-wt[n-1],n-1) ,knapsack(wt,val,w,n-1));
        }
        else
        {
            return knapsack(wt,val,w,n-1);
        }

    }
}
