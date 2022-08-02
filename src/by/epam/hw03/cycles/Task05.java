package by.epam.hw03.cycles;

/* 
5.  С  помощью  оператора  while  напишите  программу  определения  суммы  всех  нечетных  чисел  в 
диапазоне от 1 до 99 включительно. */

public class Task05 {

	public static void main(String[] args) {

		int from = 1;
		int to = 99;
		int sumOdd = 0;

		while (from <= to) {
			if (from % 2 != 0) {
				sumOdd += from;
			}
			from++;
		}

		System.out.printf("Сумма нечетных чисел от 1 до 99 = %d", sumOdd);

	}

}
