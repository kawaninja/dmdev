package com.kawaninja.lesson42;

public class SwitchExample {

	public static void main(String[] args) {
		var value = 1;
		var charValue = switch (value) {
		case 1 -> '1';
		case 2, 4 -> '2';
		default -> '0';
		};

		switch (value) {
		case 1:
			System.out.println("value == 1");
			break;
		case 2:
			System.out.println("value == 2");
			break;
		case 10:
			System.out.println("value == 10");
			break;
		case 28:
			System.out.println("value == 28");
			break;
		default:
			System.out.println("Нет такого значения");
		}
	}

}
