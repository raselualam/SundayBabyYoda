package com.upskill.java;

public class Class_5_AbstructClass_Implementation extends Class_5_AbstractClass {

	public static void main(String[] args) {
		Class_5_AbstructClass_Implementation myObj = new Class_5_AbstructClass_Implementation();
		myObj.iDoor();
		System.out.println("Number of Wheel in Car : " + myObj.iWheel());
		System.out.println("Color of the Car : " + myObj.iColor());
		myObj.iSeat();
		myObj.iMirror();
		myObj.iHeadLight();
		myObj.van();
		myObj.name();
		myObj.engine();
	}

	public void iDoor() {
		int numDoor = 2;
		System.out.println("Number of Door in Car : " + numDoor);
		
	}

	public int iWheel() {
		int numWheel = 4;
		return numWheel;
	}

	public String iColor() {
		String color = "Blue";
		return color;
	}

	public void iSeat() {
		int numSeat = 5;
		System.out.println("Number of Seat in Car : " + numSeat);
	}

	@Override
	public void iMirror() {
		int mirror = 2;
		System.out.println("Number of Mirror : " + mirror);
	}

	@Override
	public void iHeadLight() {
		int headLight = 4;
		System.out.println("Number of HeadLight : " + headLight);
		
	}
}