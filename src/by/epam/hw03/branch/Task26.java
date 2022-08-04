package by.epam.hw03.branch;

/*26. Написать программу нахождения суммы большего и меньшего из трех чисел. */

public class Task26 {
	public static void main(String[] args) {
		
		sumMinAndMax(1, 2, 3); 

	}

	public static void sumMinAndMax(int a, int b, int c) {
		System.out.printf("Дано: %d, %d и %d\n", a, b, c);
		int min = minNumber(a, b, c);
		int max = maxNumber(a, b, c);
		System.out.printf("Меньшее = %d\n", min);
		System.out.printf("Большее = %d\n", max);
		System.out.printf("Их сумма = %d\n", min + max);
	}

	public static int minNumber(int a, int b, int c) {
		int min = a;

		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		if (c < min) {
			min = c;
		}

		return min;
	}

	public static int maxNumber(int a, int b, int c) {
		int max = a;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		return max;
	}
}
