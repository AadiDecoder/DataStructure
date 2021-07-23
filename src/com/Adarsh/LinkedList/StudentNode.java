package com.Adarsh.LinkedList;

public class StudentNode {
	Student student;
    StudentNode next;
    StudentNode prev;
    public StudentNode getPrev() {
		return prev;
	}
	public void setPrev(StudentNode prev) {
		this.prev = prev;
	}
	
    
    
	public StudentNode(Student student) {
		super();
		this.student = student;
	}
	public StudentNode getNext() {
		return next;
	}
	public void setNext(StudentNode next) {
		this.next = next;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
    
}
