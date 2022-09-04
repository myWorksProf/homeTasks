package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ ОПЕРАЦИИ
//			Задание 2
//				Вывести на консоль 2 в степени n. Для вычисления 
//				использовать только побитовые операции. 

public class Task_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите степень числа 2: ");
		int degree = sc.nextInt();
		sc.close();
		
		int res = 2 << degree - 1;
		
		System.out.println("результат 2 в степени " + degree + " -->  " + Integer.toBinaryString(res));
		System.out.println(res);

	}

}
