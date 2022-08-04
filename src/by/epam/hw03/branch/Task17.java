package by.epam.hw03.branch;

import java.util.Arrays;

/* 17. Даны целые числа m, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему 
из исходных, а если равны, то заменить числа нулями. */

public class Task17 {

	public static void main(String[] args) {

		replace(new int[] { 3, 3 });

	}

	public static void replace(int[] numbers) {

		System.out.println("Даны два числа: " + Arrays.toString(numbers));

		// находим большее
		Arrays.sort(numbers);
		int max = numbers[numbers.length - 1];

		int m = numbers[0];
		int n = numbers[1];

		if (m != n) {
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = max;
			}
			System.out.println("Произошла замена каждого числа на максимальное: " + Arrays.toString(numbers));
		}

		if (m == n) {
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = 0;
			}
			System.out.println("Произошла замена каждого числа на ноль: " + Arrays.toString(numbers));
		}

	}
}
