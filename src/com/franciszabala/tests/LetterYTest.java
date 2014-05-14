package com.franciszabala.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.franciszabala.letters.Letter;
import com.franciszabala.letters.X;
import com.franciszabala.letters.Y;

public class LetterYTest {

	@Test
	public void testLetterYInit() {
		int size = 3;
		Letter l = new Y(size);
		String[][] letterArray = l.generateLetter();
		//expected vs reality
		assertEquals(size,letterArray.length);
		assertEquals(size,letterArray[0].length);
	}
	
	@Test
	public void testLetterYSize3() {
		
		int size = 3;
		Letter l = new Y(size);
		String[][] letterArray = l.generateLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE},
										{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
										{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}
	
	@Test
	public void testLetterYSize5() {
		
		int size = 5;
		Letter l = new Y(size);
		String[][] letterArray = l.generateLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE},
									{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
										{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
										{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}
	
	@Test
	public void testLetterYSize7() {
		
		int size = 7;
		Letter l = new Y(size);
		String[][] letterArray = l.generateLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE},
									{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}

}
