package com.franciszabala.letters;

public class Y extends Letter {

	public Y(int size) {
		// TODO Auto-generated constructor stub
		super.setSize(size);
	}

	@Override
	public String[][] generateLetter() {
		
		int size = super.getSize();
		
		String[][] array = new String[size][size];
		
		 for (int xCoor = 0, i = 0, h = size-1; xCoor<size; xCoor++) {
	            if (xCoor<size/2) {
	            for (int yCoor = 0; yCoor < size; yCoor++) {
	                if (yCoor==i){
	                	array[xCoor][yCoor] = NON_SPACE;
	                } else if (h==yCoor) {
	                	array[xCoor][yCoor] = NON_SPACE;
	                }
	                else {
	                	array[xCoor][yCoor] = SPACE;
	                }
	            }          
	            i++;
	            h--;
	            } else {
	                for (int yCoor = 0; yCoor <size; yCoor++) {
	                    if (yCoor==((size/2))){
	                    	array[xCoor][yCoor] = NON_SPACE;
	                    }
	                    else {
	                    	array[xCoor][yCoor] = SPACE;
	                    }        
	                }
	            }
	        }
		
		return array;
	}
}
