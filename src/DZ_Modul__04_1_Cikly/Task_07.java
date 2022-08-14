package DZ_Modul__04_1_Cikly;

import java.util.Scanner;

public class Task_07 {

	public static void main(String[] args) {
		
//		Домашнее задание No 4.1
//		Задание 7
// 		Показать битовое представление значения переменной 
//		типа int, используя только один цикл, управляющую переменную, 
//		вывод на консоль и битовые операции. 
//		Не использовать строки и любые другие готовые функции (методы). 

		Scanner sc = new Scanner (System.in);
		System.out.print("Введите целое число: ");
		int number = sc.nextInt();
		sc.close();
			int count = 0;
			int num = number;
		System.out.println("Представление числа: " + number + " в двоичной системе исчисления,\n toBinaryString : ->> " + Integer.toBinaryString(number) + "\n");

		System.out.print("    моё решение : ->> ");
		for (int i= 31; i >= 1; i--) {
			num = number >>>i;
			count = num % 2;
			System.out.print(count);
		}
		if (number < 0) {
			number = ~number ;
			System.out.print(" ***  " + number + " ****  ");
		}
		count = number % 2;
		System.out.print(count);
		System.out.println("\n\nКонецт программы!");
	}
	
}
