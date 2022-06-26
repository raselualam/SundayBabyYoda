package com.upskill.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Class_4_Array_Hashmap {

	public static void main(String[] args) {

		// Variable

		int age = 30;

		System.out.println("Variable Value " + age);

		// Array store multiple value using index

		int[] ageYoda = new int[] { 30, 24, 28, 32, 55, 48};

		// Array Index		     	 [0] [1] [2] [3] [4] [5]

		System.out.println("Array Value " + ageYoda[3]);

		System.out.println("Array length " + ageYoda.length);

		// Write an array called nameYoda

		String[] nameYoda = new String[] { "Jafrin", "Imtiaz", "Kazi", "Aastha", "Rishi", "Azad" };

		System.out.println("String Array Value " + nameYoda[3]);

		System.out.println("String Array length " + nameYoda.length);

		// Multi-dimensional Array

		int[][] ageYoda2D = { { 30, 24, 28, 32, 55 }, // [0][0] [0][1] [0][2] [0][3] [0][4]
									{ 95, 49, 11 } }; // [1][0] [1][1] [1][2]

		System.out.println("2D Array Value " + ageYoda2D[1][1]);

		// Multi-dimensional Print Array

		for (int i = 0; i < ageYoda2D.length; i++) {
			for (int j = 0; j < ageYoda2D[i].length; j++) {
				System.out.print(ageYoda2D[i][j] + " ");
			}
		}

		System.out.println(" ");

		// Hashmap store multipul data using key-value pair, Implementation of Map interface

		HashMap<String, Integer> Student = new HashMap<String, Integer>();

		Student.put("Azad", 30);
		Student.put("Aastha", 21);
		Student.put("Kazi", 27);
		Student.put("Imtiaz", 30);
		Student.put("Rishi", 31);
		Student.put("Jafrin", 28);

		System.out.println("Hashmap Value: Student Age " + Student.get("Azad"));
		System.out.println("Hashmap Length " + Student.size());
		
		//Hashmap for Country & Capital
		HashMap<String, String> Capital = new HashMap<String, String>();

		Capital.put("BD", "Dhaka");
		Capital.put("PAK", "Islamabad");
		Capital.put("IND", "New Delhi");

		System.out.println("Hashmap Value: Capital " + Capital.get("IND"));
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> Car = new HashSet<String>();
		Car.add("BMW");
		Car.add("AUDI");
		Car.add("FORD");
		
		System.out.println("Hashset value: " + Car);
		System.out.println("Hashset Length: " + Car.size());
		
		//HashTable store multipul data using key-value pair, but is synchronized (only one thread can be modified) 
		
		Hashtable<String, String> Country = new Hashtable<String, String>();

		Country.put("BD", "Asia");
		Country.put("USA", "America");
		Country.put("Uk", "England");
		
		System.out.println("HashTable Value: Country " + Country.get("BD"));
		
	}
}
