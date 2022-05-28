	package com.sebone.java.programpractice;

	public class TryCatchExample {
		public static void main(String[]args) {
		
		//	TryCatchExample tryCatchExampleobj=new TryCatchExample();
		
			try {
				int a=1/0;
				
				System.out.println("Remaining statement...");
				
			}
			catch(ArithmeticException e) {
				
				System.out.println("Exception handle...");
			}
			
		}
		
	}
