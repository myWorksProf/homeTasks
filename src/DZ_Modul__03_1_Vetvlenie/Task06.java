package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 6
//					Определить количество дней в году, который вводит 
//					пользователь, и вывести их в консоль. В високосном году – 
//					366 дней, тогда как в обычном – 365. Високосными годами 
//					являются все годы, делящиеся нацело на 4, за исключением 
//					столетий, которые не делятся нацело на 400.

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// Определить количество дней в году,
 
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите год: ");
		if (sc.hasNextInt()) {
			int givenYear = sc.nextInt();
			String strYearDay = givenYear + "";
			if (strYearDay.length() == 4) {
				int century = Integer.parseInt (strYearDay.substring(2));
				int whatYear = givenYear % 4;
				int whatCentury = givenYear % 400;
				int year = (century == 00 ? (givenYear % 400) : (givenYear % 4));
				if (year == 0 ) {
					System.out.printf("\n %d Високосный год, 366 дней!\n", givenYear);
				}
				else {
					System.out.printf("\n %d Обычный год, 365 дней !\n", givenYear);
				}
			}
			else {
				System.out.printf("\nТакой год %d за пределами нашего календаря  ;)!!!\n", givenYear );
			}
		}
		else {
		System.err.println("\nerror: появилось сомнение, что это цифра :F!!!\n");
		}
		
		sc.close();
		System.out.println("\nПрограмма завершена!");

	}

}
