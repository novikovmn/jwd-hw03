package by.epam.hw03.cycle;

/*38.  Для  заданного  натурального  числа  определить,  образуют  ли  его  цифры  арифметическую 
прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357,963.*/

public class Task38 {

	public static void main(String[] args) {

		double number = 1357.963;

		System.out.println("Дано число: " + number);

		String[] numberToString = String.valueOf(number).split("\\.");

		String numberWithoutDot = numberToString[0] + numberToString[1];

		char[] digits = numberWithoutDot.toCharArray();

		int length = digits.length - 1; // длина массива, содержащего разности елементов

		int[] differences = new int[length];

		for (int i = 1, j = 0; i < digits.length; i++) {
			int d = digits[i] - digits[i - 1]; // разность м-ду текущим эл-м и пред-м
			differences[j++] = d; // складываем разности в массив
		}

		int coincidences = differences.length - 1; // ожидаемое количество удачных сравнений
		int counter = 0; // учет случаев, когда элементы равны

		for (int i = 0; i < differences.length - 1; i++) {
			if (differences[i] != differences[i + 1]) {
				System.out
						.println("Прогрессия НЕ является арифметической, т.к. разница между элементами не одинакова.");
				break;
			}

			if (differences[i] == differences[i + 1]) {
				counter++;
			}
		}

		if (counter == coincidences) {
			System.out.println("Прогрессия является арифметической.");
		}

	}

}
