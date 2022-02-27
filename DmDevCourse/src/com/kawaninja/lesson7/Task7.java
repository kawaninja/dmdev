package com.kawaninja.lesson7;

public class Task7 {
	public static void main(String[] args) {
		int values [] = {1,3,5,6,8,9};
//		printArray(values);
//		printArrayForEach(values);
		printArrayReverce(values);
	}
	public static void printArrayReverce (int values []) {
		for (int i = values.length - 1; i >= 0; i--) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	public static void printArray (int values []) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	public static void printArrayForEach (int values []) {
		for (int i : values) {
			System.out.print(i + " ");	
		}
		System.out.println();
	}
}
