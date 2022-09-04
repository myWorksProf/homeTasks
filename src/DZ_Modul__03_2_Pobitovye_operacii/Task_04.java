package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ ОПЕРАЦИИ
//			Задание 4
//				Инвертировать i-й бит числа N. Вывести результат на 
//				консоль в двоичном виде.

public class Task_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int num = sc.nextInt();
		
		System.out.print("Введите номер бита что бы его Инвертировать: ");
		int bit = sc.nextInt();
		
		sc.close();
		
		System.out.println("исходное значение:     " + Integer.toBinaryString(num));
		
		int result = num ^ (1 << bit);
		
		System.out.println("измененное значение:   " + Integer.toBinaryString(result));
		System.out.println("		   :    9876543210");

	}

}
