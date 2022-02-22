package com.encapdulation;

public class Encaptulation {
	public static void main(String[] args) {
		Student student= new Student();
		student.setName("Yuva");
		student.setId(12345);
		student.setAge(25);

		System.out.println(student.getName()+"\n"+student.getId()+"\n"+student.getAge());	
	}
}
