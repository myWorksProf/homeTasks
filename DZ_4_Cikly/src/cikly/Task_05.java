package cikly;

import java.util.Scanner;

public class Task_05 {

	public static void main(String[] args) {
		
//			Домашнее задание No 4.1
//			Задание 5
//  		является ли число, введенное с клавиатуры палиндромом (одинаково 
//			читающееся в обоих направлениях). 
		
	    System.out.print("Введите положительное число: ");
	    Scanner in = new Scanner(System.in);
	    if(in.hasNextInt()) {
	    	int inputNumber = in.nextInt();
	    	in.close();
	        int lastDigit,sum=0;
	        int enumerator = inputNumber;
	        
	        while (enumerator > 0) {
	        	lastDigit = enumerator % 10;
	        	sum = sum * 10 +lastDigit;
	        	enumerator = enumerator / 10;
	        }
	        
	        if(sum == inputNumber) {
	        	System.out.println("YES");
	        }
	        else {
	        	System.out.println("NO");
	        }
	    }
	    System.out.println("Конец программы!");
	}
}
