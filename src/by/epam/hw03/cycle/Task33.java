package by.epam.hw03.cycle;

/* 33. Найдите наибольшую цифру данного натурального числа. 
 */

public class Task33 {

	public static void main(String[] args) {
		
		int number = 123987;
		System.out.printf("Дано число %d\n", number);
		System.out.printf("Наибольшая цифра = %d", maxDigit(number));

	}

	public static int maxDigit(int number) {
		char[] charArray = String.valueOf(number).toCharArray();
		int max = Character.getNumericValue(charArray[0]);

		for (int i = 1; i < charArray.length; i++) {
			if (Character.getNumericValue(charArray[i]) > max) {
				max = Character.getNumericValue(charArray[i]);
			}
		}
		return max;

	}

}
