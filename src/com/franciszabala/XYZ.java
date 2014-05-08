package com.franciszabala;
 
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.franciszabala.letters.Letter;
 
public class XYZ {
	public static void main (String args[]) {
		Letter l = new Letter(3);
		String[][] letter = l.generateLetter();
		System.out.println(letter.length);
		
		//System.out.println(letter[0][0].length);
		
		String[][] letterArrayTemp = {{"*","[ ]","*"},
				{"[ ]","*","[ ]"},
				{"*","[ ]","*"}};

		int size = 3;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(letterArrayTemp[i][j]);
				//assertEquals(letterArray[i][j], letterArrayTemp[i][j]);
				
			}
			System.out.println();
		}
		/*
		 for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                System.out.print(letterArrayTemp[i][j]);
	            }
	            System.out.println();
	        }
	        */
	}
	
	
   /*  
    public static void main (String args[]) {
         
         
        int size = 13;
         
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What size : ");
        String username = null;
        try {
            username = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You entered : " + username);
         
        size = Integer.parseInt(username);
        //X
         
        String[][] arrayX = new String[size][size];
         
        for (int yCoor = 0, i = 0, h = size-1 ; yCoor<size; yCoor++) {
            for (int xCoor = 0; xCoor < size; xCoor++) {
                if (xCoor==i){
                    arrayX[xCoor][yCoor] = "[*]";
                } else if (h==xCoor) {
                    arrayX[xCoor][yCoor] = "[*]";
                }
                else {
                    arrayX[xCoor][yCoor] = "[ ]";
                }
            }          
            System.out.println();
            i++;
            h--;
        }
         
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arrayX[i][j]);
            }
            System.out.println();
        }
         
        String[][] arrayY = new String[size][size];
         
        //Y
        for (int xCoor = 0, i = 0, h = size-1; xCoor<size; xCoor++) {
             
            //System.out.print("[*]");
             
            if (xCoor<size/2) {
             
            for (int yCoor = 0; yCoor < size; yCoor++) {
                //if (i==1) {
                    //System.out.print("[*]");
                //} else {
                if (yCoor==i){
                    //System.out.print("[*]");
                    arrayY[xCoor][yCoor] = "[*]";
                } else if (h==yCoor) {
                    //System.out.print("[*]");
                    arrayY[xCoor][yCoor] = "[*]";
                }
                else {
                    //System.out.print("[ ]");
                    arrayY[xCoor][yCoor] = "[ ]";
                }
                //}
            }          
             
            System.out.println();
            i++;
            h--;
            } else {
                for (int yCoor = 0; yCoor <size; yCoor++) {
                    //if (i==1) {
                        //System.out.print("[*]");
                    //} else {
                    if (yCoor==((size/2))){
                        //System.out.print("[*]");
                        arrayY[xCoor][yCoor] = "[*]";
                    }
                    else {
                        //System.out.print("[ ]");
                        arrayY[xCoor][yCoor] = "[ ]";
                    }
                    //}
                     
                }
                System.out.println();
            }
        }
         
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arrayY[i][j]);
            }
            System.out.println();
        }
         
         
        String[][] arrayZ = new String[size][size];
        //Z
        for (int xCoor = 0, h = size-1 ; xCoor<size; xCoor++) {
             
            //System.out.print("[*]");
            for (int yCoor = 0; yCoor < size; yCoor++) {
                //if (i==1) {
                    //System.out.print("[*]");
                //} else {
                if ( (xCoor==0) || (xCoor == (size-1))) {
                    //System.out.print("[*]");
                    arrayZ[xCoor][yCoor] = "[*]";
                } else if (h == yCoor) {
                    //System.out.print("[*]");
                    arrayZ[xCoor][yCoor] = "[*]";
                }
                else {
                    //System.out.print("[ ]");
                    arrayZ[xCoor][yCoor] = "[ ]";
                }
                //}
            }          
             
            System.out.println();
            h--;
        }
         
         
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arrayZ[i][j]);
            }
            System.out.println();
        }
         
        List<String[][]> listOfLetters = new ArrayList<String[][]>();
         
        listOfLetters.add(arrayX);
        listOfLetters.add(arrayY);
        listOfLetters.add(arrayZ);
         
        String[][] all = new String[size][size*listOfLetters.size()];
        System.out.println("size: "+ size*listOfLetters.size() );
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int k=1; k <= listOfLetters.size(); k++) {
                for (int j = 0; j < size; j++) {
                    //System.out.println("i: " +i+" j: " +count);
                    all[i][count] = ((String[][])listOfLetters.get(k-1))[i][j];            
                    //all[i][count] = "0";
                    count++;
                }
            }
        }
         
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*listOfLetters.size(); j++) {
                System.out.print(all[i][j]);
            }
            System.out.println();
        }
         
    }
 	*/
}
