package com.upskill.java;

public class Class_1_AccessModifier_Datatypes {

	public static void main(String[] args) {
		
		Class_1_AccessModifier_Datatypes myObj = new Class_1_AccessModifier_Datatypes();
		
		System.out.println("Hello World");
		method1();
		myObj.method2();

	}

	/*
	Exercise:
		1.   Write a java equation class and print the value of b-a and c-b in separate method where a=10, b = 15 and c = 20;
		2.   Write a java program following below:
			a.   A method which multiply with two numbers and show in output
			b.   Another method with holding two variables which will display your first name and last name on the screen.
	*/
	
	
	static int a = 10;
	static int b = 15;
	static int c = 20;
	
	public static void method1(){
		int value = b-a;
		
		System.out.println("Mathod 1 value ::: " + value);
	}
	
	public void method2(){
		int value = c-b;
		
		System.out.println("Mathod 2 value ::: " + value);
	}
}
