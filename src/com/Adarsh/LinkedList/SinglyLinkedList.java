package com.Adarsh.LinkedList;

public class SinglyLinkedList {

	private StudentNode head;
	
	public void addToFront(Student stu) {
		StudentNode st=new StudentNode(stu);
		st.setNext(head);
		head=st;
	}
	
	public StudentNode deleteFromFront() {
		if(isEmpty()) {
			return null;
		}
		StudentNode deleteNode=head;
		head=head.getNext();
		System.out.println("ada"+head.getStudent().getName());
		deleteNode.setNext(null);
		return deleteNode;
	}
		
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		else{
			return false;
	}
	}
	
	
	public void printL() {
		if(head==null) {
			System.out.println();
			System.out.println("List Empty");
			
		}
		while(head!=null) {
			
			System.out.print(head.getStudent().getName()+"==>");
			head=head.getNext();
		}
	}
	

}
