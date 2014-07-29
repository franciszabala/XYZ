package com.franciszabala.letters;

public class Z extends Letter {

	public Z(int size) {
		// TODO Auto-generated constructor stub
		super(size);
	}
	
	@Override
	public void generateLetter() {
		int size = super.getSize();
	
		String[][] array = new String[size][size];
		 for (int xCoor = 0, h = size-1 ; xCoor<size; xCoor++) {
	            for (int yCoor = 0; yCoor < size; yCoor++) {
	                if ( (xCoor==0) || (xCoor == (size-1))) {
	                	array[xCoor][yCoor] = NON_SPACE;
	                } else if (h == yCoor) {
	                	array[xCoor][yCoor] = NON_SPACE;
	                }
	                else {
	                	array[xCoor][yCoor] = SPACE;
	                }
	            }          
	            h--;
	        }
		 setGeneratedLetter(array);
	}

}
