	package com.sebone.java.programpractice;
	import java.util.Arrays;
	
	/**
	 * class name-RemoveDuplicateSortedArray 
	 * @author Vinod Varme
	 * objective-main objective of this class is to remove duplicate element from an array .
	*/
	public class RemoveDuplicateSortedArray {
	
		public static void main(String[] args) {
			RemoveDuplicateSortedArray duplicateSortedArrayObj=new RemoveDuplicateSortedArray();
	        int []array=new int [] {2,6,17,0,1,7,2,6,2,1,7,9,1};
	        Arrays.sort(array);
	        int []distinctArray=duplicateSortedArrayObj.getDistinctArray(array);
	       
	        //printing distinct element of an array
	        for(int index=0;index<distinctArray.length-1;index++)
	        {
	    	   if(distinctArray[index]!=0) 
	    	   {
	    		  System.out.println(distinctArray[index]+"  ");
	    	   }
	        }
		}
		/**
		 * method name- getDistinctArray
		 * @author Vinod Varme
		 * input parameter-one integer array type
		 * objective-this method remove duplicate element present in a give array and return array with distinct element.
		*/
		public int[] getDistinctArray(int[] array) {
		  	for(int index=0;index<array.length-1;index++)
		  	{
		  	  if(array[index]!=0) {
		  		for(int iterator=index+1;iterator<array.length-1;iterator++)
		  		{
		  			if(array[index]==array[iterator])
		  			{
		  		       array[iterator]=0;
		  			}
		  		}
		  	  }
		  	}
			
		  return array;
		}
	}
