package com.upskill.java_5;

public class Exception_TryCatchFinale {

	public static void main(String[] args) {
	 try{
		int[] ageLoki = new int[]{25, 35, 28, 42, 50}; 
		System.out.println("student age = " + ageLoki[8]); 
	}catch (Exception e){ 
		e.printStackTrace();  
		System.out.println("test compele");
		
	}
 
} 
}
