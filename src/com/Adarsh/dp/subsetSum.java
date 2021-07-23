package com.Adarsh.dp;

public class subsetSum {
    public static void main(String[] args){
        int arr[]={2,3,7,8,10};
        int sum=21;
        boolean isSum[][]=new boolean[arr.length+1][sum+1];

        boolean t=subset(arr,sum,arr.length);
        System.out.println(t);
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
