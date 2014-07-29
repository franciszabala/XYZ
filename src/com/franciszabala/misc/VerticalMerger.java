package com.franciszabala.misc;

import com.franciszabala.letters.Letter;


public class VerticalMerger extends LetterMerger {


	@Override
	protected String[][] mergeLetters() {
		// TODO Auto-generated method stub
		
		String[][] mergedLetters;
		String[][] lettersPlaceholder;
		
		Letter letterTemp = getFirstItemOnListOfLetters();
		//size or dimension of the letter
		int letterSize = letterTemp.getSize();
		//the size when all the letters are merged horizontally
		int mergeLetterSize = letterSize * getListOfLetters().size();
		
		mergedLetters = new String[mergeLetterSize][letterSize];
		
		//temp storage for a letter on the list
		lettersPlaceholder = new String[letterSize][letterSize];
		
		//loop through each letter
		for (int i = 0; i < getListOfLetters().size(); i++) {
			//put something here
		
			//initialize
			for (int y = 0; y < letterTemp.getSize(); y++) {
				java.util.Arrays.fill(mergedLetters[y],"[]");
			}

			lettersPlaceholder = letterTemp.getGeneratedLetter();
			
			for (int y = 0; y < letterTemp.getSize(); y++) {
				for (int x = 0; x < letterTemp.getSize(); x++) {
					mergedLetters[y][x] = lettersPlaceholder[y][x];
				}
			}
			
			//System.out.println(letterPlaceHolder);
			
			//for 
			
		}
	
//		for (int y = 0; y < expectedArray.length; y++) {
//			for (int x = 0; x < expectedArray[y].length; x++) {
//				//System.out.print(expectedArray[y][x]);
		
		
		for (int y = 0; y < mergedLetters.length; y++) {
			for (int x = 0; x < mergedLetters[y].length; x++) {
				System.out.print(mergedLetters[y][x]);
			}
			System.out.println();
		}
		
		return mergedLetters;
	}
	
	


}
