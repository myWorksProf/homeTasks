package DZ_Modul__03_2_Pobitovye_operacii;

import java.util.Scanner;

//	Домашнее задание № 3.2
//		ПОБИТОВЫЕ 
//			Задание 10
//				Найти и вывести на консоль минимальное из двух чисел 
//				M и N, используя только побитовые операции. 

public class Task_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число M: ");
		int numM = sc.nextInt();
		System.out.print("Введите число N: ");
		int numN = sc.nextInt();
		sc.close();

		System.out.println("значение M:   " + Integer.toBinaryString(numM));
		System.out.println("значение N:   " + Integer.toBinaryString(numN));
		
		int res = (numN + ((numM - numN) & ((numM - numN) >> 31)));

		System.out.println("минимальное значение:   " + Integer.toBinaryString(res));
		System.out.println("res:   " + res);
//		int mask = 1;		
//		int countM = 0;
//		int countN = 0;
//		
//		while (mask != 0) {
//			
//			int tmp = numM & mask;
//			
//				if (tmp != 0) {
//					countM ++;
//				}
//			mask = mask << 1;
//		}
//
//		while (mask != 0) {
//			
//			int tmp = numN & mask;
//			
//			if (tmp != 0) {
//				countN ++;
//			}
//			mask = mask << 1;
//		}
//		
//		System.out.println("M :" + countM);
//		System.out.println("N :" + countN);
//		
//		System.out.println(countM < countN ? numM : numN);		
	}
}
