package by.epam.hw03.branch;

/* 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */

public class Task29 {

	public static void main(String[] args) {

		double x1 = 1.0;
		double y1 = 1.0;

		double x2 = 6.0;
		double y2 = 1.0;

		double x3 = 5.0;
		double y3 = 1.0;

		if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
			System.out.printf("Точки [%.0f;%.0f], [%.0f;%.0f] и [%.0f;%.0f] лежат на одной прямой", 
					x1, y1, x2, y2, x3, y3);
		}else {
			System.out.printf("Точки [%.0f;%.0f], [%.0f;%.0f] и [%.0f;%.0f] НЕ лежат на одной прямой", 
					x1, y1, x2, y2, x3, y3);
		}
	}

}


