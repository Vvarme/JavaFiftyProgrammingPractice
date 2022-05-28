/**
 * 
 */
package com.sebone.java.programpractice;

/**
 * @author Vinod Verme
 *
 */
public class NullPointerExample {
	
	public static void main(String[] args) {
		NullPointerExample nullPointerExample=new NullPointerExample();
		
		String string=null;
				try {
					if(string.equals(string));
					nullPointerExample.nullPointerExample();
				}
		       catch(NullPointerException e) {
		    	   System.out.println("Null pointer exception handled");
		       }

	}
	public String nullPointerExample() {
		String string= null;
		try {
			if(string.equals("sebone")) {
				return "same";
				
			}
		}
		catch(NullPointerException e) {
			return "Null pointer Exception";
		}
		return "Normal flow";
	}

}
