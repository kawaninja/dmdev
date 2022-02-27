package com.kawaninja.lesson6;

public class HomeWork3 {
	public static void main(String[] args) {
		sum(24);

	}

	public static double sum(double sourceSum) {
		double result = sourceSum;
		for (int year = 1626 + 1; year <= 2022; year++) {
			double percent = result * 0.05;
			result += percent;
			System.out.println(year + ": " + result);
		}
		return result;
	}

}
