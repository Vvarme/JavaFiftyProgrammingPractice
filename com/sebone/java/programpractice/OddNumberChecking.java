	package com.sebone.java.programpractice;
	import java.util.*;

	/**
	 * class name-OddNumberChecking
	 * @author Vinod Varme
	 * objective-main objective of this class is to remove all even numbers from list.
	*/
	public class OddNumberChecking {

		public static void main(String[] args) {
     
			List<Integer>list=new ArrayList<Integer>();
		
			OddNumberChecking oddNumberChecking=new OddNumberChecking();
		
			list.add(10);
			list.add(3);
			list.add(15);
			list.add(2);
			list.add(8);
			list.add(12);
			list.add(1);
			
			// System.out.print(oddNumberChecking.getOddNumberList(list));
			if(oddNumberChecking.getOddNumberList(list)) {
				System.out.println("list  contain only odd number ");
			}
			else {
				System.out.println("list contain some even numbers ");
			}
		}
		/**
		 * method name-getOddNumberList
		 * @author Vinod Varme
		 * input parameter-one list reference
		 * objective-this method removes all even numbers present in a given list and return list of odd numbers.
		*/
		public boolean getOddNumberList(List<Integer>list){
			
			boolean flag=true;
			// List<Integer>list2=new ArrayList<Integer>();
			for(int index=0;index<list.size();index++) {
				if((list.get(index)%2)==0) {
				   //list2.add(list.get(index));
					flag=false;
					
				}
			}
		 return flag;
		}

	}
