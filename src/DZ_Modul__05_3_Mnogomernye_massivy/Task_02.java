package DZ_Modul__05_3_Mnogomernye_massivy;

import java.util.Arrays;
import java.util.Random;

//		DZ_05_3
//			МНОГОМЕРНЫЕ МАССИВЫ
//				Задание 2
//					Создать массив из 20 случайных чисел в диапазоне от 
//					-10 до 30. Написать программу, определяющую сумму 
//					элементов массива, находящихся в массиве после первого 
//					отрицательного элемента (первый отрицательный элемент не 
//					должен входить в сумму). Вывести на консоль полученный 
//					массив и сумму. 

public class Task_02 {

	public static void main(String[] args) {
		
		//int[] array20Rand = new int[20];
		
		Random rand = new Random();   

		int[] array20Rand = new int[20];
		int count = 0;
		int index = 0;
		int i = 0;
		int summ = 0;
		for (i = 0; i < array20Rand.length; i++) {
				array20Rand[i] = (rand.nextInt(40) - 10);		

				if (array20Rand[i] < 0  && count ==0) {
					 index = i;
					 count = 1;
				}					
		}
		for (i = index + 1; i < array20Rand.length; i++) {
			summ += array20Rand[i];
		}
			
		System.out.println("array:");
		System.out.println(Arrays.toString(array20Rand));
		System.out.println("index первого отрицательного числа: " + index );
		System.out.println("summ: " + summ);
	}

}
