package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//Домашнее задание № 4.2
//	ВЛОЖЕННЫЕ ЦИКЛЫ
//		Задание 4
//			используя операторы ветвления и цикла написать программу, 
//			алгоритм которой будет выводить Ромб, заполненный или пустой,
//			в консоль в виде «звёздочек», 	


public class Task_04 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите высоту треугольника: ");	
		int  height= sc.nextInt();
		System.out.print("Заполнить треугольник : \n 1 - Да.\n 2 - Нет.\n Ваш выбор: ");	
		int  fill= sc.nextInt();
		sc.close();

		
		// верхняя часть ромба
		for (int i = 1; i <= height; i++) {
			// первая в строке в верху" * "
			for (int j = i + 1; j <= height; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			// заполнитель левого треугольника в верху " _"
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(fill == 1 ? ". " : "  ");
			}
			// заполнитель правого треугольника в верху" _"
			for (int k = i; k <= i ; k++) {
				for (int j = 1; j < k - 1; j++) {
					System.out.print(fill == 1 ? ". " : "  ");

				}
				
				// последняя в строке в верху" * "
				for (int j =  k-1; j < k; j++) {
					if (j > 0) {
						System.out.print("* ");
					}
				}
				System.out.print("\n");
			}
		}
		
		//нижняя часть ромба
	for (int i = 1; i <= height - 1; i++) {		
			// первая в строке в низу" * "
			for (int j = 1; j <= i ; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			// заполнитель левого треугольника в низу" _"
			for (int j = i; j <= height - 2; j++) {
				System.out.print(fill == 1 ? ". " : "  ");
			}
			// заполнитель правого треугольника в низу" _"
			for (int k = i; k <= i ; k++) {
				for (int j = i; j < height - 2; j++) {
					System.out.print(fill == 1 ? ". " : "  ");
				}
				
				// последняя в строке в низу" * "

				if (k < height - 1) {
						System.out.print("* ");
					}

				System.out.print("\n");
			}
		}
	}
}
