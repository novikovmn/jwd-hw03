package by.epam.hw03.cycle;

/*34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15*/

public class Task34 {

	public static void main(String[] args) {

		int from = 1000;
		int to = 9999;
		int toCompare = 15;

		for (int i = from; i <= to; i++) {
			int digitsSum = sumOfDigits(i);
			if(digitsSum == toCompare) {
				System.out.printf("Сумма цифр числа %d = %d\n", i, toCompare);
			}
		}

	}

	public static int sumOfDigits(int number) {

		int firstDigit = number / 1000;
		int secondDigit = (number / 100) % 10;
		int thirdDigit = (number / 10) % 10;
		int fourthDigit = number % 10;

		return firstDigit + secondDigit + thirdDigit + fourthDigit;

	}

}
