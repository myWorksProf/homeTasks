package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ ОПЕРАЦИИ
//			Задание 6
//				Обнулить все кроме последних i битов числа N. Вывести 
//				результат на консоль в двоичном виде.

public class Task_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int num = sc.nextInt();
		
		System.out.print("Введите номер бита до которого нужно обнулить: ");
		int bit = sc.nextInt();

		sc.close();

		System.out.println("исходное значение:     " + Integer.toBinaryString(num));
		
		int result =  ~(num >> bit) & num;
		System.out.println("измененное значение:   " + Integer.toBinaryString(result));
		result = result << bit;
		
		System.out.println("измененное значение 1:   " + Integer.toBinaryString(result));
		

	}

}
