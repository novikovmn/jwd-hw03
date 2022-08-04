package by.epam.hw03.cycle;

/* 30. Написать программу, переводящую римские цифры в арабские */

public class Task30 {

	public static void main(String[] args) {

		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] arabic = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String input = "DCCXCIX";
		StringBuilder inputCopy = new StringBuilder(input);

		int inputToArabic = 0;
		int i = 0;

		while (true) {

			while (inputCopy.length() >= roman[i].length()) {
				if (inputCopy.substring(0, roman[i].length()).equals(roman[i])) {
					inputToArabic += arabic[i];
					inputCopy.delete(0, roman[i].length());
				} else {
					break;
				}
			}

			i++;

			if (i >= roman.length) {
				break;
			}

		}

		System.out.printf("Римское число %s = арабскому числу %d", input, inputToArabic);

	}

}
