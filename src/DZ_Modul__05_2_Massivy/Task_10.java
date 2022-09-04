package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 10
//				Заполнить массив размерности n случайными циф-
//				рами от 0 до 33. Найти элемент массива, который делится 
//				без остатка на значение элемента слева и значение элемен-
//				та справа. Вывести на консоль значения исходного массива. 
//				Вывести индекс найденного элемента, если такой не найден, 
//				вывести -1. n – задается с клавиатуры.

public class Task_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите размерность массива:  ");
		int size = sc.nextInt();
		sc.close();
		
		int[]massN = new int[size];  	// {4, 21, 15, 4, 25, 30, 12, 5, 28, 25, 3, 6, 2, 17, 30, 10};
		Random rand = new Random();
		
		for (int i = 0; i < massN.length; i++) {
			massN[i] = rand.nextInt(34);
		}
		System.out.println("Исхоный массив:");
		System.out.println(Arrays.toString(massN));
		boolean flag = true;
		for (int i = 1; i < massN.length - 1; i++) {
			int current = massN[i];
			int before = massN[i - 1];
			int after = massN[i + 1];
			if (current == 0 || before == 0 || after == 0) {
				break;
			}
			
			if (current % before == 0 && current % after == 0) {
//				System.out.printf("\n  ***  \n index = %d; \n before = %d \n current = %d "
//						+ "\n after = %d",i, before, current, after);
				System.out.printf("\nindex = %d;", i);
				flag = false;
			}
		}
		System.out.println(flag? "\n-1" : "");
	}
}
