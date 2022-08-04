package by.epam.hw03.cycle;

/* 3. Необходимо вывести на экран таблицу умножения на 3 */

public class Task03 {

	public static void main(String[] args) {

		int firstMultiplier = 3;
		for (int secondMultiplier = 1; secondMultiplier <= 9; secondMultiplier++) {
			int result = firstMultiplier * secondMultiplier;
			System.out.println("|\t" + firstMultiplier + "x" + secondMultiplier + "\t|\t" + result + "\t|");

		}

	}

}
