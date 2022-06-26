package com.upskill.java;

public class Class_2_IfElseStatement {

	public static void main(String[] args) {
		
		//Nested if Else Statement
		
		int year = 2055;
		
		if (year<2000){
			System.out.println("20th century");
		} else {
			if (year >= 2019 && year <=2022){
				System.out.println("Pendemic");
			} else {
				System.out.println("21st century");
			}
		}
	}
	
	//if Else Statement
	
	// Requirement: 
	// less then 13 = Children
	// 13 - 17 = Teenager
	// 18 - 59 = Adult
	// 60 - 99 = Senior
	// 100+ = Champion
	
	public void ifElse(){
		int age = 60;
		
		if(age<=13){
			System.out.println("You are Children !!!");
		} else if(age > 13 && age < 18){
			System.out.println("You are Teenager !!!");
		} else if(age >= 18 && age <= 59){
			System.out.println("You are Adult");
		} else if(age >= 60 && age <= 99){
			System.out.println("You are Senior");
		} else {
			System.out.println("You are Champion !!!");
		}
	}

}



