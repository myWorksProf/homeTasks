package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Scanner;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 3
//				Написать программу, которая проверяет, все ли значения 
//				элементов массива одинаковые. Вывести: Yes – если все оди-
//				наковы и No – если имеется хоть одно различие. Массив 
//				задается и инициализируется в начале программы.


public class Task_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Заполнить массив одинаковыми элементами: \n 1 - Да\n 2 - Нет");
		int negativ = sc.nextInt();
		int[] mass10 = new int[10]; 
		sc.close();
		Arrays.fill(mass10, 5);
		if (negativ == 2) {
			mass10[3] = -4;
		}
		System.out.println("исходный массив : \n" + Arrays.toString(mass10));

		boolean flag = true;
		for(int i = 0; i < mass10.length; i++) {
			if(i > 0) {

				if (mass10[i] != mass10[i - 1]) {
					flag = false;
				}
				
			}
		
		}

		System.err.println(flag ? "\nYes" : "\nNo");

	}

}
