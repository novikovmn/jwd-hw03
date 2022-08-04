package by.epam.hw03.cycle;

/* 26.  Вывести  на  экран  соответствий  между  символами  и  их  численными  обозначениями  в  памяти 
компьютера (Таблицу ASCII). */

public class Task26 {

	public static void main(String[] args) {


		for (int i = 0; i < 256; i++) {
			char symb = (char) i;
			System.out.printf("%d -> %c\n", i, symb);
		}
		
		
		
		
	}

}
