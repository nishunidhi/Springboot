package com.tns.di;

public class Student {
	private String studentname;
	private int id;
	public void setid(int id) {
		this.id=id;
		System.out.println("setter method called");
		
	}
	public void setstudentname(String studentname) {
		this.studentname=studentname;
		System.out.println("setter method called");
	}
public void displaystudentinfo() {
	System.out.println("student name is"+studentname+" "+id);
}
}
