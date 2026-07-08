package com.tnsif.polymorphism;


class Person{
	private String name ;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
	}
	
}


public class ThisKeywordDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Dhanush");
		p.setId(11);
		p.getName();
		p.getId();
		p.display();
	}
}
