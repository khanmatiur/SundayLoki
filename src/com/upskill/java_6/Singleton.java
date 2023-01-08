package com.upskill.java_6;

public class Singleton {

	// singleton is class that can have only one object 
	// privet constructor is prevents any other class from intantiating
		 
		
		private Singleton(){
 
	}
 // private static object of the class 
		
		private static Singleton Singletonobj = new Singleton(); 
				
				
			public static Singleton getInstance(){ 
			       return Singletonobj;  
				}
			        
		protected static void demo(){                   
			System.out.println("Demo method for singleton class");
		
			
		}

}	
	
