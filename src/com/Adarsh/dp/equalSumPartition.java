package com.Adarsh.dp;

public class equalSumPartition {
    public static void main(String[]args) {
        int arr[] = {2, 3, 7, 8, 10};
        int sum = 0;
//    boolean isSum[][]=new boolean[arr.length+1][sum+1];
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if (sum % 2 != 0) {
            System.out.println("Equal Partition is not possible");
        } else {
            sum=sum/2;
            System.out.println(sum);
            boolean t = subset(arr, sum, arr.length);
            System.out.println(t);
        }
    }
    private static boolean subset(int[] arr, int sum,int n) {
        if( sum==0)
        {
            return true;
        }
        if(n==0)
        {
            return false;
        }

        if(sum >=arr[n-1])
        {
            return subset(arr,sum-arr[n-1],n-1) || subset(arr,sum,n-1);
        }
        else
        {
            return subset(arr,sum,n-1);
        }

    }
}
