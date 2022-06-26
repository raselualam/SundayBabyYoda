package com.upskill.java;

/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
*/

public class Class_3_Constructor {
	
	String admin;		//Intialize variable 
	int adAge;			//Intialize variable 
	String state;
	
	public Class_3_Constructor(String name, int age){	//Creates constructor of class, which execute first
		
		admin = name;				//Added value on variable
		adAge = age;				//Added value on variable
	}
	
	//Constructor Overloading
	public Class_3_Constructor(String name, int age, String location){	//Creates constructor of class, which execute first
		
		admin = name;				//Added value on variable
		adAge = age;				//Added value on variable
		state = location;			//Added value on variable
	}
	
	public Class_3_Constructor(String name, String location){
		admin = name;				//Added value on variable
		state = location;			//Added value on variable
	}

	public static void main(String[] args) {
		
		Class_3_Constructor myobj = new Class_3_Constructor("Jafrin", 25); //Creating object for specific instance 
		
		System.out.println("Admin name ::: " + myobj.admin);
		System.out.println("Admin age ::: " + myobj.adAge);
		
		Class_3_Constructor myobj2 = new Class_3_Constructor("Imtiaz", 30); //Creating another object 
		
		System.out.println("Admin name ::: " + myobj2.admin);
		System.out.println("Admin age ::: " + myobj2.adAge);
		
		
		
		Class_3_Constructor myobj3 = new Class_3_Constructor("Azad", 28, "NYC"); //Creating another object 
		
		System.out.println("Admin name ::: " + myobj3.admin);
		System.out.println("Admin age ::: " + myobj3.adAge);
		System.out.println("Admin location ::: " + myobj3.state );
		
		Class_3_Constructor myobj4 = new Class_3_Constructor("Ravinder", "Tesla"); //Creating another object 
		
		System.out.println("Admin name ::: " + myobj4.admin);
		System.out.println("Admin location ::: " + myobj4.state );
		
	}
	
	

}
