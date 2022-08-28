package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Scanner;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 4
//				Написать программу, которая проверяет, все ли значения 
//				элементов массива различные (не повторяются). Вывести: 
//				Yes – если все различные и No – если имеется хоть одно 
//				повторение. Массив задается и инициализируется в начале программы.

public class Task_04 {

	public static void main(String[] args) {

		int[] mass = new int[] {29, 3, 30, -27, -58, -23, -46, 49, -66, -35, 26, -38, 9, 2, 32, 13, -7, 35, 43, -33, -29, 18};
		boolean various = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("элементы массива : \n  1 - не повторяются \n  2 - повторяются" );
		int repetition = sc.nextInt();
		if (repetition == 2) {
			mass[7] = 18;
		}
		sc.close();
		System.out.println("исходный массив : \n" + Arrays.toString(mass));

		for (int i = 0; i < mass.length; i++) {
			
			for (int j = i + 1; j <mass.length ; j++) {

				if (mass[i] == mass[j]) {
				System.err.println(mass[i] + " = " + mass[j]);	
					various = false;
				}

			}
			
		}
		System.err.println(various ? "\nYes" : "\nNo");

	}

}
