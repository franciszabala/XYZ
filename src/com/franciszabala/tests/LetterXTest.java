package com.franciszabala.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.franciszabala.letters.Letter;
import com.franciszabala.letters.X;


public class LetterXTest {
	@Test
	public void testLetterXInit() {
		int size = 3;
		Letter l = new X(size);
		String[][] letterArray = l.generateLetter();
		//expected vs reality
		assertEquals(size,letterArray.length);
		assertEquals(size,letterArray[0].length);
	}
	
	@Test
	public void testLetterXSize3() {
		
		int size = 3;
		Letter l = new X(size);
		String[][] letterArray = l.generateLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE},
										{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
										{Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}
	
	@Test
	public void testLetterXSize5() {
		
		int size = 5;
		Letter l = new X(size);
		String[][] letterArray = l.generateLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE},
									{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
									{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}
	
	@Test
	public void testLetterXSize7() {
		
		int size = 7;
		Letter l = new X(size);
		String[][] letterArray = l.generateLetter();
		String[][] expectedArray = {{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE},
									{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE},
									{Letter.SPACE,Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE,Letter.SPACE},
									{Letter.NON_SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.SPACE,Letter.NON_SPACE}};
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				assertEquals(expectedArray[i][j], letterArray[i][j]);
			}
		}
	}
	
}
