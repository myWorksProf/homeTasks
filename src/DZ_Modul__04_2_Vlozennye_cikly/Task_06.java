package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//	Домашнее задание № 4.2
//		ВЛОЖЕННЫЕ ЦИКЛЫ
//			Задание 6
//				Нарисовать на экране лесенку. Количество ступенек 
//				указывает пользователь с клавиатуры. 


public class Task_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите количество ступеней: ");	
		int  amount= sc.nextInt();
		int count = 1; 
		for (int i = 1; i<= amount; i++ ) {
			
			if (i > 0) {
				for (int indent = 1; indent < count; indent++) {
					System.out.print("  ");
				}
			}
			
			for (int j = 0; j < 3; j++) {
				System.out.print(i + " ");
			}
			
			if (i < amount ) {
				System.out.println();
				
				for (int indent = 0; indent < count + 1; indent++) {
					System.out.print("  ");
				}
				System.out.print(i + 1 +"\n");
			}
			count = count + 2;
		}
	}
}
