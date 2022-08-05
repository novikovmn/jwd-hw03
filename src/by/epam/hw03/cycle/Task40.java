package by.epam.hw03.cycle;

/* 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои 
цифры.  
 */

public class Task40 {

	public static void main(String[] args) {

		int from = 1;
		int number = 20;

		// будем работать с числами от from до number
		for (int i = from; i <= number; i++) {

			int[] digits = getDigits(i); // превращаем число в массив цифр
			int zero = countZero(digits); // считаем в этом массиве нули (чтобы потом избежать деления на ноль)

			// здесь храним количество делений числа на свои цифры 
			int numberOfDivisions = digits.length;

			if (zero > 0) { // если в составе числа есть нули - пропускаем это число
				continue;
			}

			int counter = 0; // подсчет фактического кол-ва успешных делений числа на свои цифры
			for (int j = 0; j < digits.length; j++) { // процесс деления каждого i на свои цифры

				if (i % digits[j] == 0) {
					counter++;
				} else {
					break; // иначе, если i не делится на свою цифру - прыгаем во внешний цикл
				}
			}

			// сравниваем фатич кол-во делений и ожидаемое
			if (counter == numberOfDivisions) {
				System.out.println(i); // если они совпадают - это искомое число
			}
			counter = 0; // затираем для очередной итерации
		}

	}

	/*
	 * считаем количество нулей в массиве цифр
	 */
	public static int countZero(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				counter++;
			}
		}
		return counter;
	}

	/*
	 * превращаем число в массив цифр
	 */
	public static int[] getDigits(int number) {
		char[] chars = String.valueOf(number).toCharArray();
		int[] digits = new int[chars.length];

		for (int i = 0, j = 0; i < chars.length; i++, j++) {
			digits[j] = Character.getNumericValue(chars[i]);
		}
		return digits;
	}

}
