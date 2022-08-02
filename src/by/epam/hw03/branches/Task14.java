package by.epam.hw03.branches;

/* 14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он 
прямоугольным.  */

public class Task14 {

	public static void main(String[] args) {

		int angle1 = 90;
		int angle2 = 60;
		
		System.out.printf("Дано два угла: %d и %d градусов.\n", angle1, angle2);
		
		if(angle1 + angle2 < 180) {
			System.out.println("Треугольник существует, т.к. сумма этих углов < 180 градусов.");
			int angle3 = 180 - (angle1 + angle2);
			System.out.printf("Третий угол = %d градусов.\n", angle3);
			if(angle1 == 90 || angle2 == 90 || angle3 == 90) {
				System.out.println("Этот треугольник прямоугольный (один из углов = 90 градусов).");
			}else {
				System.out.println("Этот треугольник не прямоугольный."); 
			}
		}else {
			System.out.println("Треугольник не существует.");
		}
	}

}
