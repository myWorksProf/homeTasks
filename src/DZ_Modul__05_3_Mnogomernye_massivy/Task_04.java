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
		
		int size = 100;
		int[] array100Rand = new int[size];
		Random rand = new Random();
		
		for (int i = 0; i < array100Rand.length; i++) {
			
			array100Rand[i] = rand.nextInt(855) - 300;
		}
		
		for (int i = 0; i < array100Rand.length; i++) {
			int value = array100Rand[i];
			int j = i-1;
			for (; j >= 0; j--) {
				if (value < array100Rand[j]) {
					array100Rand[j + 1] =  array100Rand[j]; 
				}else {
					break;
				}
			}
			array100Rand[j + 1] = value;
		}
		 
		int countNegative = 0;
		int countZero = 0;
		int countPositive = 0;
		int indexNegative =0;
		int indexZero = 0;
		int indexPositive = 0;
		
		for (int i = 0; i < array100Rand.length; i++) {
			if (array100Rand[i] < 0) {
				countNegative ++;
				indexNegative = i;
			} 
			
			if (array100Rand[i] == 0) {
				countZero ++;
				indexZero = i;
			}
					
			if (array100Rand[i] > 0) {
				countPositive ++;
				indexPositive = i;
				
			}
		}
		
		int startNegativ = indexNegative - countNegative + 1;
		int startZero = indexZero - countZero + 1;
		int startPositiv = indexPositive - countPositive + 1;
		int startCopyNegativ = countPositive + countZero;
		int newArray [] = new int [size];
		
		System.arraycopy(array100Rand, startPositiv, newArray, 0, countPositive);
		if (countZero > 0) {
			System.arraycopy(array100Rand, startZero, newArray, countPositive, countZero);
		}
		System.arraycopy(array100Rand, startNegativ, newArray, startCopyNegativ, countNegative);
		
		System.out.println(Arrays.toString(array100Rand));
		System.out.println(Arrays.toString(newArray));
		
	}

}
