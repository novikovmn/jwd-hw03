package by.epam.hw03.cycle;

import java.util.Scanner;
import java.util.regex.Pattern;

/* 28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить 
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а 
также  на  ввод  Y=0  при  делении.  Организовать  возможность  многократных  вычислений  без 
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять 
‘0’.*/

public class Task28 {

	public static void main(String[] args) {

		// ==============заготовка, для проверки введенного знака арифметики=======
		String add = "\\+";
		String subtract = "-";
		String divide = "/";
		String multiply = "\\*";

		Pattern addPattern = Pattern.compile(add);
		Pattern subtractPattern = Pattern.compile(subtract);
		Pattern dividePattern = Pattern.compile(divide);
		Pattern multiplyPattern = Pattern.compile(multiply);
		// ========================================================

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		// ========================================================
		
		/*ввод чисел и арифметика проводятся, пока 
		 * результат одной их таких операций не даст 0*/
		int result = -1;
		while (result != 0) { 
			
			System.out.println("Введите число x:");
			System.out.print("> ");
			int x = s.nextInt(); // первый операнд

			System.out.println("Введите число y:");
			System.out.print("> ");
			int y = s.nextInt(); // второй операнд

			System.out.println("Введите знак операции (+, -, /, *):");
			System.out.print("> ");
			while (!(s.hasNext(addPattern) || s.hasNext(subtractPattern) || s.hasNext(dividePattern)
					|| s.hasNext(multiplyPattern))) {
				s.next();
				System.out.println("Знак операции невреный! Попробуйте снова.");
			}
			String operator = s.next(); // знак арифметической операции

			if (y == 0 && operator.equals(divide)) {
				System.out.println("Нельзя делить на ноль! Программа завершена."); // реагируем на y==0 при операции деления
				return;
			}

			switch (operator) { // производим арифметические действия в соотв с введенными данными
			case "+":
				result = x + y;
				System.out.printf("Результат = %d\n", result);
				break;
			case "-":
				result = x - y;
				System.out.printf("Результат = %d\n", result);
				break;
			case "/":
				result = x / y;
				System.out.printf("Результат = %d\n", result);
				break;
			case "*":
				result = x * y;
				System.out.printf("Результат = %d\n", result);
				break;
			}
			System.out.println("=============================================================");
		}
		// ========================================================

	}

}
