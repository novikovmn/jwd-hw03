package by.epam.hw03.branch;

/* 6. Составить программу: определения наибольшего из двух чисел а и b. */

public class Task06 {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 111;

		System.out.printf("Даны числа %d и %d. Какое является наибольшим?\n", a, b);
		System.out.printf("Ответ: %d", findMax(a, b)); 

	}

	public static int findMax(int a, int b) {
		int max = -1;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;
	}
	
}
