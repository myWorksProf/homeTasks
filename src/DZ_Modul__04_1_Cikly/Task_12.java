package DZ_Modul__04_1_Cikly;

import java.util.Scanner;

public class Task_12 {

//		Домашнее задание No 4.1
//			Задание 12
//				В первый день спортсмен пробежал x километров, а затем 
//				он каждый день увеличивал пробег на 10% от предыдущего 
//				значения. По числу, указанному с клавиатуры y, определите 
//				номер дня, на который пробег спортсмена составит не менее y километров.	

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите количество километров в первый день: ");	
		int kmOneDay = sc.nextInt();
		System.out.print("Введите общее количество километров : ");		
		int km = sc.nextInt();
		sc.close();
		
		double distance = kmOneDay;
		int oneDay = 1;
		System.out.printf("день %d ;\n  пробег - %.0f км\n", oneDay, distance);
		
		while (distance < km) {
			distance *= 1.1;
			oneDay ++;
			System.out.printf("день %d ;\n  пробег - %.2f км\n", oneDay, distance);

		}		
		System.out.println("Конецт программы!");
	}
}