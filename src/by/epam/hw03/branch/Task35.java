package by.epam.hw03.branch;

public class Task35 {

	public static void main(String[] args) {
		
		
		dayAndMonth(361, 2022);

	}

	//==================проверяем год==============================
	public static boolean leapYearOrNot(int year) {
		if ((year % 4 == 0 || year % 400 == 0) && (year % 100 != 0)) {
			return true;
		}
		return false;
	}
	
	
	//=====================основная работа=============================
	public static void dayAndMonth(int n, int year) {

		if (leapYearOrNot(year)) {
			System.out.println("Год високосный (нужен не високосный).");
			return;
		}

		if (!(n >= 1 && n <= 365)) {
			System.out.println("Порядковый номер для введен неверно!");
			return;
		}
		
		System.out.printf("Вводим порядковый номер дня в году = %d, год не високосный = %d\n", n, year);

		int month = 0;
		int day = 0;

		if (n >= 1 && n <= 31) {
			month = 1; // январь
		} else if (n > 31 & n <= 59) {
			month = 2; // февраль
		} else if (n > 59 && n <= 90) {
			month = 3; // март
		} else if (n > 90 && n <= 120) {
			month = 4; // апрель
		} else if (n > 120 && n <= 151) {
			month = 5; // май
		} else if (n > 151 && n <= 181) {
			month = 6; // июнь
		} else if (n > 181 && n <= 212) {
			month = 7; // июль
		} else if (n > 212 && n <= 242) {
			month = 8; // август
		} else if (n > 242 && n <= 273) {
			month = 9; // сентябрь
		} else if (n > 273 && n <= 303) {
			month = 10; // октябрь
		} else if (n > 303 && n <= 334) {
			month = 11; // ноябрь
		} else if (n > 334 && n <= 365) {
			month = 12; // декабрь
		}

		switch (month) {
			case 1: day = n; break;
			case 2: day = n - 31; break;
			case 3: day = n - 59; break;
			case 4: day = n - 90; break;
			case 5: day = n - 120; break;
			case 6: day = n - 151; break;
			case 7: day = n - 181; break;
			case 8: day = n - 212; break;
			case 9: day = n - 242; break;
			case 10: day = n - 273; break;
			case 11: day = n - 303; break;
			case 12: day = n - 334; break;
		}
		
		System.out.printf("Получаем: %d.%d.%d", day, month, year);

	}

}
