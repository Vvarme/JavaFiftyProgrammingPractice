	package com.sebone.java.programpractice;

	public class PolyMorphismExample {

	public static void main(String[] args) {
		
		PolyMorphismExample polyMorphismExample=new PolyMorphismExample();
		System.out.println("Addition of numbers is: "+polyMorphismExample.addition(4,6));
	}
	public int addition(int firstInput,int secondInput) {
		return (firstInput+secondInput);
	}
	public int addition(int firstInput,int secondInput,int thirdInput ) {
		return (firstInput+secondInput+thirdInput);

	}

}
