package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 9
//					Даны координаты начала и координаты конца отрезка. 
//					Если считать отрезок обозначением горки, то в одном слу-
//					чае он обозначает спуск, в другом – подъем. Определить и 
//					вывести на экран – спуск это или подъем, ровная дорога или 
//					вообще отвесная.

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// Определить и	вывести на экран – спуск это или подъем, 
		// ровная дорога или вообще отвесная.

				
		Scanner sc = new Scanner(System.in);	
		System.out.print("Выбери определение: \n \"подъем\" - это наклон в верх с лева на право: 1\n \"подъем\" - в зависимости от заданных координат: 2\n Твой выбор :\t");
		if (sc.hasNextInt()) {
			int vibor = sc.nextInt();
			if (vibor == 1) {

				System.out.print("Введите X1 координату начала отрезка:\t ");
				if (sc.hasNextInt()) {
					int x1 = sc.nextInt();		
					System.out.print("Введите Y1 координату начала отрезка:\t ");
					if (sc.hasNextInt()) {
						int y1 = sc.nextInt();
						System.out.print("Введите X2 координату конца отрезка:\t ");
						if (sc.hasNextInt()) {
							int x2 = sc.nextInt();		
							System.out.print("Введите Y2 координату конца отрезка:\t ");
							if (sc.hasNextInt()) {
								int y2 = sc.nextInt();
		
								if (x1 == x2 && y1 == y2) {
									System.out.println("\nотрезок бесконечно мал, похож на точку");
								}
								else if ((x1 > x2 && y1 < y2) || (x1 < x2 && y1 > y2)) {
								System.out.println("\nспуск");
								}	
								else if ((x1 > x2 && y1 > y2) || (x1 < x2 && y1 < y2)) {
									System.out.println("\nподъем");
								}
								else if (x1 == x2 ) {
									System.out.println("\nотвесная");
								}
								else if (y1 == y2) {
									System.out.println("\nпрямая");
								}
							}
						}
					}
					else {
						System.err.println("\nerror: на наш взгляд это точно не цифра :F!!!\n");
					}
				}
				else {
					System.err.println("\nerror: на наш взгляд это точно не цифра :F!!!\n");
				}				
			}
			else if (vibor == 2) {
				System.out.print("Введите X1 координату начала отрезка:\t ");
				if (sc.hasNextInt()) {
					int x1 = sc.nextInt();		
					System.out.print("      Введите Y1 координату начала отрезка:\t ");
					if (sc.hasNextInt()) {
						int y1 = sc.nextInt();
						System.out.print("Введите X2 координату конца отрезка:\t ");
						if (sc.hasNextInt()) {
							int x2 = sc.nextInt();		
							System.out.print("     Введите Y2 координату конца отрезка:\t ");
							if (sc.hasNextInt()) {
								int y2 = sc.nextInt();
								int x =  x2 - x1;
								int y = y2 - y1;
								if (x == 0 && y == 0) {
									System.out.println("\nотрезок бесконечно мал, похож на точку");
								}
								else if (y1 > y2) {
								System.out.println("\nспуск");
								}
								else if (y2 > y1) {
									System.out.println("\nподъем");
								}
								else if (x == 0 ) {
									System.out.println("\nотвесная");
								}
								else if (y == 0) {
									System.out.println("\nпрямая");
								}
								else {
										System.out.println("\nПолная неизвестность для науки !! ");
									}
							}
						}
					}
					else {
						System.err.println("\nerror: на наш взгляд это точно не цифра :F!!!\n");
					}
				}
				else {
					System.err.println("\nerror: на наш взгляд это точно не цифра :F!!!\n");
				}				
			}
			else {
				System.err.print("Другого не дано!! ");
			}	
		sc.close();	
		System.out.println("\nПрограмма завершена!");
		}
	}
}
