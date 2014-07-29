package com.franciszabala.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.franciszabala.letters.Letter;
import com.franciszabala.letters.Z;

public class LetterZTest {

	@Test
	public void testLetterZInit() {
		int size = 3;
		Letter l = new Z(size);
		String[][] letterArray = l.getGeneratedLetter();
		//expected vs reality
		assertEquals(size,letterArray.length);
		assertEquals(size,letterArray[0].length);
	}
	
	@Test
	public void testLetterZSize3() {
		
		int size = 3;
		Letter l = new Z(size);
		String[][] letterArray = l.getGeneratedLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE},
										{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
										{Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}
	
	@Test
	public void testLetterZSize5() {
		
		int size = 5;
		Letter l = new Z(size);
		String[][] letterArray = l.getGeneratedLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
										{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
										{Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}
	
	@Test
	public void testLetterZSize7() {
		
		int size = 7;
		Letter l = new Z(size);
		String[][] letterArray = l.getGeneratedLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE,Letter.NON_SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}

}
