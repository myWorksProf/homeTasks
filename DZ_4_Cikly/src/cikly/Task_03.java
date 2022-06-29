package cikly;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {

//		Домашнее задание No 4.1
//		Задание 3
//		Показать на экране все числа Армстронга в диапазоне от
//		10 до 1 000 000.

	    System.out.println("Введите положительное число: ");
	    Scanner in = new Scanner(System.in);
	    if(in.hasNextInt()) {
	    	int number = in.nextInt();	    	
	    	int numberLength = 0;
	    	long temp = 1;
	    	while (temp <= number) {
	    	    numberLength++;
	    	    temp = (temp << 3) + (temp << 1); // temp *= 10;
	    	}
	    	System.out.println(numberLength);
	    	 
	    	for (int i = 1; i <= numberLength; i++ ) {
	    		int num1 = n1 % 10;
	   		 int n = n1 / 10;
	   		int num2 = n % 10;
	   		n = n /10;
	    		
	    	int num1 = number / 100;
	    	int num2 = num1 % 10;
	    	int num3 = num1 /10;
	    	System.out.printf("num1 - %d, num2 - %d, num3 = %d", num1, num2, num3);	    		
	    	}
	    	
	    }
	    else {
	    	System.out.println("Это не число!");
	    }
	    
	}

}