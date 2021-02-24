package com.app;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

                 System.out.println("execute 1");
                 try {
                 String s=args[1];                 
                 }
                 catch(Exception e) {
                	 System.out.println("Exception caught");
                 }
                 System.out.println("execute 2");
	}

}
