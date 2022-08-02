package by.epam.hw03.cycles;

/* 13. Составить таблицу значений функции y = 5 - x^2/2 на отрезке [-5; 5] с шагом 0.5. 
 */

public class Task13 {

	public static void main(String[] args) {

		double a = -5;
		double b = 5;
		double h = 0.5;
		double y = 0;

		System.out.println("|\t\tx\t\t|\t\ty\t\t|");
		System.out.println("|===============================================================|");
		for (double x = a; x <= b; x += h) {
			y = (5 - x * x) / 2;
			System.out.printf("|\t\t%.1f\t\t|\t\t%.2f\t\t|\n", x, y);
		}
		System.out.println("|===============================================================|");

	}

}
