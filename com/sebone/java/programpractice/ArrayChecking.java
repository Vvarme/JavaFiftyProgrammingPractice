	package com.sebone.java.programpractice;

	/**
	 * class name- ArrayChecking
	 * @author Vinod Verme
	 * objective-main objective of this class is to compare two arrays elements.
	*/
	public class ArrayChecking{

		public static void main(String[] args) {
			 
			ArrayChecking arrayChecking=new ArrayChecking();
			
			int firstArray[]=new int[] {5,2,16,9,13,0,50,8};
			int secondArray[]=new int[]{9,50,16,8,13,5,2,0};
			
			if(firstArray.length!=secondArray.length) 
			{
				System.out.println("both arrays elements are not equal");
			}
			else if(arrayChecking.compareTwoArrays(firstArray,secondArray))
			{
				System.out.println("both arrays elements are equal");
			}
			else
			{
				System.out.println("Both arrays elements are not equal");
			}
			
		}
		/**
		 * method name-compareTwoArrays
		 * @author Vinod Varme
		 * input parameter-two int array
		 * return type-boolean;
		 * objective-this method return true if both array contains same elements otherwise return false.
		*/
		public boolean compareTwoArrays(int[]firstArray,int[]secondArray) {
			boolean flag=false;
			for(int i=0;i<firstArray.length;i++)
			{
				for(int j=0;j<firstArray.length;j++) 
				{
					if(firstArray[i]==secondArray[j])
					{
						secondArray[j]=-1;
						flag=true;
						break;
					}
					else
					{
						flag=false;
					}
				}
				if(flag==false)
				{
					break;
				}
			}
	      if(flag==true) 
		  {
			return true;
		  }
		  else 
		  {
			return false;
		  }

	  }
	}
