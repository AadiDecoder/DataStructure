package com.Adarsh.dp;

public class countSubsetWithGivenDiff {
    public static void main(String []args) {
        int arr[] = {1,1,2,3};
        int diff = 4;
        int sum = 0;
        int N = arr.length;


        for(int i=0 ;i < N ; i++){
            sum=sum+arr[i];
        }
//        System.out.println(sum/2);
        int c=countDiff(arr,0, sum , diff, N);
        System.out.println(c);

    }

    private static int countDiff(int[] arr,int sumPart ,int sum, int diff, int n) {

        if( sum-2*sumPart == diff)
        {
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(sum/2 >=arr[n-1]){
            return countDiff(arr,sumPart+arr[n-1],sum,diff,n-1) + countDiff(arr,sumPart,sum,diff,n-1);
        }
        else{
            return countDiff(arr,sumPart,sum,diff,n-1);
        }

    }
}
