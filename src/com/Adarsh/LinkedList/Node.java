package com.Adarsh.LinkedList;

public class Node {
	Node next;
	Student stu;

	public Node() {
		super();
	}

	public Node(Student stu) {
		super();
		this.stu = stu;
		//this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	

}
