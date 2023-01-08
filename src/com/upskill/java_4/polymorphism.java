package com.upskill.java_4;

public class polymorphism {

	public static void main(String[] args) { 
         car(4,"BMW"); 
	} 
	
	public static void car(){ 
		System.out.println("my car is audi !"); 
	}
	public static void car(int door){
		System.out.println("my car is audi ! it has door:"+ door);  
	} 
	
    public static void car(String color){    
    	System.out.println("my car is audi ! it has color:"+ color); 
    }
    public static void car(int wheel,String brand){ 
    	System.out.println("my car is " + brand +" !, it has wheel : " + wheel);
    }

	}


