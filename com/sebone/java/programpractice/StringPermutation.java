package com.sebone.java.programpractice;
import java.util.*;

public class StringPermutation {
	    
    public static void main(String[] args)    
    {    
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string :");
       String str=sc.nextLine();
        int len = str.length();    
        System.out.println("All the permutations of the string are: ");    
        generatePermutation(str, 0, len);    
    }    
          
    public static void generatePermutation(String str, int start, int end)    
    {       
        if (start == end-1)
        {
            System.out.println(str);
        }
        else    
        {    
            for (int i = start; i < end-1; i++)    
            {       
                str = swapString(str,start,i);         
                generatePermutation(str,start+1,end);     
                str = swapString(str,start,i);    
            }    
        }    
    }  
    public static String swapString(String a, int i, int j) 
    {    
        char[] b =a.toCharArray();    
        char ch;    
        ch = b[i];    
        b[i] = b[j];    
        b[j] = ch;    
        return String.valueOf(b);    
    }    
    
}
