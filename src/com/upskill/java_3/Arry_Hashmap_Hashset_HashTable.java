package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Arry_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		  
		// Array store multiple data using index 
		
		int age = 30;                                                // Variable  
		int [] ageDeadpool = new int[] { 25, 21, 35, 30, 40,};      // Array  
		
      // Array index                     [0] [1] [2] [3] [4] 
		
		System.out.println("Student Age : " + ageDeadpool[4]);  
		System.out.println("Total Student : " + ageDeadpool.length); 
		
		String[] nameDeadpool = new String[]{"Masud", "Tahin", "Zaman", "Razzak", "Tanzu", "Shamme"};   
		
		System.out.println("Student name : " + nameDeadpool[0]);  
		System.out.println("Total Student : " + nameDeadpool.length);
		
	//nameCity 	 
	String[] nameCity = new String[]{"NYC", " Bloomfield", "Sylhet", "Dhaka", "Buffalo", "Tokyo"}; 
	 
	System.out.println("city Name : " + nameCity[3]);
	System.out.println("Total City : " + nameCity.length); 
	
	 
	// Multi-Dimentional Array  
	int[][] ageUpSkill2D = {{25, 21, 35, 30, 40},    // [0][0] [0][1] [0][2] [0][[3] [0][4] [0][5]
			              {21, 25,22, 26}};         //  [1][0] [1][1] [1][2] [1][3] [1][4]     
	
	System.out.println(" Student Age 2D : " + ageUpSkill2D[1][1]); 
	
	 
	//Hashmap store multipul data using key- value pair, Implementation of map interface 
	
	HashMap<String, Integer> Student = new HashMap<String, Integer>();  
	
	Student.put("tanzu", 20);
	Student.put("tahin", 21);
	
	
	
	System.out.println("HashMap Student Age :" + Student.get("tahin")); 
	
	// HashMap for Capital 
	
	HashMap<String, String> Capital = new HashMap<String, String>();  
	Capital.put("BD", "Dhaka"); 
	Capital.put("USA", "Washinton");
	System.out.println("Capital City :" + Capital.get("BD")); 
	
	 
	//Hashset store unordered collection containing unique value, implementation of set interface 
	// Hasset does not allow doblicat   
	
	HashSet<String> car = new HashSet<String>(); 
	
	car.add("BMW"); 
	car.add("Toyota"); 
	car.add("audi"); 
	car.add("Frod"); 
	
	System.out.println("car :" + car); 
	
	HashSet<String> capital = new HashSet<String>(); 
	capital.add("Washinton"); 
	capital.add("Dhaka"); 
	capital.add("London"); 
	
	System.out.println("capital : " + capital); 
	
	
	// HasTable store multiple data using key _ value pair, no duplicate, also is synchronized( only one tread can be modified) 
	
	Hashtable<String,String> Region = new Hashtable<String,String>();
	
	Region.put("BD", "Asia"); 
	Region.put("USA", "America");   
	
	System.out.println("Region : " + Region.get("BD") );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
		
		

	}


