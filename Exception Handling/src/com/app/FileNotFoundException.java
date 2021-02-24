package com.app;

import java.io.*;


public class FileNotFoundException {

	public static void main(String[] args) {

		try {
           FileReader file=new FileReader(new File("c:/a.txt"));
	}
		catch(Exception e) {
			
		}
		
		
	}
}              
