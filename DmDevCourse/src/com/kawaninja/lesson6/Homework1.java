package com.kawaninja.lesson6;
//1. Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.

public class Homework1 {
	public static void main(String[] args) {
		int value = 7;
		int result = factorial (value);
		int result2 = whileFactorial (value);
		System.out.println(result);
		System.out.println(result2);
	}
	
	public static int whileFactorial (int value) {
		int result = 1;
		int i =1;
		while (i <= value) {
			result *= i;
			i++;
		}
			return result;
		}
	
	
	public static int factorial (int value) {
		int result = 1;
		for (int i =1; i <= value; i++)
			result *= i;
		
		return result;
	}

}
