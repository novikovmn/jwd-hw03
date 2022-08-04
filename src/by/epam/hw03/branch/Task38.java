package by.epam.hw03.branch;

/* 38. Вычислить значение функции */

public class Task38 {

	public static void main(String[] args) {

		double x = 3;
		double result = 0;

		if (x >= 0 && x <= 3) {
			result = x*x;
			System.out.printf("При x = %.0f (0 <= x <= 3), значение функции = %f\n", x, result);
		} else if(x < 0 || x > 3) {
			result = 4;
			System.out.printf("При x = %.0f (x < 0 или x > 3), значение функции = %f\n", x, result);
		}

	}
}
	