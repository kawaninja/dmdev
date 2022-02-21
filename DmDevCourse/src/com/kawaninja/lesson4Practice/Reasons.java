package com.kawaninja.lesson4Practice;

public class Reasons {

	public static void reason(int mounth) {
		if ((mounth == 12) || (mounth == 1) || (mounth == 2))
			System.out.println("Зима");
		else if ((mounth == 3) || (mounth == 4) || (mounth == 5))
			System.out.println("Весна");
		else if ((mounth == 6) || (mounth == 7) || (mounth == 8))
			System.out.println("Лето");
		else if ((mounth == 9) || (mounth == 10) || (mounth == 11))
			System.out.println("Осень");
		else
			throw new NullPointerException("Неверный месяц");

	}

	public static void main(String[] args) {

		Reasons.reason(1);
		Reasons.reason(4);
		Reasons.reason(8);
		Reasons.reason(11);
		Reasons.reason(90);
	}

}
