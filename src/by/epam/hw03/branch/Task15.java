package by.epam.hw03.branch;

import java.util.Arrays;

/*
 *  
15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их 
суммы, а большее — их удвоенным произведением. 
 * */

public class Task15 {

	public static void main(String[] args) {

		double[] numbers = { 2.0, 7.0 };

		System.out.println("Даны два числа: " + Arrays.toString(numbers));

		double min = numbers[0];
		double max = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}

			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.printf("Меньшее = %.1f, большее = %.1f\n", min, max);

		double newMin = (min + max) / 2;
		double newMax = (min * max) * 2;

		System.out.printf("Заменяем меньшее на половину суммы этих чисел. min = %.1f\n", newMin);
		System.out.printf("Заменяем большее на удвоенное произведение этих чисел. max = %.1f\n", newMax);
//		

	}

}
