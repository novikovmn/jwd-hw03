package by.epam.hw03.cycle;

import java.util.Arrays;
import java.util.Random;

/* 31.  Компьютер  генерирует  пять  чисел  в  диапазоне  от  1  до  15  включительно.  Человек  пытается  их 
угадать.  Программа  должна  выводить  угаданные  и  неугаданные  числа  из  тех,  что  сгенерировала 
программа, а также ошибочные числа пользователя.  */

public class Task31 {

	public static void main(String[] args) {

		Random r = new Random();

		int[] userNumbers = { 2, 6, 9, 11, 13 };

		int[] randomNumbers = new int[5];

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = r.nextInt(15) + 1; // заполняем числами от 1 до 15
		}

		System.out.println("Числа, которые называет юзер: " + Arrays.toString(userNumbers));
		System.out.println("Случайные числа: " + Arrays.toString(randomNumbers));
		System.out.println();

		int flag = 0;
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.printf("Пользователь называет число %d.\n", userNumbers[i]);
			for (int j = 0; j < userNumbers.length; j++) {
				if (userNumbers[i] == randomNumbers[j]) {
					System.out.printf("Число %d присутствует в массиве случайных чисел\n\n", userNumbers[i]);
					flag++;
					break;
				}
			}

			if (flag == 0) {
				System.out.printf("Числа %d нет в массиве случайных чисел.\n\n", userNumbers[i]);
			}

			flag = 0;
		}

	}
}
