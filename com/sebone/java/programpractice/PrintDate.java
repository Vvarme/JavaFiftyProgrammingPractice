
	package com.sebone.java.programpractice;

	import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

	/**
	 * @author Vinod Verme
	 *
    */
	public class PrintDate {
	
		/**
		 * @param args
		*/
		public static void main(String[] args) {
			
			PrintDate printDate=new PrintDate();
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter your format :");
			String format=scanner.nextLine();
			String getDate=printDate.getDate(format);
			System.out.println("Date in the given format is: "+getDate);
	        scanner.close();
		}
		public String getDate(String format ) {
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
			Date date=new Date();
			return simpleDateFormat.format(date);
		}
	
	}
