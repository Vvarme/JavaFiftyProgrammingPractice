	package com.sebone.java.programpractice;
    
	import java.util.Scanner;
	/**
	 * @author Vinod Verme
	 *
	*/
	public class StringChecking {
		public static void main(String[] args) {
			  
			StringChecking stringChecking=new StringChecking();
			  
			  Scanner scanner=new Scanner(System.in);
			  
			  System.out.println("Enter string : ");
	          String string=scanner.nextLine();
	          System.out.println("Enter string for search : ");
	          String searchingString=scanner.nextLine();
	          
	          boolean flag=stringChecking.stringSearch(string,searchingString);
	          if(flag==true) {
	        	  System.out.println("Yes...given string is present ");
	          }
	          else {
	        	  System.out.println("Given string is not present ");
	        	  
	          }
	          scanner.close();
	
		}
		public boolean stringSearch(String string,String searchString) {
			  String tempString="";
			  boolean flag=false;
	          for(int index=0;index<string.length();index++) {
	        	  if(string.charAt(index)!=' ') {
	        		  tempString=tempString+string.charAt(index);
	        	  }
	        	  else if(tempString.equals(searchString)) {
	        		flag=true;
	        		break;
	        	  }
	        	  else {
	        		  tempString="";
	        	  }
	          }
	          if(flag==true) {
	        	return true;  
	          }
	          else {
	        	  return false;
	          }
	        
		}

	}
