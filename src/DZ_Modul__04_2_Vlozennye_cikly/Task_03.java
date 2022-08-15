package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//	Домашнее задание № 4.2
//		ВЛОЖЕННЫЕ ЦИКЛЫ
//			Задание 3
//			используя операторы ветвления и цикла написать программу, 
//			алгоритм которой будет выводить Равнобедренный треугольник, 
//			заполненный или пустой, в консоль в виде «звёздочек».


public class Task_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите высоту треугольника: ");	
		int  height= sc.nextInt();
		System.out.print("Заполнить треугольник : \n 1 - Да.\n 2 - Нет.\n Ваш выбор: ");	
		int  fill= sc.nextInt();
		sc.close();

		for (int i = 1; i < height; i++) {
			for (int j = i + 1; j <= height; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(fill == 1 ? ". " : "  ");
			}

			for (int k = i; k <= i ; k++) {
				for (int j = 1; j < k - 1; j++) {
					System.out.print(fill == 1 ? ". " : "  ");
				}
				
				for (int j =  k-1; j < k; j++) {
					if (j > 0) {
						System.out.print("* ");
					}
				}
				System.out.print("\n");
		
			}
		}
		for (int i = 1; i <= height * 2 -1; i++) {
			System.out.print("* ");
		}
	}

}
