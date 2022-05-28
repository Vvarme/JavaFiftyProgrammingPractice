	package com.sebone.java.programpractice;
	import java.util.Scanner;

	public class CharacterDuplicateCount {
		
		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			CharacterDuplicateCount characterDuplicateObj=new CharacterDuplicateCount(); 
			
			System.out.println("Enter string :");
			String string=scanner.nextLine();
			string=string.toLowerCase();
			String tempString="";
			System.out.println("Duplicate character with count is: ");
			System.out.println("Character"+"    Frequency");
			
			for(int index=0;index<string.length();index++)
			{ 
				boolean flag=true;
				int tempIndex=0;
				char tempChar=string.charAt(index);
				while(tempIndex<tempString.length())
				{
					if(tempString.charAt(tempIndex)==tempChar) {
						flag=false;
						break;
					}
				   tempIndex++;
				}
				if(flag) 
				{
				   int count=characterDuplicateObj.getDuplicateCharacterFrequncy(string,tempChar);
				   if(count>1) 
					{
						System.out.println("    "+string.charAt(index)+"          "+count);
					}
					tempString +=tempChar;
				}
				
			}
		 scanner.close();
	    }
		private int getDuplicateCharacterFrequncy(String string,char searchChar) 
		{
	       
		   int count=0;
		   if(searchChar!=' ') 
		   {
				for(int index=0;index<string.length();index++)
				{
					if(string.charAt(index)==searchChar)
					{
						count++;
					}
				}
		   }	
		  return count;
		}
	
	}
