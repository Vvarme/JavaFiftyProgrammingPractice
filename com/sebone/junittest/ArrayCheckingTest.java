
package com.sebone.junittest;
	
	import static org.junit.Assert.*;
	
	import org.junit.Test;
	
	import com.sebone.java.programpractice.ArrayChecking;
	
	/**
	 * @author Vinod Verme
	 *
	 */
	public class ArrayCheckingTest {
	
		@Test
		public void test() {
			//fail("Not yet implemented");
			ArrayChecking arrayChecking=new ArrayChecking();
			
			int firstArray[]=new int[] {5,2,16,9,13,0,50,8};
			int secondArray[]=new int[]{9,50,16,8,13,5,2,0};
			
			assertEquals(true,arrayChecking.compareTwoArrays(firstArray,secondArray));
		}
	
	}
