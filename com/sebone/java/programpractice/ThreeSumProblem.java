	package com.sebone.java.programpractice;

	import java.util.Scanner;

	public class ThreeSumProblem {
		public static void main(String[] args) {
		
			ThreeSumProblem twoSumObject=new ThreeSumProblem();
		Scanner scanner=new Scanner(System.in);
		
		int []array={-1,0,1,2,-1,-4};
				//2,56,7,45,9,4,20,3,1,9,5,12,6};
		//System.out.println("Enter target value: ");
		//int targetValue=scanner.nextInt();
		
		int[]result=twoSumObject.getTwoSumArray(array);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"  ");

		}

	}
	public int[]getTwoSumArray(int []array){
		int tempArray[]=new int [3];
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
			   for(int k=j+1;k<array.length;k++)
				if((array[i]+array[j]+array[k])==0) {
					tempArray[0]=array[i];
					tempArray[1]=array[j];
					tempArray[2]=array[k];
					break;
				}
			}
		}
	  return tempArray;
		
	}
 }
