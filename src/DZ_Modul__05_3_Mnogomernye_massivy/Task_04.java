package DZ_Modul__05_3_Mnogomernye_massivy;

import java.util.Arrays;
import java.util.Random;

//		DZ_05_3
//			МНОГОМЕРНЫЕ МАССИВЫ
//				Задание 4 
//					Создать массив из 100 случайных чисел в диапазоне от 
//					- 300 до 555. Написать программу, копирующую один массив 
//					в другой следующим образом: 
//						сначала копируются последовательно все элементы, большие 0, \
//						затем последовательно все элементы, равные 0, 
//						а затем последовательно все элементы, меньшие 0. 
//					Вывести исходный массив. Вывести результирующий массив.

public class Task_04 {

	public static void main(String[] args) {
		
		final int SIZE = 100;
		int[] array100Rand = new int[SIZE];
		int count =0;
		Random rand = new Random();
		
		for (int i = 0; i < array100Rand.length; i++) {
			
			array100Rand[i] = rand.nextInt(855) - 300;
			count ++;
		}
		
		
		System.out.println(Arrays.toString(array100Rand));
		System.out.printf("count = %d\n", count);
		

	}

}
