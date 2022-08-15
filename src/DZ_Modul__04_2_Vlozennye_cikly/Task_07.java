package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//	Домашнее задание № 4.2
//		ВЛОЖЕННЫЕ ЦИКЛЫ
//			Задание 7
//				С клавиатуры вводится целое положительное число 
//				любой разрядности. Необходимо перевернуть это число, т. е. 
//				цифры должны располагаться в обратном порядке (например, 
//				вводим число 1234 – в результате будет 4321). 
//				Не использовать строки и массивы.


public class Task_07 {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите любое положительное число: ");	
		int  number= sc.nextInt();
		int num = 0;
	    do {
    	    num = number % 10;
    	    number /= 10;
    	    System.out.print(num);
	    } while (number > 0);
	    

	}

}
