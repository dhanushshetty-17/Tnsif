package com.tnsif.polymorphism;

class Persons{
	
}
class Manager extends Persons{
	
}
class Employee extends Persons{
	
}

public class InstanceDemo {
	public static void main(String[] args) {
		Persons p=new Persons();
		Manager m=new Manager();
		Employee e=new Employee();	
		System.out.println(p instanceof Persons);
		System.out.println(e instanceof Persons);
		System.out.println(p instanceof Manager);
		System.out.println(m instanceof Manager);
		
	}

}