package com.franciszabala.misc;

import java.util.ArrayList;
import java.util.List;

import com.franciszabala.letters.Letter;

public abstract class LetterMerger {
	
	private List<Letter> listOfLetters = new ArrayList<Letter>();
	private String[][] mergedResult;

	protected abstract String[][] mergeLetters();
	
	public void addLetterToMerge(Letter letter) {
		// TODO Auto-generated method stub
		getListOfLetters().add(letter);
		
	}

	public int getMergedCount() {
		// TODO Auto-generated method stub
		return getListOfLetters().size();
	}

	public String[][] getMergedResult() {
		// TODO Auto-generated method stub
		mergedResult = mergeLetters();
		return mergedResult;
	}
	

	protected List<Letter> getListOfLetters() {
		return (List<Letter>) listOfLetters;
	}

	protected void setListOfLetters(List<Letter> listOfLetters) {
		this.listOfLetters = listOfLetters;
	}
	
	protected Letter getFirstItemOnListOfLetters() {
		return ((List<Letter>) listOfLetters).get(0);
	}


}
