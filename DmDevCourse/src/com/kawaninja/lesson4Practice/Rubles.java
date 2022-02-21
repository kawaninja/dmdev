package com.kawaninja.lesson4Practice;

public class Rubles {
	public static void count (int rubl) {
		if ((rubl % 10 == 1) && (rubl % 100 != 11))
			System.out.println(rubl + " рубль");
		else if ((rubl % 10 >=2) && (rubl % 10 <=4)&& (rubl % 100 !=12)
				&&(rubl % 100 !=13) && (rubl % 100 !=14))
			System.out.println(rubl + " рубля");
		else 
			System.out.println(rubl + " рублей");
		
	}
	
	public static void main(String[] args) {
		Rubles.count(11);
		Rubles.count(14);
		Rubles.count(1001);
		Rubles.count(1002);
	}

}
