package com.upskill.java;

public class Class_6_myException extends Exception{

	String str1;
	
	public Class_6_myException(String str2){
		str1=str2;
	}
	
	public String toStringUpskill(){
		return ("This is user defined exception by UpSkill" + str1);
	}
}