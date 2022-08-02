package by.epam.hw03.branches;

/*9.  Составить  программу,  которая  определит  по  трем  введенным  сторонам,  
 * является  ли  данный  треугольник равносторонним. 
*/

public class Task09 {

	public static void main(String[] args) {
		
		checkSidesOfTriangle(2, 5, 5); 

	}

	public static boolean checkSidesOfTriangle(int a, int b, int c) {
		System.out.printf("Даны стороны треугольника: a = %d, b = %d и c = %d\n", a, b, c);
		if (a == b && b == c && a == c) {
			System.out.println("Этот треугольник равносторонний");
			return true;
		}
		System.out.println("Этот треугольник НЕ равносторонний");
		return false;
	}

}
