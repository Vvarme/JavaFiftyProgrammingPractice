	package com.sebone.java.programpractice;

	public class StringImmutable {

		public static void main(String[] args) {
	
			String firstString="Sebone";
			String secondString=firstString;
			
			StringImmutable stringImmutable=new StringImmutable();
			
			System.out.println("Before modification: ");
		    String tempString=stringImmutable.immutableString(firstString,secondString);
			
			System.out.println(tempString);
			System.out.println();
			secondString=secondString+" Technology";
			
			System.out.println("After modification second string is : "+secondString);
			
		}
		public String immutableString(String firstString,String secondString) {
			
			secondString=secondString+"  Technologies";
			if(firstString==secondString)
			{
				return("Both string contain same content");
			}
			else {
				return("Both string not contain same content");
			}
			
		}

	}
