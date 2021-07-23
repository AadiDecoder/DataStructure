//package com.Adarsh.dp;
//
//public class subsetDivisibleByM_DP {
//
//    public class subsetDivisibleByM {
//        public static void main(String []args){
//            int arr[]={2,7};
//            int m=6;
//            int N=arr.length;
//            int sum=0;
//            for(int i=0;i<N;i++){
//                sum=sum+arr[i];
//            }
//            boolean part[][] = new boolean[sum / 2 + 1][n + 1];
//
//            // initialize top row as true
//            for (int i = 0; i <= N; i++)
//                part[0][i] = true;
//
//            // initialize leftmost column, except part[0][0], as
//            // 0
//            for (int i = 1; i <= sum / 2; i++)
//                part[i][0] = false;
//
//            boolean isDiv=subsetDiv(arr,sum,m,N,part);
//            System.out.println(isDiv);
//        }
//
//        private static boolean subsetDiv(int[] arr, int sum, int m, int n,boolean [][]part) {
//            for (int i = 1; i < n + 1; i++) {
//                for (int j = 1; j < sum + 1; j++) {
//                    if(part[i][j]%m==0)
//                    {
//                    if (sum >= arr[i - 1]) {
//                        part[i][j] = part[i - 1][j - arr[i - 1]] || part[i - 1][j];
//                    } else {
//                        part[i][j] = part[i - 1][j - 1];
//                    }
//                }
//            }
//
//        }
//
////            if(sum % m==0 && sum!=0){
////
////                return true;
////            }
////            if(n==0){
////                return false;
////            }
//////            if(part[n][sum]!=)
////            if(sum >=arr[n-1]){
////                return subsetDiv(arr,sum-arr[n-1],m,n-1) || subsetDiv(arr,sum,m,n-1);
////            }
////            else{
////                return subsetDiv(arr,sum,m,n-1);
////            }
//
////        }
////    }
//
////}
