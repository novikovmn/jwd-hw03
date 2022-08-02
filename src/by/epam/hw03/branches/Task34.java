package by.epam.hw03.branches;

import java.util.Scanner;

/* 
34.  Составить  программу,  реализующую  эпизод  применения  компьютера  в  книжном  магазине.  Компьютер 
запрашивает  стоимость  книг,  сумму  денег,  внесенную  покупателем;  если  сдачи  не  требуется,  печатает  на  экране 
«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если 
денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы. 
*/

public class Task34 {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		int price = 150;
		
		System.out.printf("Книга \"Преступление и наказание\" стоит %d рублеЙ\n", price);
		System.out.println("Внесите в кассу нужную сумму:");
		System.out.print(">>> ");
		
		int input = s.nextInt();
		
		if(input == price) {
			System.out.println("Спасибо.");
		}else if(input > price) {
			System.out.printf("Возьмите сдачу: %d рублей\n", input - price);
		}else {
			System.out.printf("Не хватает еще %d рублей\n", price - input);
		}
		
	}

}
