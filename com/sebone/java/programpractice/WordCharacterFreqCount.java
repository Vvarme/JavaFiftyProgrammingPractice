	package com.sebone.java.programpractice;
	import java.util.Scanner;
	
	public class WordCharacterFreqCount {
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			WordCharacterFreqCount wordCharacterFreqObj=new WordCharacterFreqCount();  
			
			System.out.println("Enter string : ");
	        String string=scanner.nextLine();
	        String word[]=string.split(" ");
	        for(int index=0;index<word.length;index++)
	        {
	        	
	        	int freq=wordCharacterFreqObj.getWordFrequency(word[index],word);
	        	System.out.println(word[index]+"   "+freq);
	        	
	        }
	
		}
		public int getWordFrequency(String string,String tempWord[]) {
			int count=0;
		
			for(int index=0;index<tempWord.length;index++)
	        {
			//	if(tempWord[index]!=" ") {
					
				
		           if(string.equals(tempWord[index])) 
		           {
		        	   count++;
		        	  // tempWord[index]=" ";
		           }
				//}
		        }
			return count;
		}
	
	}
