package by.epam.hw03.branches;

/* 37. Вычислить значение функции */

public class Task37 {

	public static void main(String[] args) {

		double x = 2;
		double result = 0;

		if (x >= 3) {
			result = (-x) * (-x) + 3 * x + 9;
			System.out.printf("При x = %.0f (x >= 3), значение функции = %f\n", x, result);
		} else {
			result = 1 / (x * x * x - 6);
			System.out.printf("При x = %.0f (x < 3), значение функции = %f\n", x, result);
		}

	}
}
