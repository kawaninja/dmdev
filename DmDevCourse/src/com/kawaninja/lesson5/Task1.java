package com.kawaninja.lesson5;

public class Task1 {
	public static void main(String[] args) {
		int value1 = 5;
		int value2 = 10;
		int result = isInt (value1, value2);
		System.out.println(result);
	}

//	public static int getMax(int firstValue, int secondValue) {
//
//	}

	public static int isInt(int a, int b) {
		if (a > b)return  a;
		else return b;
	}

	}
