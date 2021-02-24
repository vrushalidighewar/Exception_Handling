package com.app;

public class ArithmeticExceptionEx {

	public static void main(String[] args) {

		        int i=0;
                 try{
                	i=10/0; 
                	System.out.println(i);
                 }
                 catch(ArithmeticException e) {
                	 System.out.println("abc");
                 }
                 
                 
                 
                 
	}

}
