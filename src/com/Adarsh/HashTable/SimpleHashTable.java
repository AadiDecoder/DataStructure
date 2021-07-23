package com.Adarsh.HashTable;

import com.Adarsh.LinkedList.Student;

public class SimpleHashTable {

	
	private Student[] hashTable;
	
	
	public SimpleHashTable() {
		hashTable=new Student[10];
	}
	
	//hashing function.
	private int hashKey(String key) {
		return key.length() % hashTable.length;
	}
	
	public void put(String key , Student student) {
		int hashedKey = hashKey(key);
		if(hashTable[hashedKey] != null) 
		{
			System.out.println("Sorry , there is already a Student at position "+ hashedKey);
			
		}
		else 
		{
			hashTable[hashedKey]=student;
		}
	}
	
	public Student get(String key) 
	{
		int hashedKey = hashKey(key);
		return hashTable[hashedKey];
	}
	
	public void printHashTable() {
		for(int i = 0 ;i < hashTable.length ; i++) {
			System.out.println(hashTable[i]);
		}
	}
	
}
