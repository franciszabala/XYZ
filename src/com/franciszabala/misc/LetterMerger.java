package com.franciszabala.misc;

import java.util.ArrayList;
import java.util.List;

import com.franciszabala.letters.Letter;

public abstract class LetterMerger {
	
	private List<Letter> listOfLetters = new ArrayList<Letter>();
	private String[][] mergedResult;

	public void addArrayToMerge(Letter letter) {
		// TODO Auto-generated method stub
		getListOfLetters().add(letter);
		
	}

	public int getMergedCount() {
		// TODO Auto-generated method stub
		return getListOfLetters().size();
	}

	public String[][] getMergedResult() {
		// TODO Auto-generated method stub
		return mergedResult;
	}
	
	public abstract String[][] mergeLetters();

	protected List<Letter> getListOfLetters() {
		return listOfLetters;
	}

	protected void setListOfLetters(List<Letter> listOfLetters) {
		this.listOfLetters = listOfLetters;
	}
	
	
	
	

	

}
