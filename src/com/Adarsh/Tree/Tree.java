package com.Adarsh.Tree;

public class Tree {
   private TreeNode root;
   
  
   public void insert(int data) {
	   if(root==null) {
		   root=new TreeNode(data);
	   }
	   else {
		   root.insert(data);
	   }
   }
   
   public void inOrderTraversal() {
	   root.inOrderTraversal();
   }
   
   public int getMin() {
	   return root.getMin();
   }

public int getMax() {
	// TODO Auto-generated method stub
	return root.getMax();
}

public void getAllNode(int value) {
	root.getAllNode(value);
}

public void delete(int value) 
{
	root=delete(root, value);
	
}

private TreeNode delete(TreeNode subTreeRoot, int value) {
//	TreeNode subTree = root2;
	
	if(value < subTreeRoot.getData()) {
		subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild() , value));
	}
	else if(value > subTreeRoot.getData()) {
		subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
	}
	else {
		//for handling 0 and 1 child
		if(subTreeRoot.getLeftChild() == null) {
			return subTreeRoot.getRightChild();
		}
		else if(subTreeRoot.getRightChild() == null) {
			return subTreeRoot.getLeftChild();
		}
		else {
			TreeNode temp=null;
			TreeNode temp1=null;
			temp=subTreeRoot.getRightChild();
			
			while(temp!=null) {
				temp1=temp;
				temp=temp.getRightChild();
			}
			subTreeRoot.setData(temp1.getData());
			subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),temp1.getData()));
			
		}
	}
	
	
	return subTreeRoot;
}

}
