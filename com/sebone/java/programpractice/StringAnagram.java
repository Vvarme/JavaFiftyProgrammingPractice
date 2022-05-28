package com.sebone.java.programpractice;
import java.util.Arrays;
import java.util.*;
class StringAnagram
{
  static boolean Stringsort(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			char[] a=str1.toCharArray();
			char[] b=str2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a,b))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	public static void main(String[] args) 
	{
	      Scanner sc=new Scanner(System.in);
	       System.out.println("Enter first string");
	        String str1=sc.nextLine();
	      System.out.println("Enter second string");
	        String str2=sc.nextLine();
	      
	     if(Stringsort(str1,str2))
	     {
	       System.out.println("Both strings are anagram");
		 }
	     else 
	     {
	    	 System.out.println("Both strings are not anagram.");
	     }
	 }
	
}
