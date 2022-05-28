	package com.sebone.java.programpractice;

	public class ShowCaseOfInheritance {
			public static void main(String[]args)
			{
			
				Dog dogObj=new Dog();
				dogObj.eat();
	        }
	}
	class Dog extends Animal{
	    
		public void bark()
		{
			System.out.println("Dog is barking :");
		}
	}
	class Animal{
		
		public void eat() 
		{
			System.out.println("Animal is eating...");
		}
		
		public void run()
		{
			System.out.println("Animal is running :");
		}
		
	}
