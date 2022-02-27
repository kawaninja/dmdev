package com.kawaninja.lesson7;

public class ArrayExample {
	public static void main(String[] args) {
		int values [] = new int [10];
//		System.out.println(values[3]);
		values [4] = 6;
		values [9] =  47;
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(i + ": " + values [i]);
		}
		
//		test();
	}

	public static void test() {
		int value = 10;
		int values [] = {1,2,3,4,5};
		System.out.println(values [3]);
		values [3] = 6;
		System.out.println(values [3]);
	}
	
}
