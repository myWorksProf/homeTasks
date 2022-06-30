package cikly;

import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) {
//		Домашнее задание No 4.1
//		Задание 2
//		выводит на экран все простые числа в диапазоне от 2 до 1 000 000.
		

		   int i, j;
		   boolean flag;
		         for(i=2; i < 1_000_000; i++) {
		         flag = true;
		             // проверить, делится ли число без остатка
		             for (j=2; j <= i/j; j++) {
		            	 if((i%j) == 0) {
		            		 flag = false;
		            	 }
		             }      
		             if (flag) {
		            	 System.out.printf("%d - простое число\n", i);
		             }
		                     
		}
		System.out.println("Конец программы!");
		

	}

}
