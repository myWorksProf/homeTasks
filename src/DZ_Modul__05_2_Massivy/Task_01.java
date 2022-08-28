package DZ_Modul__05_2_Massivy;

import java.util.Arrays;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 1 
//				Заполнить массив на 15 элементов числами Фибоначчи. 
//				Вывести на консоль только четные элементы массива.

public class Task_01 {

	public static void main(String[] args) {
		int one = 0;
		int two = 1;
		int  three = 0;
		int[] array15 = new int[15];
	
		for (int i = 1; i < 15; i++) {
			three = one +two;
			array15[i] = three;
			two = one;
			one = three;			
		}
		
		System.out.println("исходный массив : \n" + Arrays.toString(array15));	
		System.out.println("только четные элементы массива: ");	
		
		for (int i = 1; i < 15; i++) {		
			if (array15[i] % 2 == 0) {
				System.out.printf("%d, ", array15[i]);
			}
			
		}
		
	}

}
