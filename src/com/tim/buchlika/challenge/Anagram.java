package com.tim.buchlika.challenge;

import java.util.*;
public class Anagram{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String que=sc.nextLine();
         StringTokenizer st=new StringTokenizer(que," ");
         int l=st.countTokens();
         String ar[]=new String[l];
         for(int i=0; i<l; i++ )
         {
            ar[i]=st.nextToken();
         }
         String q1=ar[0];
         int l1=q1.length();
         String q2=ar[1];
         int l2=q2.length();
         String ans = "";
         if(l1==l2)
         {
             ans=anagram(q1,q2,l1,l2,ans);
             System.out.println("adarsh  "+ans);
         }
         else
          System.out.println("Not a Anagram");
         
         if(ans.length()==q1.length())
         {
             System.out.println("its a Anagram");
             
         }
         else
         {
             System.out.println("Not a Anagram ");
         }
         
         
         
     }
     
     public static String anagram(String q1 , String q2 , int l1 , int l2,String ans)
     {
         
         if( l1 == 0 || l2 == 0)
         {
            return ans;    
         }
         
         for(int i=l1-1;i>=0;i--)
             {
                 boolean matched=false;
                 for(int j =l2-1;j>=0;j--)
                 { 
                     if(q1.charAt(i)==q2.charAt(j))
                     {
                         matched=true;
                         ans=ans+q2.charAt(j);
                      
                         if(ans.length()==4)
                          return ans;
                         String lpi=q1.substring(0,i)+q1.substring(i+1);
                         String lpj=q2.substring(0,j)+q2.substring(j+1);
                         anagram(lpi,lpj,l1-1,l2-1,ans);
                         break;
                         
                     }
                 }
             }
             return ans;
             
     }
     
}