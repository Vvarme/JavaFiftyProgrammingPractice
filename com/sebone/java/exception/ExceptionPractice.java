
	package com.sebone.java.exception;
	import java.lang.Exception;

	/**
	 * @author Vinod Verme
	 *
	*/
	public class ExceptionPractice {
		/*
		public  MyData setMyData(int id, String name,int age) {
		     MyData myData=new MyData();
		     
		     myData.setMyId(id);
		     myData.setMyName(name);
			 myData.setMyAge(age);
			
		     return myData;
		     
		}
	*/
       public static void main(String[] args) {
    	   try {	
    		   MyData myData=new MyData();
	     
    		//   ExceptionPractice exceptionPractice=new ExceptionPractice();
    		   myData.setMyId(101);
    		   myData.setMyName("Sebone");
    		   myData.setMyAge(17);
    		   myData.setMyAge(19);
		    
	     
    	   }
    	   catch(AgeOutOfBoundException e) {
    		   System.out.print(e.getMessage());
    	   }
 
       }
}
