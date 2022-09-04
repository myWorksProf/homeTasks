package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ 
//			Задание 3
//			Установить i-й бит числа N равным 1. Вывести результат 
//			на консоль в двоичном виде.

public class Task_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int num = sc.nextInt();
		
		System.out.print("Введите номер бита для утановки его в единицу: ");
		int bit = sc.nextInt();
		
		sc.close();
		
		System.out.println("исходное значение:     " + Integer.toBinaryString(num));
		
		int result = num | (1 << bit);
		
		System.out.println("измененное значение:   " + Integer.toBinaryString(result));

	}

}
