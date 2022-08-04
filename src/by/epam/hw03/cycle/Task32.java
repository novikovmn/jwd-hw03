package by.epam.hw03.cycle;

import java.util.Scanner;
import java.util.regex.Pattern;

/* 32.  Проверить  введенную  пользователем  строку  на  наличие  недопустимых  символов.  В  качестве 
первого  символа  допустимы  только  буквы  и  знак  подчеркивания.  Остальные  символы  могут  быть 
буквами, цифрами и знаком подчеркивания. */

public class Task32 {

	public static void main(String[] args) {
		
		String regex = "[a-zA-zА-Яа-я_][a-zA-zА-Яа-я_0-9]*";
		
		Pattern pattern = Pattern.compile(regex);
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите строку: ");
		System.out.print(">> ");
		
		while(!scanner.hasNext(pattern)) {
			scanner.next();
			System.out.println("Строка не прошла проверку. Попробуйте еше раз.");
			System.out.print(">> ");
		}
		
		String str = scanner.next();
		
		System.out.println("Поздравляем: " + str);

	}

}
