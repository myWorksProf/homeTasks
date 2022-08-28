package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Random;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 6
//				Заполнить массив на 10 элементов случайными числами 
//				от -10 до +10. Посчитать количество уникальных значений 
//				(встречающихся в массиве один раз). Вывести на консоль 
//				значения уникальных элементов и индексы, под которыми 
//				они находятся в массиве.

public class Task_06 {

	public static void main(String[] args) {


				Random rand = new Random();
				int[] mass10 = new int[10];
//				int[] mass10 = new int[] {3, 8, 1, -8, 8, -2, -5, 6, 9, -3};
				int countJ = 0;
				int num = 0;
				int index = 0;

				
				for (int i = 0; i < mass10.length; i++) {
					mass10[i] = rand.nextInt(21) -10;
				}
				System.out.println("исходный массив : \n" + Arrays.toString(mass10));
				
				for (int i = 0; i <mass10.length; i ++) {
					for (int j = i + 1; j < mass10.length ; j++) {
						if (mass10[i] == mass10[j]) {
							mass10[j] = 20;
						}
					}
						num = mass10[i];
						index = i;	
						if ( num <11) {
						System.out.printf("\n[%2d] %2d;", index, num);
						num = 0;
						countJ ++;
						//flag = false;
					}
					
				}
				System.out.println("\nуникальных значений : " + countJ);

	}

}
