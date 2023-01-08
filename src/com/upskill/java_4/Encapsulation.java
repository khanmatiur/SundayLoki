package com.upskill.java_4;

public class Encapsulation {

	// Encapsulation used to hide the date using setter and getter method 
	
	
		private String name = "upskill";                  // write & read 
		private int ssn = 1234567;                       // write only
		private String username ="matiurkhan";          // read only
		 
		// setter method _ name                        // set the data 
		
		public void setName(String value){
            name = value; 
		}         
            
      //Getter Method- name                          // get the data      
            public String getName(){ 
            	return name;
	} 
                                    
   // Setter Method - ssn 
         public void setSSn(int value){ 
        	 ssn = value;
         } 
         
   //Getter method - name 
         public String getUserName(){ 
        	 return username;                   
         }	 
         public static void main(String[] args) { 
    	Encapsulation obj = new Encapsulation();   
    	 
    	obj.setName("upskill2");               
    	System.out.println(obj.getName()); 
    	
    	obj.setSSn(123456789); 
    	System.out.println(obj.getUserName());
    	
    }
}
