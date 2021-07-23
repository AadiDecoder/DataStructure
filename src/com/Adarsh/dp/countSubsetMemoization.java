package com.Adarsh.dp;

public class countSubsetMemoization {
    public static void main(String []args){
        int arr[]={2,3,5,6,8,10};
        int sum=10;
        int N=arr.length;
        int dp[][] = new int[N + 1][ sum + 1];

        // Loop to initially filled the
        // table with -1
        for(int i = 0; i < N + 1; i++)
            for(int j = 0; j < sum + 1; j++)
                dp[i][j] = -1;

        int count=countSub(arr,sum,N,dp);
        System.out.println(count);
    }

    private static int countSub(int[] arr, int sum, int n,int dp[][]) {
        if(sum==0)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }

        //memoization step
        if(dp[n][sum]!=-1)
            return dp[n][sum];
        if(sum >= arr[n-1])
        {
            return dp[n][sum]= countSub(arr,sum-arr[n-1],n-1,dp) + countSub(arr,sum,n-1,dp);
        }
        else{
            return dp[n][sum]=countSub(arr,sum,n-1,dp);
        }
    }
}
