package by.epam.hw03.cycles;

/*8. Вычислить значения функции на отрезке [а,b] c шагом h.
 * Если х=15, то y=(x+c)*2, а если х!=15, то y=(x-c)+6
*/

public class Task08 {

	public static void main(String[] args) {

		double a = 10;
		double b = 17;
		double h = 1;
		double c = 3;
		double y = 0;
		
		
		System.out.println("|\t\tx\t\t|\t\ty\t\t|");
		System.out.println("|===============================================================|");
		for (double x = a; x <= b; x += h) {
			if(x == 15) {
				y = (x+c)*2;
				System.out.println("|\t\t"+x+"\t\t|\t\t"+y+"\t\t|");
			}
			
			if(x !=15) {
				y = (x+c)*2;
				System.out.println("|\t\t"+x+"\t\t|\t\t"+y+"\t\t|");
			}

		}
		System.out.println("|===============================================================|");

	}

}
