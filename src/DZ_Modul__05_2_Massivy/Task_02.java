package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Random;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 2
//				Заполнить массив на 30 элементов случайными числами	от -70 до +50. 
//					Найти минимальный элемент и вывести его	на консоль. 
//					Найти максимальный элемент и вывести его на консоль. 

public class Task_02 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] mass30 = new int [30];
		
		for (int i = 0; i < 30; i++) {
			mass30[i] = rand.nextInt(121) - 70;
		}
		int minNum = 0;
		int maxNum = 0;
		
		for (int i = 0; i < mass30.length; i++) {
			if(mass30[i]  < minNum) {
				minNum = mass30[i];
			}
			else if(mass30[i] > maxNum) {
				maxNum = mass30[i];
			}
		}
		System.out.println("исходный массив : \n" + Arrays.toString(mass30));
		
		Arrays.sort(mass30);

		System.out.println("исходный сортированный массив : \n" + Arrays.toString(mass30));
		System.out.printf("минимальный элемент  -> %3d\n", minNum);
		System.out.printf("максимальный элемент -> %3d\n", maxNum);
		
		System.out.println("Конец программы !");
	}

}
