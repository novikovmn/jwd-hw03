package by.epam.hw03.branches;

/* 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую 
степень — отрицательные.  */

public class Task12 {

	public static void main(String[] args) {

		double[] numbers = { 5.0, -3.0, 2.0 };

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > 0) {
				System.out.println(numbers[i] + " -> " + Math.pow(numbers[i], 2));
			}

			if (numbers[i] < 0) {
				System.out.println(numbers[i] + " -> " + Math.pow(numbers[i], 4));
			}

		}

	}

}
