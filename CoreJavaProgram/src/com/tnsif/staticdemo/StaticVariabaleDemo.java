package com.tnsif.staticdemo;
//Demo for static variable

class Student {
	String name ;
	int id;
	static String collegename = "Atria";
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.collegename = collegename;
	}
	
	void showdetails() {
		System.out.println("Student name : "+name+" , Id : "+id+" , College Name : "+collegename);
	}
}


public class StaticVariabaleDemo {
	public static void main(String args[]) {
		Student s1 = new Student("Dhnauhs",1);
		Student s2 = new Student("king",2);
		Student s3 = new Student("rai",3);
		Student s4 = new Student("shetty",1);
		
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
		s4.showdetails();
	

	}

}
