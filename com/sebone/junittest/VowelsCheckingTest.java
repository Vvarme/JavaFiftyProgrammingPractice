/**
 * 
 */
package com.sebone.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sebone.java.programpractice.VowelsChecking;

/**
 * @author Vinod Verme
 *
 */
public class VowelsCheckingTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//VowelsChecking vowelseCheckin=new VowelseChecking();
		VowelsChecking vowelChecking=new VowelsChecking();
		assertEquals(true,vowelChecking.checkVowels("sebone technology"));

	}

}
