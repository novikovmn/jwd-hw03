package by.epam.hw03.branch;

/*  
20. Определить, делителем каких чисел а, b, с является число k.  */

public class Task20 {

	public static void main(String[] args) {

		int a = 11;
		int b = 6;
		int c = 21;

		int k = 3;

		if (a % k == 0) {
			System.out.printf("%d является делителем %d\n", k, a);
		}else {
			System.out.printf("%d не является делителем %d\n", k, a);
		}
		
		if (b % k == 0) {
			System.out.printf("%d является делителем %d\n", k, b);
		}else {
			System.out.printf("%d не является делителем %d\n", k, b);
		}
		
		if (c % k == 0) {
			System.out.printf("%d является делителем %d\n", k, c);
		}else {
			System.out.printf("%d не является делителем %d\n", k, c);
		}

	}

}
