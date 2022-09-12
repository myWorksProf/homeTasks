package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ 
//			Задание 7
//				Определить значение i-го бита числа N. 
//				Вывести результат на консоль в двоичном виде.


public class task_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int num = sc.nextInt();
		
		System.out.print("Введите номер бита значение которого нужно определить: ");
		int bit = sc.nextInt();
		System.out.println("исходное значение:     " + Integer.toBinaryString(num));
		sc.close();

		int result = (num >> bit) & 1;
		
		System.out.println("значение " + bit + "-го бита = " + Integer.toBinaryString(result));

	}

}
