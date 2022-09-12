package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ
//			Задание 11
//			Посчитать и вывести на консоль количество единичных 
//			битов в числе N.  Вывести на консоль исходное число 
//			в двоичном виде и результат.

public class Task_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число M: ");
		int num = sc.nextInt();
		sc.close();
		int mask = 1;
		System.out.println("исходное значение:   " + Integer.toBinaryString(num));
		int count = 0;
		
		while (mask != 0) {
			
			int tmp = num & mask;
			
				if (tmp != 0) {
					count ++;
				}
			mask = mask << 1;
		}
		System.out.println("количество единичных битов :" + count);
	}

}
