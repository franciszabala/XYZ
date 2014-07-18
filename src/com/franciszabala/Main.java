package com.franciszabala;

import java.io.*;

public class Main {
	public static void main (String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter odd numbers only. Minimum of 3 ");
        System.out.print("What is the size of the letters?: ");
        String letterSize = null;
        try {
        	letterSize = reader.readLine();
        	
        	//validate
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You entered : " + letterSize);
	}
	
	String validateInput(String letterSize) {
		return null;
	}
}
