package com.kawaninja.lesson5;

public class Function {

	public static void leap(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			System.out.println(year + " год високосный");
		else
			System.out.println(year + " год не високосный");

	}

	public static void main(String[] args) {
//		Function.leap(1992);
//		Function.leap(1800);
//		Function.leap(2000);
//		Function.leap(2017);
		int value = 1997;
		boolean result = isLeapYear(value);
		System.out.println(result);
	}

	public static boolean isLeapYear (int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
//		if (result)
//			return true;
//		else
//			return false;

	}

}
