package by.epam.hw03.cycles;

/*35. Найдите количество четных цифр данного натурального числа. 
*/

public class Task35 {
	public static void main(String[] args) {
		
		countEvenDigits(1122336688);
	}
	
	public static void countEvenDigits(int number) {
		
		System.out.printf("Дано число %d.\n", number);
		
		if(number < 1) {
			System.out.printf("Число %d не натуральное\n", number);
			return;
		}
		
		int counter = 0;
		char[] charArray = String.valueOf(number).toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(Character.getNumericValue(charArray[i]) % 2 == 0) {
				counter++;
			}
		}
		
		System.out.printf("Количество четных цифр данного натурального числа = %d\n", counter);
	}
}
