package com.Adarsh.dp;

public class countSubset {
    public static void main(String []args){
        int arr[]={2,3,5,6,8,10};
        int sum=10;
        int N=arr.length;
        int count=countSub(arr,sum,N);
        System.out.println(count);
    }

    private static int countSub(int[] arr, int sum, int n) {
        if(sum==0)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        if(sum >= arr[n-1])
        {
            return  countSub(arr,sum-arr[n-1],n-1) + countSub(arr,sum,n-1);
        }
        else{
            return countSub(arr,sum,n-1);
        }
    }
}
