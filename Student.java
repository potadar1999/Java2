package com.Project4;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		
		System.out.println("Roll is = "+roll);
		System.out.println("Name is = "+name);
		System.out.println("Marks is = "+marks);
	}

	public static void main(String[] args) {
		
		Student student1 =new Student();
		student1.roll=1;
		student1.name="Abhi";
		student1.marks=85;
		
		Student student2 =new Student();
		student2.roll=2;
		student2.name="Arun";
		student2.marks=45;
		
		student1=null;
		student2=null;
		
		student1.displayStudentDetails();
		student2.displayStudentDetails();
		
		
		
	}

}
