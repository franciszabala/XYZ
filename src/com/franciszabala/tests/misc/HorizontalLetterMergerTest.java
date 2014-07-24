package com.franciszabala.tests.misc;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.franciszabala.letters.Letter;
import com.franciszabala.letters.X;
import com.franciszabala.letters.Y;
import com.franciszabala.letters.Z;
import com.franciszabala.misc.HorizontalMerger;
import com.franciszabala.misc.LetterMerger;

public class HorizontalLetterMergerTest {
	
	 private static Letter x;
	 private static Letter y;
	 private static Letter z;
	 private static int letterSize;
	
	 @BeforeClass
	 public static void setUpClass() throws Exception {
	        System.out.println("@BeforeClass method will be executed before JUnit test for"
	                + "a Class starts");
	        letterSize = 5;
	        x = new X(letterSize);
	        y = new Y(letterSize);
	        z = new Z(letterSize);
	    }

	  @AfterClass
	  public static void tearDownClass() throws Exception {
	         System.out.println("@AfterClass method will be executed after JUnit test for"
	                + "a Class Completed");
	         x = null;
	         y = null;
	         z = null;
	    }

	 
	@Test
	public void testMergeCount() {
		LetterMerger arrayMerger = new HorizontalMerger();
		arrayMerger.addArrayToMerge(x);
		assertEquals(1, arrayMerger.getMergedCount());

		arrayMerger.addArrayToMerge(y);
		assertEquals(2, arrayMerger.getMergedCount());
		
		
		arrayMerger.addArrayToMerge(z);
		assertEquals(3, arrayMerger.getMergedCount());
	}

	
	@Test
	public void testMerge() {
		LetterMerger arrayMerger = new HorizontalMerger();
	
		arrayMerger.addArrayToMerge(x);
		arrayMerger.addArrayToMerge(y);
		arrayMerger.addArrayToMerge(z);
		
		String[][] arrayResult = arrayMerger.getMergedResult();
		
		assertEquals(x.getSize(), arrayResult[0].length);
		
		
		
		
		
		
	}

}
