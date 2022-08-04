package by.epam.hw03.cycle;

/*  
39.  В  трехзначном  числе  зачеркнули  старшую  цифру.  Когда  полученное  число  умножили  на  7,  то 
получили исходное число. Найти это число */

public class Task39 {

	public static void main(String[] args) {

		int from = 10;
		int to = 99;
		int multiplier = 7;

		for (int i = from; i <= to; i++) {
			int num = i * multiplier;
			if (digitsQuantity(num) == 3) {
				int twoDigitNumber = num % 100;
				
				if(i == twoDigitNumber) {
					System.out.printf("Искомое число = %d\n", num);
				}
			}
		}

	}

	public static int digitsQuantity(int number) {
		return String.valueOf(number).length();
	}

}
