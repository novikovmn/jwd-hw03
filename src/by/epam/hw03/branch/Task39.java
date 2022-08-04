package by.epam.hw03.branch;

/* 39. Вычислить значение функции */

public class Task39 {

	public static void main(String[] args) {

		double x = 3;
		double result = 0;

		if (x >= 8) {
			result = (-x) * (-x) + x - 9;
			System.out.printf("При x = %.0f (x >= 8), значение функции = %f\n", x, result);
		} else {
			result = 1 / (x * x * x * x - 6);
			System.out.printf("При x = %.0f (x < 8), значение функции = %f\n", x, result);
		}

	}
}
