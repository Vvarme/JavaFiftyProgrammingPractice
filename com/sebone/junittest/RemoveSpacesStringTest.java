/**
 * 
 */
	package com.sebone.junittest;
	
	import static org.junit.Assert.*;
	
	import org.junit.Test;
	
	import com.sebone.java.programpractice.RemoveSpacesString;
	
		/**
		 * @author Vinod Verme
		 *
		 */
		public class RemoveSpacesStringTest {
		
			@Test
			public void test() {
				//fail("Not yet implemented");
				RemoveSpacesString removeSpacesString=new RemoveSpacesString();
				assertEquals("wearethepart",removeSpacesString.getWithoutSpaceString("we are the part"));
			}
		
	}
