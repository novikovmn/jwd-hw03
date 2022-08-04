package by.epam.hw03.cycle;

/* 37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число 
получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали 
число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится 
на 99, а второе на 49. */

public class Task37 {

	public static void main(String[] args) {

		int from = 10;
		int to = 99;

		int a = 0;
		int b = 0;

		for (int i = from; i <= to; i++) {
			for (int j = from; j <= to; j++) {
				String fourDigitsNumber1 = String.valueOf(i) + String.valueOf(j); // AB
				String fourDigitsNumber2 = String.valueOf(j) + String.valueOf(i); // BA

				int num1 = Integer.parseInt(fourDigitsNumber1);
				int num2 = Integer.parseInt(fourDigitsNumber2);

				if (num1 % 99 == 0 && num2 % 49 == 0) {
					a = i;
					b = j;
				}

			}
		}

		System.out.printf("Искомые числа: %d и %d", a, b);

	}

}
