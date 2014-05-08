package com.franciszabala.letters;

import java.util.ArrayList;
import java.util.List;

public abstract class Letter {
	
	public static final String SPACE = "[ ]";
	public static final String NON_SPACE = "[*]";
	
	private int size;
	
	public Letter() {
		// TODO Auto-generated constructor stub
	}
	
	public Letter(int size) {
		this();
		this.size = size;

	}
	
	public abstract String[][] generateLetter();

	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}


}
