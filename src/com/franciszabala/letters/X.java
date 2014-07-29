package com.franciszabala.letters;

public class X extends Letter{

	
	public X(int size) {
		// TODO Auto-generated constructor stub
		super(size);
	}

	@Override
	public void generateLetter() {
		// TODO Auto-generated method stub
		//String[][] array = new String[super.size][super.size];
		int size = super.getSize();
		String[][] array = new String[size][size];
		
		for (int yCoor = 0, i = 0, h = size-1 ; yCoor<size; yCoor++) {
            for (int xCoor = 0; xCoor < size; xCoor++) {
                if (xCoor==i){
                	array[xCoor][yCoor] = NON_SPACE;
                } else if (h==xCoor) {
                	array[xCoor][yCoor] = NON_SPACE;
                }
                else {
                	array[xCoor][yCoor] = SPACE;
                }
            }          
            i++;
            h--;
        }
		setGeneratedLetter(array);
	}

}
