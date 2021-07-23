package com.Adarsh.Tree;

public class Main {

	public static void main(String[] args) {
		Tree t=new Tree();
		t.insert(30);
		t.insert(40);
		t.insert(20);
		t.insert(22);
		t.insert(35);
		t.insert(11);
		t.insert(15);
		t.insert(9);
		t.insert(10);
		
		double  i=1;
		i=i/6;
		System.out.println("Adi"+i);
		
		
//		int min=t.getMin();
//		System.out.println("Min Value in tree is: "+min);
//		
//		int max=t.getMax();
//		System.out.println("Max Value in tree is :"+max);
		
		//get all the direct node from node i.e 20 --- 10 , 22 and 30(its parent)
		
		//t.getAllNode(10);
		
		t.delete(9);
		t.delete(11);
		
		t.inOrderTraversal();
		
//		int m= factorial(5);
//		System.out.println(m);;
		
		
	}
	
//	private static int factorial(int n) {
//		if(n==1) {
//			return 1;
//		}
//		else {
//			return (n * factorial (n-1));
//		}
//	}

}


//           30
//      20        40
//  11     22   35   44
//9    15
//  10

//inorder traversal :=>10 20 22 30 35 40

