package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 10
//					Определить номер подъезда девятиэтажного дома, по 
//					указанному номеру квартиры N. Считать, что на каждом 
//					этаже находится M квартир. Вывести в консоль номер подъезда. 

import java.util.Scanner;

public class Task10 {
 
	public static void main(String[] args) {
		// Определить номер подъезда девятиэтажного дома, по
		// указанному номеру квартиры N. Считать, что на каждом
		// этаже находится M квартир.
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Введите количество квартир на этаже: \t");
		if (sc.hasNextInt()) {
			int quantity = sc.nextInt();		 
			System.out.print("Введите номар квартиры: \t");
			if (sc.hasNextInt()) {
				int apartment = sc.nextInt();
				int approach = (int) Math.ceil (apartment / (9 * (double)quantity));
				System.out.printf(" номер подъезда - %d\n", approach);
			}
			
		}
	sc.close();
	System.out.println("\nПрограмма завершена!");
	}
}
