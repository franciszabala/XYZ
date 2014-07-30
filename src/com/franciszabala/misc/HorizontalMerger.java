package com.franciszabala.misc;

import com.franciszabala.letters.Letter;


public class HorizontalMerger extends LetterMerger {


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
		
		mergedLetters = new String[letterSize][mergeLetterSize];
		
		//temp storage for a letter on the list
		generatedLetter = new String[letterSize][letterSize];
		
		for (int y = 0; y < letterTemp.getSize(); y++) {
			java.util.Arrays.fill(mergedLetters[y],"[]");
		}
		
		//loop through each letter
		for (int i = 0; i < getListOfLetters().size(); i++) {
			//put something here
			letterTemp = getListOfLetters().get(i);
			//Class<? extends Letter> c = getListOfLetters().get(i).getClass();
			//System.out.println(c.getName());
			//initialize
			generatedLetter = letterTemp.getGeneratedLetter();
			for (int y = 0; y < letterTemp.getSize(); y++) {
				for (int x = 0; x < letterTemp.getSize(); x++) {
					mergedLetters[y][x+ (i*letterSize)] = generatedLetter[y][x];
				}
			}
		}

		for (int y = 0; y < mergedLetters.length; y++) {
			for (int x = 0; x < mergedLetters[y].length; x++) {
				System.out.print(mergedLetters[y][x]);
			}
			System.out.println();
		}
		
		return mergedLetters;
	}
	
	


}
