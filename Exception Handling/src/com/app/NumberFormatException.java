package com.app;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int i;
           
            String s="abc";         
           try { 
            i=Integer.parseInt(s);
           }
           catch(Exception e) {
        	System.out.println("Exception occures"); 
           }
           finally {
        	   System.out.println("finally block");
           }
            System.out.println(s);
            System.out.println("finish");
            
	}

}
