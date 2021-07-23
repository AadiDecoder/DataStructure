package com.Adarsh.Tree;

public class TreeNode {

	private int data;
	private TreeNode rightChild;
	private TreeNode leftChild;
	
	static int i=0;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	
	public TreeNode(int data) {
		super();
		this.data = data;
	}
	public void insert(int value) {
		if(data == value) {
			return;
		}
	 if(value < data) {
		 
	 
	   if(leftChild==null) 
	   {
			leftChild = new TreeNode(value);	
	   }
	   else
	   {
		leftChild.insert(value);   
	   }
	 }
	 else {
		 
	   if(rightChild==null) 
	   {
        rightChild=new TreeNode(value);
	   }
	   else {
		   rightChild.insert(value);
	   }
	  }
	}
	public void inOrderTraversal() {
        if(leftChild!=null) {
        	leftChild.inOrderTraversal();
        }
        
        System.out.print("Data => "+this.data);
       
        if(rightChild != null) {
        	rightChild.inOrderTraversal();
        }
        System.out.println("");
        
        
	}
	public int getMin() {
//		TreeNode temp = null;
//		 while(leftChild!=null) {
//			 temp=leftChild;
//			 leftChild=leftChild.getLeftChild();
//		 }
//		 
//	        return temp.getData();
		
		if(leftChild==null) {
			return this.data;
		}
		else {
			return leftChild.getMin();
		}
		  
	}
	
	public int getMax() {
		if(rightChild==null) {
			return this.data;
		}
		else {
			return rightChild.getMax();
		}
	}
	
	public void getAllNode(int value) {
       	if( data==value ) {
       		 System.out.println("data : "+data);
       		if(leftChild!=null) 
       		{
              	System.out.println(leftChild.getData());
       		}
       		if(rightChild!=null) {
       			System.out.println(rightChild.getData());
       		}
       	}
       	if( value < data ) {
       		
       		if(leftChild.leftChild.getData() == value) {
       			System.out.println(leftChild.getData());
       		}
       		leftChild.getAllNode(value);
       		
       	}
       	System.out.println(i);
	}
	
//	public void delete(int value) {
//		if(data==value) {
//			
//		}
//		if(value < data)
//		{
//			
//		}
//	}
	
}
