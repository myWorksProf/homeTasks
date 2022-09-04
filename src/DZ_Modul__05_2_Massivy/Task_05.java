package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Random;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 5
//				Заполнить массив на 10 элементов случайными числами 
//				от -10 до +10. Посчитать количество повторяющихся значений. 
//				Вывести на консоль только повторяющиеся элементы и количество повторений. 
//				Пример:
//					0 – 5 раз
//					2 – 3 раза
//					7 – 1 раз
public class Task_05 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] mass10 = new int[10];
//		int[] mass10 = new int[] {-1, -6, 0, 5, 0, -9, -2, -1, -1, -2};

		
		
		for (int i = 0; i < mass10.length; i++) {
			mass10[i] = rand.nextInt(21) -10;
		}
		System.out.println("исходный массив : \n" + Arrays.toString(mass10));
		
		int countJ = 0;
		int num = 0;
		boolean flag = false;
		
		for (int i = 0; i <mass10.length; i ++) {
			for (int j = i + 1; j < mass10.length; j++) {
				if (mass10[i] == mass10[j] && mass10[i] < 11) {
					//System.out.println(mass10[i]);
					num = mass10[i];
					mass10[j] = 20;
					countJ ++;
					//System.out.println("исправленный массив : \n" + Arrays.toString(mass10));
				}
				
				
			}
			if (countJ > 0 && num < 11) {
				System.out.printf("\n%2d -> %d раз (исходное значение не считается!)", num, countJ);
				num = 0;
				countJ = 0;
				//System.out.println();
				flag = true;
			}
			
		}
		System.out.println(!flag? "\nповторений не найдено" : "");
	}

}
