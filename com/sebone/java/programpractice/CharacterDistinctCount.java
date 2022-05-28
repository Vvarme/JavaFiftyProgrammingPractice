	package com.sebone.java.programpractice;
	import java.util.Scanner;

	public class CharacterDistinctCount {

		public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			
			CharacterDistinctCount characterDistinct=new CharacterDistinctCount();
			System.out.println("Enter string :");
			String string=scanner.nextLine();
			String withoutChar=characterDistinct.getWithoutCharString(string);
			System.out.println("Distinct character string is: "+withoutChar);
			scanner.close();
		}
		/**
		 * method name- getWithoutCharString
		 * @author Vinod Varme
		 * input parameter-one string and second char
		 * objective-this method removes all given character present in a give string and return string without given character.
		*/
		public String getWithoutCharString(String string) {
	    // String tempString="";
	       char[] array=string.toCharArray();
	     //  int count=0;
	       char ch=' ';
			for(int index=0;index<array.length;index++)
			{
			//	count=1;
				if(array[index]!=ch)
				{
					
					for(int j=index+1;j<array.length;j++) 
					{
						if(array[index]==array[j]) 
						{
							array[j]=ch;
					     //  count++;
						}
                      
					}
				}
			//	newString=newString+string.charAt(index);
			
			}
          return new String(array);
		}
	}
