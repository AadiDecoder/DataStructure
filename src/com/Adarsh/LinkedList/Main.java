package com.Adarsh.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Student sibu=new Student("Sibu",2);
		Student utkarsh=new Student("Utkarsh",3);
		Student papa=new Student("papa",4);
		
		DoublyLinkedList st=new DoublyLinkedList();
		//st.printL();
		
//		st.addToFront(sibu);
//		st.addToFront(utkarsh);
//		st.addToFront(papa);
		
		Student mummy=new Student("mummy",5);
		Student adarsh= new Student("Adarsh",1);
		
		st.addToEnd(sibu);
		st.addToEnd(utkarsh);
		st.addToEnd(papa);
		st.addToEnd(mummy);
		st.addToFront(adarsh);
		st.addToEnd(adarsh);
		
		st.removeFromFront();
		st.removeFromFront();
		
		
		
		
//	    st.deleteFromFront();
		
		st.printL();
	}

}
