package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//Домашнее задание № 4.2
//	ВЛОЖЕННЫЕ ЦИКЛЫ
//		Задание 5
//			используя операторы ветвления и цикла написать программу, 
//			алгоритм которой будет выводить параллелограмм, заполненный 
//			или пустой,в консоль в виде «звёздочек», 

public class Task_05 {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите высоту прямоугольника: ");	
		int  height= sc.nextInt();
		System.out.print("Заполнить прямоугольник : \n 1 - Да.\n 2 - Нет.\n Ваш выбор: ");	
		int  fill= sc.nextInt();
		sc.close();

		for (int i = 1; i <= height; i++) {
			for (int j = i + 1; j <= height; j++) {
				System.out.print("  ");
			}
			//System.out.print("* ");
			if (i == 1 || i == height) {
				for (int j = 1; j <= height * 2 ; j++) {
					System.out.print("* ");
				}
				System.out.print("\n");
			} else {
				System.out.print("* ");
				for (int j = 2 ; j < height * 2; j++) {
					System.out.print(fill == 1 ? ". " : "  ");
				}
				System.out.print("* ");
				System.out.print("\n");
			}
		}
	}
}
