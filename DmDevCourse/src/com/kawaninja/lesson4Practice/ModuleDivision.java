package com.kawaninja.lesson4Practice;

public class ModuleDivision {
	
	public static void division (int value) {
		if (value % 10 == 3) 
			System.out.println("Число заканчивается на 3");
		else 
			System.out.println("Число не заканчивается на 3");
	}
	public static void main(String[] args) {
		
		ModuleDivision.division(453);
		ModuleDivision.division(2222);
	
}
}
