import java.math.*;
public class kthGrammar {

	public static void main(String[] args) {
		
       int n=4;
       int k=3;
       
       int ans=solve(n,k);
       System.out.println(ans);
       
              
	}

	private static int solve(int n, int k) {
		int mid=(int) Math.pow(2, n-1)/2;  //  1 ::: n=4 so mid = 4 and k = 3 
//		   									4 :: n==3 so mid=2 and k=3   return 1
//											7 :: n==2 so mid=1 nd k==1    return 0;
		
	       if(n==1 && (k==1))
	       {
	    	   return 0;
	       }
	       if(mid>=k)  // 2:::mid=4 and k=3  
//	    	           8 ::  mid=1 and k=1   return 0;
	       {
	    	   return solve(n-1,k);  // 3::  n==3 and k=3   
	    	                          //9::n==1 and k==1   return 0;
	       }
	       else {                            //5 :: mid=2 and k==3  return 1
	    	  int num=solve(n-1 , k-mid);   // 6::  n==2 and k=3-2 i.e 1    if num 0 then it will return 1;
	    	  if(num==1)
	    		  return 0;
	    	  else
	    		  return 1;
	       }
	}

}
