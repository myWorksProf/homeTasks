package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 8
//				Заполнить массив размерности n случайными строчными 
//				латинскими буквами. Подсчитать, сколько раз встреча-
//				ется каждая буква. Вывести буквы, которые встречаются 
//				больше 3 раз. n – задается с клавиатуры.
public class Task_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите размерность массива:  ");
		int size = sc.nextInt();
		sc.close();
		Random rand = new Random();
		int[] massChar = new int[size]; 
		
		System.out.print("\nисходный массив : \n[");
		for (int i = 0; i < massChar.length; i++) {
			massChar[i] = rand.nextInt(122 - 97 + 1) + 97;
			
			System.out.print((char)massChar[i] + " ");
			
		}
		System.out.print("]\n");

		int countJ = 1;
		int num = 0;
		boolean flag = false;
		
		for (int i = 0; i <massChar.length; i ++) {
			num = i;
			for (int j = i + 1; j < massChar.length; j++) {
				if (massChar[i] == massChar[j] && massChar[i] > 96) {					
					massChar[j] = 53;
					countJ ++;
				}
			}
			if (countJ > 2 ) {
				System.out.printf("\n\t%s -> %d раз", (char)massChar[num], countJ);
				num = 0;
				flag = true;
			}
			countJ = 1;
		}
		System.out.println(!flag? "\nповторений не найдено" : "");
		
	}

}
