package com.upskill.java;

public class Class_5_Interface_Implementation implements Class_5_Interface{

	public static void main(String[] args) {
		Class_5_Interface_Implementation myObj = new Class_5_Interface_Implementation();
		myObj.iDoor();
		System.out.println("Number of Wheel in Car : " + myObj.iWheels());
		System.out.println("Color of the Car : " + myObj.iColor());
		myObj.iSeat();
	}

	public void iDoor() {
		int numDoor = 2;
		System.out.println("Number of Door in Car : " + numDoor);
		
	}

	@Override
	public int iWheels() {
		int numWheel = 4;
		return numWheel;
	}

	@Override
	public String iColor() {
		String color = "Blue";
		return color;
	}

	@Override
	public void iSeat() {
		int numSeat = 5;
		System.out.println("Number of Seat in Car : " + numSeat);
	}
	
/*
	(Parent)				(Keyword) 				(Child)
	Class					extends					 Class
	Abstract Class			extends					 Class
	Interface				implements		  		 Class
	Interface				extends					 Interface
	
*/
}