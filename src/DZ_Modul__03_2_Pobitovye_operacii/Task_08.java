package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ 
//			Задание 8
//				Обнулить крайний левый (старший разряд) единичный 
//				бит числа N. Вывести результат на консоль в двоичном виде.

public class Task_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int num = sc.nextInt();
		sc.close();
		//int num = -12;
		System.out.printf("исходное значение:  %d;\n", num);
		System.out.println("исходное значение:   " + String.format("%32s",
				Integer.toBinaryString(num)).replace(' ','0')); 
		int mask = 1;
		
		num = num & ~(mask << 31);
		System.out.println();
		System.out.println("измененное значение: " + String.format("%32s",
				Integer.toBinaryString(num)).replace(' ','0')); 
		System.out.println("измененное значение: " + num);

	}

}
