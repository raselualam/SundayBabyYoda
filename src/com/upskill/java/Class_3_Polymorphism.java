package com.upskill.java;

/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

public class Class_3_Polymorphism extends Class_1_MethodType_Object{
	
	public static void main(String[] args){
		
//		car();
		
		Class_3_Polymorphism myObj = new Class_3_Polymorphism();
		
		myObj.weeklyIncomeVoid();
	}
	
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	public static void weeklyIncomeVoid(){
		
		int weekly = hourlyIncome * 45;
		System.out.println("New Weekly Income ::: " + weekly);
		
	}
	
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My Car is Audi !");
	}
	
	public static void car(int door){
		System.out.println("My Car is Audi, it has door : " + door);
	}
	
	public static void car(String color){
		System.out.println("My Car is Audi, its color : " + color);
	}
	
	public static void car(int door, String color){
		System.out.println("My Car is Audi, it has door : " + door + " ; its Color : " + color);
	}
	
	public static void car(int engine, int wheel){
		System.out.println("My Car is Audi, it has engine : " + engine + " ; its wheel : " + wheel);
	}

	
	

}
