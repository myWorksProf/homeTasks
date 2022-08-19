package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//	Домашнее задание № 4.2
//		ВЛОЖЕННЫЕ ЦИКЛЫ
//			Задание 9
//				Необходимо нарисовать ёлочку символом «звёздочка». 
//				Каждый новый ярус должен быть шире предыдущего. С 
//				клавиатуры вводится количество ярусов, и высота первого 
//				(верхнего) яруса ёлочки (количество строк в ярусе). 
//				Ёлочка должна быть симметричная.

public class Task_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите количество ярусов: ");	
		int  tiers= sc.nextInt();
		System.out.print("Введите высоту первого яруса: ");	
		int  height= sc.nextInt();
		sc.close();
		
		for (int count = 1; count <= tiers; count++) {
			for (int i = 1; i < height + 1; i++) {
				for (int j = i + 1; j <= height + tiers - count; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
				
				for (int j = 1; j <= i - 1; j++) {
					System.out.print("* ");
				}

				for (int k = i; k <= i ; k++) {
					for (int j = 1; j < k - 1; j++) {
						System.out.print("* ");
					}
					
					for (int j =  k-1; j < k; j++) {
						if (j > 0) {
							System.out.print("* ");
						}
					}
					System.out.print("\n");
			
				}
				
			}

			height ++;
		}

	}

}
