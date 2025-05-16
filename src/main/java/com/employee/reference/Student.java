package com.employee.reference;

public class Student {
	
	private int id;
	private String name ;
	
	public Student(){
		System.out.println("creating object of student class");
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("creating object of student class with arugment");
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public void display() {
		System.out.println("i Am student");
	}
}
