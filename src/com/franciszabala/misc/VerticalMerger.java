package com.franciszabala.misc;

import com.franciszabala.letters.Letter;


public class VerticalMerger extends LetterMerger {


	@Override
	protected String[][] mergeLetters() {
		// TODO Auto-generated method stub
		
		String[][] mergedLetters;
		String[][] generatedLetter;
		
		Letter letterTemp = getFirstItemOnListOfLetters();
		//size or dimension of the letter
		int letterSize = letterTemp.getSize();
		//the size when all the letters are merged horizontally
		int mergeLetterSize = letterSize * getListOfLetters().size();
		
		mergedLetters = new String[mergeLetterSize][letterSize];
		
		//temp storage for a letter on the list
		generatedLetter = new String[letterSize][letterSize];
		
		for (int row = 0; row < letterTemp.getSize(); row++) {
			java.util.Arrays.fill(mergedLetters[row],"[]");
		}
		
		//loop through each letter
		for (int i = 0; i < getListOfLetters().size(); i++) {
			//put something here
		
			//initialize
			letterTemp = getListOfLetters().get(i);

			generatedLetter = letterTemp.getGeneratedLetter();
			
			for (int row = 0; row < letterTemp.getSize(); row++) {
				for (int column = 0; column < letterTemp.getSize(); column++) {
					mergedLetters[row + (i*letterSize)][column] = generatedLetter[row][column];
				}
			}
			
		}

		
		for (int row = 0; row < mergedLetters.length; row++) {
			for (int column = 0; column < mergedLetters[row].length; column++) {
				System.out.print(mergedLetters[row][column]);
			}
			System.out.println();
		}
		
		return mergedLetters;
	}
	
	


}
