package com.sebone.junittest;

	import static org.junit.Assert.*;
	
	import org.junit.Test;
	
	import com.sebone.java.programpractice.CharacterRemoveFromString;
	
	public class CaharacterDuplicateTest {
	
		@Test
		public void test() {
			//fail("Not yet implemented");
			CharacterRemoveFromString characterDuplicates=new CharacterRemoveFromString();
			assertEquals("we are the part of ebone",characterDuplicates.getWithoutCharString("we are the part of sebone", 's'));
		}
	
	}
