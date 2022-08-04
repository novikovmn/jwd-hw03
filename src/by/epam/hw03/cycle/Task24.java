package by.epam.hw03.cycle;

/* 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать 
его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным 
числом. */

public class Task24 {

	public static void main(String[] args) {

		runLogic(122);

	}
	
	
	//=============основная логика===========================================
	public static void runLogic(int number) {
		
		System.out.printf("Введено число %d.\n", number);
		
		if(!checkIfNumberIsNatural(number)) {
			System.out.printf("Введенное число %d - не натуральное!\n", number);
			return;
		}
		
		int evenDigitsSum = sumOfEvenDigits(number); 
		if(evenDigitsSum > 0) {
			System.out.printf("Сумма четных цифр = %d.\n", evenDigitsSum);
		}else {
			System.out.printf("Число %d не содержит четных цифр.\n", number);
		}
		
		int reverseNumber = reverseEnteredNumber(number);
		System.out.printf("Перевернутое число %d выглядит так: %d\n", number, reverseNumber);
		
	}
	//=================================================================================
	
	//===========логика переворачивания числа======================================
	public static int reverseEnteredNumber(int number) {
		char[] charArray = String.valueOf(number).toCharArray();
		for (int i = 0; i < charArray.length / 2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - 1 - i];
			charArray[charArray.length - 1 - i] = temp;
		}
		return Integer.valueOf(new String(charArray));
	}
	//=================================================================================

	//============проверка натуральности==========================================
	public static boolean checkIfNumberIsNatural(int number) {
		if (number < 1) {
			return false; // натуральные чила начинаются с 1
		}
		return true; // >= 1
	}
	//=================================================================================

	//============находим сумму четных цифр========================================
	public static int sumOfEvenDigits(int number) {
		char[] charArray = String.valueOf(number).toCharArray();

		int sumEven = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (Character.getNumericValue(charArray[i]) % 2 == 0) {
				sumEven += Character.getNumericValue(charArray[i]);
			}
		}

		// может быть 0, т.к. число может состоять из нечетных цифр
		return sumEven;
	}
	//=================================================================================
}
