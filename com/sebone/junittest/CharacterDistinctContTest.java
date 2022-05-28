	package com.sebone.junittest;
	
	import static org.junit.Assert.*;
	
	import org.junit.Test;
	
	import com.sebone.java.programpractice.CharacterDistinctCount;
	
	public class CharacterDistinctContTest {
	
		@Test
		public void test() {
			// fail("Not yet implemented");
			CharacterDistinctCount characterDistinct=new CharacterDistinctCount();
			assertEquals("we ar  th  p    of s b n    c   l gy",characterDistinct.getWithoutCharString("we are the part of sebone technology"));
		}
	
	}
