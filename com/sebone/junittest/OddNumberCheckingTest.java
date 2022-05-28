package com.sebone.junittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sebone.java.programpractice.OddNumberChecking;

public class OddNumberCheckingTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		OddNumberChecking oddNumberChecking=new OddNumberChecking();
		List<Integer>list=new ArrayList<Integer>();
		list.add(3); 
		list.add(9);
		list.add(5);
		list.add(17);
		assertEquals(true,oddNumberChecking.getOddNumberList(list));
	}

}
