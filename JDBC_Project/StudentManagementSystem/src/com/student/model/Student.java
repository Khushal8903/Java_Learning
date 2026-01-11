package com.student.model;

public class Student {

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	private String name;
	private String email;
	private int marks;
	
//	Student(int id , String name , String email, int marks){
//		this.id=id;
//		this.name=name;
//		this.email=email;
//		this.marks=marks;
//	}

}
