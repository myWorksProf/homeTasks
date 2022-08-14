package DZ_Modul__04_2_Vlozennye_cikly;

//Домашнее задание № 4.2
//	ВЛОЖЕННЫЕ ЦИКЛЫ
//		Задание 1
//			используя операторы ветвления и цикла написать программу, 
//			алгоритм которой будет выводить прямоугольный треугольник, 
//			прямым углом вниз-вправо, заполненный или пустой,  в консоль 
//			в виде «звёздочек», 	


import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите высоту треугольника: ");	
		int  height= sc.nextInt();
		System.out.print("Заполнить треугольник : \n 1 - Да.\n 2 - Нет.\n Ваш выбор: ");	
		int  fill= sc.nextInt();
		sc.close();

		for (int j = 1; j < height; j++) {
			System.out.print("  ");
		}
		System.out.print("* \n");
		
		for (int i = 1; i < height - 1; i++) {
			for (int j = i + 1; j < height; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(fill == 1 ? ". " : "  ");
			}
			System.out.print("* \n");
		}
		for (int i = 1; i <= height; i++) {
			System.out.print("* ");
		}
		System.out.print("\n");
	}
}
