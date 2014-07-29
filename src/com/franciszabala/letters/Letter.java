package com.franciszabala.letters;

public abstract class Letter {
	
	public static final String SPACE = "[ ]";
	public static final String NON_SPACE = "[*]";
	private String[][] generatedLetter;
	private int size;
	
	public abstract void generateLetter();
	
	public Letter() {
		// TODO Auto-generated constructor stub
	}
	
	public Letter(int size) {
		this();
		setSize(size);
		setGeneratedLetter(new String[size][size]);
		generateLetter();

	}

	public String[][] getGeneratedLetter() {
		return generatedLetter;
	}

	
	public int getSize() {
		return size;
	}
	
	protected void setSize(int size) {
		this.size = size;
	}

	protected void setGeneratedLetter(String[][] generatedLetter) {
		this.generatedLetter = generatedLetter;
	}

	@Override
	public String toString() {
		
		for (int i = 0; i < generatedLetter.length; i++) {
			for (int j=0; j < generatedLetter[i].length; j++) {
				System.out.print(generatedLetter[i][j]);
			}
			System.out.println();
		}
		
		return "Letter [size=" + size + "]";
	}
	



}
