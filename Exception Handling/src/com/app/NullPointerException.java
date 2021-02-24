package com.app;

public class NullPointerException {

	public static void main(String[] args) {

		String s="";
		   
		         s=null;
         try {
        	   s.concat("pqr");
         }
         catch(Exception e) {
        	   //System.out.println("abc");
         } 
            
            System.out.println(s);
	}

}
               