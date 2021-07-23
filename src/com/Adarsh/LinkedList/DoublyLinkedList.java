package com.Adarsh.LinkedList;

public class DoublyLinkedList {

	
	private StudentNode head;
	private StudentNode tail;
	
	public void addToFront(Student student) {
		StudentNode stu=new StudentNode(student);
		if(head==null) {
		   
		    tail=stu;
		    head=stu;
		}
		else {
			StudentNode temp=head;
			head.setPrev(stu);
			head=stu;
			stu.setNext(temp);
			
		}
		
	}
	public void addToEnd(Student student) {
		StudentNode stu=new StudentNode(student);
		if(tail==null) {
			tail=stu;
			head=stu;
		}
		else
		{
			stu.setPrev(tail);
			tail.setNext(stu);
			tail=stu;
			
		}
	}
	public void removeFromFront() {
		if(head==null) {
			System.out.println("There is nothing to delete from list");
		}
	    head=head.getNext();
	    
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
		StudentNode student=head;
		while(student!=null) {
			
			System.out.print(student.getStudent().getName()+"==>");
			student=student.getNext();
		}
		System.out.println("Null");
	}
}
