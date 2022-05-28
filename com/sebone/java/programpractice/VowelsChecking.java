	/**
 * 
 */
	package com.sebone.java.programpractice;
    import java.util.Scanner;
     /**
	 * class name- VowelsChecking
	 * @author Vinod Varme
	 *objective-main objective of this class is to check vowels in string.
	*/
	public class VowelsChecking {
		public static void main(String[] args) {
			VowelsChecking vowelChecking=new VowelsChecking();
			Scanner scanner=new Scanner(System.in);
			
            System.out.println("Enter string :");
			String string=scanner.nextLine();
			if(vowelChecking.checkVowels(string)) {
				System.out.println("vowels present in the given string");
			}
			else {
				System.out.println("vowels not present in given string");
			}
			
			scanner.close();
		}
		/**
		 * method name- printVowels
		 * @author Vinod Varme
		 * input parameter-one string
		 * objective-main objective of this method is to search vowel in string and display.
		*/
		public boolean checkVowels(String string) {
			boolean flag=false;
			for(int index=0;index<string.length()-1;index++) {
				if(string.charAt(index)=='a'||string.charAt(index)=='i'||string.charAt(index)=='o'||string.charAt(index)=='u'||string.charAt(index)=='e') {
				 return true;
				}
			}
			return flag;
		}
	}
