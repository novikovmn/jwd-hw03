package by.epam.hw03.cycle;

/*7. Вычислить значения функции на отрезке [а,b] c шагом h.
 * Если х>2, то y=x, а если х<=2, то y=-x
*/

public class Task07 {

	public static void main(String[] args) {

		double a = 2;
		double b = 10;
		double h = 2;
		double y = 0;
		
		
		System.out.println("|\t\tx\t\t|\t\ty\t\t|");
		System.out.println("|===============================================================|");
		for (double x = a; x <= b; x += h) {
			if(x > 2) {
				y = x;
				System.out.println("|\t\t"+x+"\t\t|\t\t"+y+"\t\t|");
			}
			
			if(x <= 2) {
				y = -x;
				System.out.println("|\t\t"+x+"\t\t|\t\t"+y+"\t\t|");
			}

		}
		System.out.println("|===============================================================|");

	}

}
