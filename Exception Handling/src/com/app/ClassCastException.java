package com.app;

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("abc");
            Object o=new Object();
           
            try {
            ClassCastException e=(ClassCastException) o;   
            }                                 
            catch(Exception e) {
            	System.out.println("Exception occures");
            }
            System.out.println("pqr");
	}

}
