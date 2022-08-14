package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//Домашнее задание № 4.2
//	ВЛОЖЕННЫЕ ЦИКЛЫ
//		Задание 2
//			используя операторы ветвления и цикла написать программу, 
//			алгоритм которой будет выводить прямоугольный треугольник, 
//			прямым углом вверх-вправо, заполненный или пустой, в консоль 
//			в виде «звёздочек». 	

public class Task_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите высоту треугольника: ");	
		int  height= sc.nextInt();
		System.out.print("Заполнить треугольник : \n 1 - Да.\n 2 - Нет.\n Ваш выбор: ");	
		int  fill= sc.nextInt();
		sc.close();
		
		System.out.print("\n");
		
		for (int j = 1; j <= height; j++) {
			System.out.print("* ");
		}
		System.out.print("\n");
		for (int i = 1; i < height - 1; i++) {
			
			for (int j = 1; j < i + 1; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			
			for (int j = 2; j <= height - 1 - i ; j++) {
				System.out.print(fill == 1 ? ". " : "  ");
			}
			System.out.print("* \n");
		}
		for (int j = 1; j < height; j++) {
			System.out.print("  ");
		}
		System.out.print("* \n");
	}

}
