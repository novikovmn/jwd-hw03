package by.epam.hw03.branch;

/* 16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком 
координатном угле).  */

public class Task16 {

	public static void main(String[] args) {
 
		checkCoord(2, -1);

	}

	public static void checkCoord(int x, int y) {
		if (x == 0 && y == 0) {
			System.out.printf("Точка [%d:%d] находится в начале координат.\n", x, y);
		} else if (x == 0 && y != 0) {
			System.out.printf("Точка [%d:%d] находится на оси У.\n", x, y);
		} else if (y == 0 && x != 0) {
			System.out.printf("Точка [%d:%d] находится на оси X.\n", x, y);
		}else if(x > 0 && y > 0) {
			System.out.printf("Точка [%d:%d] находится на 1-й четверти плоскости координат.\n", x, y);
		}else if(x < 0 && y > 0) {
			System.out.printf("Точка [%d:%d] находится на 2-й четверти плоскости координат.\n", x, y);
		}else if(x < 0 && y < 0) {
			System.out.printf("Точка [%d:%d] находится на 3-й четверти плоскости координат.\n", x, y);
		}else if(x > 0 && y < 0) {
			System.out.printf("Точка [%d:%d] находится на 4-й четверти плоскости координат.\n", x, y);
		}

	}

}
