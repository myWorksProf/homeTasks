package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ 
//			Задание 9
//				Определить имеют ли чисел M и N разные знаки. 
//				Используя только побитовые и условные операторы.

public class Task_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число M: ");
		int numM = sc.nextInt();
		System.out.print("Введите число N: ");
		int numN = sc.nextInt();
		sc.close();
		
		int signM = numM>>31;
		int signN = numN >>31;
		 System.out.println(signN == signM? "знаки этих чисел одинаковые." : "разные знаки у этих чисел");
		
	}

}
