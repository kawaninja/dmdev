package com.kawaninja.lesson4Practice;

public class LeapYear {
	public static void leap (int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year% 100 !=0))
				System.out.println(year + " год високосный");
		else 
			System.out.println(year + " год не високосный");
		
	}
	public static void main(String[] args) {
		LeapYear.leap (1992);
		LeapYear.leap (1800);
		LeapYear.leap (2000);
		LeapYear.leap (2017);
	}
	
	

}
