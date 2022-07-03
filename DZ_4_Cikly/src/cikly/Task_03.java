package cikly;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {

//		Домашнее задание No 4.1
//		Задание 3
//		Показать на экране все числа Армстронга в диапазоне от
//		10 до 1 000 000.
    	
	    int number = 1_000_000;
	    int i = 1;
	    for (int currentNum  = 10; currentNum <= number; currentNum++) {
		    int temp = currentNum;
		    int y = 0;
		    while (temp != 0) {
		    	temp /= 10;
		    	++y;
		    }
		    int sumPower = 0;
		    temp = currentNum;
		    while (temp != 0) {
		    	int sumNum = 1; ;
		    	int num = temp % 10;
			    for (int j = y; j>0; j--) {
			    	sumNum = sumNum * num;
			    }
			    sumPower += sumNum;
		   		temp /= 10;
		    }
		    if (sumPower == currentNum) {
		    	System.out.printf("%d = %d\n", i, sumPower);
		    	i ++;
		    }		    		    		
	    }
		System.out.println("Конец программы!");
	} 
}