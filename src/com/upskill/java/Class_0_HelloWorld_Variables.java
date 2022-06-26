package com.upskill.java;

public class Class_0_HelloWorld_Variables {
	
	//Test Git
	
	// Access Modifier - public, private, protected, default
	
	public String name = "Rasel";   					// public - Any class can access it
	
	private int age = 55;								// private - Only same class can access it
	
	protected int ssn = 123451526;						// protected - Only same package & subclass can access it
	
			String address = "Hertiage Tower";			// default - works as public, only by classes in the same package.
	

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		localVariableBD("Gyro");
		
		localVariableBD("Chienese");
		
	}
	
	
	//Method
	public static void localVariableBD(String food){			//Method Parameter 
		//Local Variable
		String city = "Dhaka";
		String Dinner = food;
		System.out.println("Dinner >>>"+ Dinner);
	}
	
	//Method
	public void localVariableUK(){
		//Local Variable
		String city = "London";				//Local variable stays on method only
	}
	
	//Method
	public void localVariableUSA(){
		//Local Variable
		String city = "NYC";
	}
	
	//Instance Variable
	String country = "USA";					//Instance variable stays on Class only
	
	//Static Variable
	static String zip = "07124";		//Static variable store memory in class, not required create object
	

}

class Variables {
	
	String name = "Jafrin";					// Instance & Global & Class level variable
	
	static String address = "123 ave";		// Static variable
	
	public void myMethod(String _country){  // Method Parameter
		
		String city = "NYC";				// local & method level variable
		
		String country  = _country;
		
	}
	
	public void method1(){					//Void method
		
	}
	
	public static void method2(){			//Static void method
		
	}
	
	public int method3(){					//return type method
		return 5;
	}
}

