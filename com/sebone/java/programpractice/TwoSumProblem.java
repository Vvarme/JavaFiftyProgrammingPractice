/**
 * 
 */
	package com.sebone.java.programpractice;

	import java.util.Scanner;
	
	/**
	 * @author Vinod Verme
	 *
	*/
	public class TwoSumProblem {
		
		public static void main(String[] args) {
			
			TwoSumProblem twoSumObject=new TwoSumProblem();
			Scanner scanner=new Scanner(System.in);
			
			int []array={2,56,7,45,9,4,20,3,1,9,5,12,6};
			System.out.println("Enter target value: ");
			int targetValue=scanner.nextInt();
			
			int[]result=twoSumObject.getTwoSumArray(array, targetValue);
			for(int i=0;i<result.length;i++) {
				System.out.print(result[i]+"  ");
	
			}
	
		}
		public int[]getTwoSumArray(int []array,int target){
			int tempArray[]=new int [2];
			for(int i=0;i<array.length;i++) {
				for(int j=i+1;j<array.length;j++) {
					if((array[i]+array[j])==target) {
						tempArray[0]=i;
						tempArray[1]=j;
						break;
					}
				}
			}
		  return tempArray;
			
		}
	}
