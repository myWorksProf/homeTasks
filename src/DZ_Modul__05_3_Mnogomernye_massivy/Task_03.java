package DZ_Modul__05_3_Mnogomernye_massivy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//		DZ_05_3
//			МНОГОМЕРНЫЕ МАССИВЫ
//				Задание 3
//				Создать массив из 200 случайных чисел в диапазоне от 0 до 200. 
//				Определить количество одноразрядных, двухразрядных и трёхразрядных чисел 
//				в процентном отношении. 
//				Вывести на консоль полученный массив и количество по разрядам. 
//					Пример:
//						digit 1 = 4
//						digit 2 = 45
//						digit 3 = 39

public class Task_03 {

	public static void main(String[] args) {

		final int SIZE=200;  
		double single_digit=0; 
		double two_digit=0; 
		double three_digit=0;	
		int i = 0;
		int num = 0;
		//int count = 0;
		int[] array200Rand = new int[SIZE];
		
		Random rand = new Random();

		for (; i < array200Rand.length; i++) {
			
			array200Rand[i] = rand.nextInt(201);
			num = array200Rand[i];
			int j=0;
			//count++;
			for (; num > 0; j++)
	        {
	            num/=10;     
	        }
	            if (j<=1)
	        {
	            single_digit+=1;
	        }
	        else if (j==2)
	        {
	            two_digit+=1;
	        }
	        else if (j==3)
	        {
	            three_digit+=1;
	        } 		
	    }	
	    System.out.printf("single_digit = %.0f шт.\n", single_digit);
	    System.out.printf("two_digit = %.0f шт.\n", two_digit);
	    System.out.printf("three_digit = %.0f шт.\n", three_digit);
	    double digit1 = 0, digit2 = 0, digit3 = 0;
	    digit1=(single_digit/SIZE)*100;
	    digit2=(two_digit/SIZE)*100;
	    digit3=(three_digit/SIZE)*100;
	    
	    System.out.println("В процентном соотношении:");
	    System.out.printf("digit 1 = %.1f\n", digit1);
	    System.out.printf("digit 2 = %.1f\n", digit2);
	    System.out.printf("digit 3 = %.1f\n", digit3);
	    //System.out.printf("count = %d\n", count);
		
		System.out.println(Arrays.toString(array200Rand));
	}

}
