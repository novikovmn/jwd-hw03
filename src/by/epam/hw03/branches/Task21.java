package by.epam.hw03.branches;

import java.util.Scanner;
import java.util.regex.Pattern;

/*  
21.  Программа  —  льстец.  На  экране  высвечивается  вопрос  «Кто  ты:  мальчик  или  девочка?  Введи  Д  или  М».  В 
зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».  */

public class Task21 {

	public static void main(String[] args) {

		String s1 = "Д";
		String s2 = "д";
		String s3 = "М";
		String s4 = "м";

		Pattern pattern1 = Pattern.compile(s1);
		Pattern pattern2 = Pattern.compile(s2);
		Pattern pattern3 = Pattern.compile(s3);
		Pattern pattern4 = Pattern.compile(s4);

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Кто  ты:  мальчик  или  девочка?  Введи  Д(д)  или  М(м)");
		System.out.print(">>> ");

		while (!(s.hasNext(pattern1) || s.hasNext(pattern2) || s.hasNext(pattern3) || s.hasNext(pattern4))) {
			s.nextLine();
			System.out.println("Ввод не верный! Попробуйте еще раз.");
			System.out.print(">>> ");
		}

		String answer = s.nextLine();

		if (answer.equals(s1)|| answer.equals(s2)) {
			System.out.println("Мне нравятся мальчики!");
		} else if (answer.equals(s3) || answer.equals(s4)) {
			System.out.println("Мне нравятся девочки!");
		}

	}

}
