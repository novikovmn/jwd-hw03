package by.epam.hw03.branches;

/*13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к 
началу координат. 
*/

public class Task13 {

	public static void main(String[] args) {

		double x1 = 2;
		double y1 = 2;
		double x2 = 6;
		double y2 = 4;

		System.out.printf("Даны точки с кординатами [%.0f;%.0f] и [%.0f;%.0f]\n", x1, y1, x2, y2);

		double len1 = Math.sqrt(x1 * x1 + y1 * y1);
		double len2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (len1 < len2) {
			System.out.printf("Точка [%.0f;%.0f] ближе к началу координат.\n", x1, y1);
		} else if (len1 == len2) {
			System.out.printf("Точки [%.0f;%.0f] и [%.0f;%.0f] равноудалены от начала координат\n", x1, y1, x2, y2);
		}else {
			System.out.printf("Точка [%.0f;%.0f] ближе к началу координат.\n", x2, y2);
		}

	}

}
