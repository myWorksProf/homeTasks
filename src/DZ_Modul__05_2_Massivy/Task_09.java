package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 9
//				Заполнить массив размерности n случайными цифрами 
//				от –2 до n. Если в массиве есть хотя бы одно отрицательное 
//				значение меньше -1, заменить все отрицательные значение 
//				в массиве на квадрат (в степени 2) этих значений. Вывести 
//				исходный и результирующий массив на консоль.

public class Task_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите размерность массива:  ");
		int size = sc.nextInt();
		sc.close();
		
		int[]massN = new int[size];
		Random rand = new Random();
		
		for (int i = 0; i < massN.length; i++) {
			massN[i] = rand.nextInt(size + 1) -2;
		}
		System.out.println("Исхоный массив:");
		System.out.println(Arrays.toString(massN));
		
		for (int i = 0; i < massN.length; i++) {
			if (massN[i] < 0) {
				massN[i] = (int)Math.pow(massN[i], 2);
			}
		}
		System.out.println("\nРезультирующий массив:");
		System.out.println(Arrays.toString(massN));

	}

}
