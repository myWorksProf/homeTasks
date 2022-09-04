package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		 ПОБИТОВЫЕ ОПЕРАЦИИ
//			Задание 1 
//				Обнулить бит в нулевом разряде числа N. Остальные 
//				биты не должны изменить свое значение. Вывести на кон-
//				соль в двоичном виде. 

public class Task_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("исходное значение:     " + Integer.toBinaryString(num));
		int mask = ~1;
		//System.out.println("   " + Integer.toBinaryString(mask));
		num &= mask;
		System.out.println("измененное значение:   " + Integer.toBinaryString(num));
		

	}
}
