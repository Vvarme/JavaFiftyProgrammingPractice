	package com.sebone.java.programpractice;
	
	public class LargestAndSecondFromArray {
	
		public static void main(String[] args) {
			
			LargestAndSecondFromArray largestAndSecondObj=new LargestAndSecondFromArray();
			int[] array = { 17, 12, 3,45,32,8,11,27,16,31 };
			System.out.println("Second largest number in the array is :"+largestAndSecondObj.getLargest(array));
		
        }
		// return largest and second largest
	    public int 	getLargest(int []array) {
	    	
	    	int firstLargest=array[0];
            int secondLargest = 0;
            
            for(int i = 0; i < array.length; i++)
            {
                if (firstLargest < array[i])
                {
                    secondLargest = firstLargest;
                    firstLargest = array[i];
                }
                else if(secondLargest < array[i])
                {
                    secondLargest= array[i];

                }

            }
          return secondLargest;

	    }
		
	
	}
