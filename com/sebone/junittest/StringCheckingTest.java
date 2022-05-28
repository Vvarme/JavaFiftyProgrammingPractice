/**
 * 
 */
package com.sebone.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sebone.java.programpractice.StringChecking;

/**
 * @author Vinod Verme
 *
 */
public class StringCheckingTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		StringChecking stringChecking=new StringChecking();
		assertEquals(true,stringChecking.stringSearch("we are the part of sebone", "part"));
	}

}
