package by.epam.hw03.branches;

/* 40. Вычислить значение функции */

public class Task40 {

	public static void main(String[] args) {

		double x = 3;
		double result = 0;

		if (x <= 13) {
			result = (-x) * (-x) * (-x) + 9;
			System.out.printf("При x = %.0f (x <= 13), значение функции = %f\n", x, result);
		} else {
			result = (-3) / (x + 1);
			System.out.printf("При x = %.0f (x > 13), значение функции = %f\n", x, result);
		}

	}
}
