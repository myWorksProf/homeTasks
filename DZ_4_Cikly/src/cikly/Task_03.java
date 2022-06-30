package cikly;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {

//		Домашнее задание No 4.1
//		Задание 3
//		Показать на экране все числа Армстронга в диапазоне от
//		10 до 1 000 000.
    	
	    int number = 1_000;
	    for (int i = 150; i <= number; i++) {
		    int temp = i;
		    int y = 0;
		    while (temp != 0) {
		    	temp /= 10;
		    	++y;
		    }
		   // System.out.println("число из " + y + "символов");
		    
		    int sumPower = 0;
		    temp = i;
		    while (temp != 0) {
		    	int num = temp % 10;
		    	if (num>0) {
			    	for ( i = 1; i<=y; i++) {
			    		num = num * num;
			    	}
		    		
		    	}
			    	else{
			    		break;
			    	}
		    }
		    if (sumPower == i) {
		    	System.out.println("i = " + i);		    	
		    }
		    
		    		
	    }
		System.out.println("Конец программы!");
//	    for (int i = 1; i <= numberLength; i++ ) {
////	    		int num1 = n1 % 10;
////	   		 int n = n1 / 10;
////	   		int num2 = n % 10;
////	   		n = n /10;
//	    		
//	    	int num1 = number / 100;
//	    	int num2 = num1 % 10;
//	    	int num3 = num1 /10;
//	    //	System.out.printf("num1 - %d, num2 - %d, num3 = %d", num1, num2, num3);	    		
//	    }
	    	
	} 
}