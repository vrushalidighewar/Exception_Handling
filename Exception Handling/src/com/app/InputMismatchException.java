package com.app;

import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
         try { 
          int i=sc.nextInt();
          }
         catch(Exception e) {
        	 System.out.println("b");
         }
          System.out.println("a");
	}

}       