package com.kawaninja.lesson6;

import java.util.Iterator;

public class HomeWorek5 {
	public static void main(String[] args) {
		printLetters();
	}
	public static void printLetters () {
		for (char letter = 'b'; !isVowel(letter); letter ++) {
			System.out.println(letter);
			
		}
	}
	
	public static boolean isVowel (char value) {
		return value == 'a' || value == 'e' || value == 'i'|| value == 'o'|| value == 'u';
	}

}
