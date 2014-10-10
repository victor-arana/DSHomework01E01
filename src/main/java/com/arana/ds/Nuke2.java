package com.arana.ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nuke2 {

       public static void main(String[] arg) throws Exception{

    	InputStreamReader keyboardInputStreamReader;
    	BufferedReader keyboardBufferedReader;
    	String inputLine = null;
    	String first = null;
    	String second = null;
    	
    	// 1. Create a BufferedReader to read text lines from the console.
    	keyboardInputStreamReader = new InputStreamReader(System.in);
    	keyboardBufferedReader = new BufferedReader(keyboardInputStreamReader);
    	
    	// 2. Prompts the user to enter a string
    	System.out.print("Please enter a string: ");
    	System.out.flush();
    	inputLine = keyboardBufferedReader.readLine();
    	keyboardBufferedReader.close();
    	keyboardInputStreamReader.close();

    	// 3. Extract the first character from the input string
    	first = inputLine.substring(0,1);
    	
    	// 4. Extract a string starting on the third character of the original string
    	second = inputLine.substring(2);
    	
    	// 5. Prints the result
    	System.out.println(first + second);
    }


}