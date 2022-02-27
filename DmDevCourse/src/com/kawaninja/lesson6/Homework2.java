package com.kawaninja.lesson6;

public class Homework2 {
	public static void main(String[] args) {
		int value = 5;
		int result = factorial(value);
		System.out.println(result);

	}

	public static int factorial(int value) {
		int result = 0;
		for (int i = 1; i <= value; i++)
			result += i;

		return result;
	}
}
