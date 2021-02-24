package com.app;

public class Return {

	
		// TODO Auto-generated method stub
		public int m1() {
			
          try {
        	  int c=10/0;
              return 10;
          }
          catch(Exception e) {
        	  return 20;
          }
          finally {
        	  return 30;
          }
          }
		
		public static void main(String[] args) {
			int i=new Return().m1();
			System.out.println(i);
		}

}
