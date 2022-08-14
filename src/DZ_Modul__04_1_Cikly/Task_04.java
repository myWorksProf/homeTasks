package DZ_Modul__04_1_Cikly;

import java.util.Scanner;

public class Task_04 {

	public static void main(String[] args) {
		
//		Домашнее задание No 4.1
//		Задание 4
// 		Показать на экране все совершенные числа в диапазоне от 0 до 1 000 000.

		int number = 1_000_000;

		for (int currentNum  = 1; currentNum <= number; currentNum++) {
			int summ = 0;
			for (int temp = 1; temp < currentNum; temp++) {
				if (currentNum % temp == 0) {
					//	System.out.println("temp -> " + temp);
					summ += temp;
				}
				if (summ > currentNum) {
					break;
				}
			}
	   	 	if(summ == currentNum) {
	   	 		System.err.println("	*****  ->   " + summ);	
	   	 	}
//	   		 if (currentNum % 70_000 == 0) {
//	   		 	System.out.println("1 -> " + currentNum);
//	   		 }
		}
	    System.out.println("Конец программы!");
	}

}
