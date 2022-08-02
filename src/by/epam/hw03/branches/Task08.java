package by.epam.hw03.branches;

/* 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b. */

public class Task08 {

	public static void main(String[] args) {

		minSqr(2, 3); 
		
	}
	
	public static void minSqr(int a, int b) {		
		System.out.printf("Даны два числа %d и %d\n", a,b);
		
		int min = -1;
		
		int aSqr = a*a;
		int bSqr = b*b;
		
		if(aSqr < bSqr) {
			min = aSqr;
			System.out.printf("Минимальным является квадрат числа %d -> %d\n", a, min);
		}else {
			min = bSqr;
			System.out.printf("Минимальным является квадрат числа %d -> %d\n", b, min);
		}
	}

}
