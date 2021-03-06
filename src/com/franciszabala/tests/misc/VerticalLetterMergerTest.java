package com.franciszabala.tests.misc;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.franciszabala.letters.Letter;
import com.franciszabala.letters.X;
import com.franciszabala.letters.Y;
import com.franciszabala.letters.Z;
import com.franciszabala.misc.HorizontalMerger;
import com.franciszabala.misc.LetterMerger;
import com.franciszabala.misc.VerticalMerger;

public class VerticalLetterMergerTest {
	
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
		LetterMerger arrayMerger = new VerticalMerger();
		arrayMerger.addLetterToMerge(x);
		assertEquals(1, arrayMerger.getMergedCount());

		arrayMerger.addLetterToMerge(y);
		assertEquals(2, arrayMerger.getMergedCount());
		
		arrayMerger.addLetterToMerge(z);
		assertEquals(3, arrayMerger.getMergedCount());
	}

	@Test
	public void testMerge() {
		LetterMerger arrayMerger = new VerticalMerger();
		
		arrayMerger.addLetterToMerge(x);
		//x.toString();
		arrayMerger.addLetterToMerge(y);
		//y.toString();
		arrayMerger.addLetterToMerge(z);
		//z.toString();

		String[][] arrayResult = arrayMerger.getMergedResult();
		int letterCount = x.getSize() + y.getSize() + z.getSize(); 
		
		
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE},
				{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
				{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
				{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
				{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE},
				{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE},
				{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
				{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
				{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
				{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
				{Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE},
				{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
				{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
				{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
				{Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE}};

		
		assertEquals(letterCount, arrayResult.length);
		
		for (int y = 0; y < expectedArray.length; y++) {
			for (int x = 0; x < expectedArray[y].length; x++) {
				assertEquals(expectedArray[y][x], arrayResult[y][x]);
			}
		}

	}

}
