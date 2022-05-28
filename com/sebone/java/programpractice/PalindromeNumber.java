package com.sebone.java.programpractice;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		
		PalindromeNumber palindromeNumber=new PalindromeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for palindrome :");
		int number=sc.nextInt();
	    
		if(palindromeNumber.checkPalindrome(number))
		{
		   System.out.println("palindrome number ");    
		}
		else
		{
		   System.out.println("not palindrome");    
		}
	}
	public boolean checkPalindrome(int number) {

		int temp=1,sum=0,r=0;
		while(number>0){    
			   r=number%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   number=number/10;    
			  }    
		if(temp==sum)
		{
		   return true; 
		}
		else
		{
		  return false;  
		}
	}
	

}
