package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ
//			Задание 12
//				Проверить, есть ли в двоичной записи числа n хотя бы 
//				один 0. Используя только побитовые и условные операторы. 
//				Вывести на консоль исходное число в двоичном виде и ре-
//				зультат.

public class Task_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число M: ");
		int num = sc.nextInt();
		sc.close();
		int mask = 1;
		System.out.println("исходное значение:   " + String.format("%32s",
				Integer.toBinaryString(num)).replace(' ','0')); 
		int count = 0;
		
		while (mask != 0) {
			
			int tmp = num & mask;
			
				if (tmp == 0) {
					count ++;
				}
			mask = mask << 1;
		}

		System.out.println("количество нулевых битов :" + count);
	}
}
