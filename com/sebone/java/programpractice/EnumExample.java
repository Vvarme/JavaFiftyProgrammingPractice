
	package com.sebone.java.programpractice;

	/**
	 * @author Vinod Verme
	 *
	 */
	public class EnumExample {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			Level myVar = Level.FIRST;

			    switch(myVar) {
			      case FIRST:
			        System.out.println("Low level");
			        break;
			      case SECOND:
			         System.out.println("Medium level");
			        break;
			      case THIRD:
			        System.out.println("High level");
			        break;
			    }

		}
	}
	enum Level{
		FIRST,
		SECOND,
		THIRD;
	}
