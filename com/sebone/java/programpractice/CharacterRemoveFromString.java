package com.sebone.java.programpractice;

	import java.util.Scanner;

	/**
	 * class name-CharacterDuplicates
	 * @author Vinod Varme
	 *objective-main objective of this class is to remove all the given character from string.
	*/
	public class CharacterRemoveFromString {
		
		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			
			CharacterRemoveFromString characterDuplicates=new CharacterRemoveFromString();
			
			String string="we are the part of sebone technology bangalore";
			//System.out.println("Enter character :");
			//char ch=(char)scanner.nextByte();
			String withoutChar=characterDuplicates.getWithoutCharString(string,'s');
			System.out.println("After removing char string is: "+withoutChar);
			scanner.close();
		}
		/**
		 * method name- getWithoutCharString
		 * @author Vinod Varme
		 * input parameter-one string and second char
		 * objective-this method removes all given character present in a give string and return string without given character.
		*/
		public String getWithoutCharString(String string,char ch) {
	       String tempString="";
	       String newString="";
			for(int index=0;index<string.length();index++) {
				if(string.charAt(index)!=ch) {
				  	tempString=tempString+string.charAt(index);
				}
				newString=newString+tempString;
				tempString="";
			}
         return newString;
		}

	}
