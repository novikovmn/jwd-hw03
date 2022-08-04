package by.epam.hw03.branch;

/* 5. Составить программу: определения наименьшего из двух чисел а и b. 
 */

public class Task05 {

	public static void main(String[] args) {

		int a = 8;
		int b = 2;

		System.out.printf("Даны числа %d и %d. Какое является наименьшим?\n", a, b);
		System.out.printf("Ответ: %d", findMin(a, b)); 

	}

	public static int findMin(int a, int b) {
		int min = -1;

		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		return min;
	}

}
