package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//	Домашнее задание № 4.2
//		ВЛОЖЕННЫЕ ЦИКЛЫ
//			Задание 8
//				С клавиатуры вводится целое число любой разрядности. 
//				Программа должна определить и вывести на консоль 
//				количество цифр в этом числе, а так же сумму этих чисел.

public class Task_08 {

	public static void main(String[] args) {
		System.out.println("Введите любое положительное число:");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();

		int count = 0;
		int summ = 0;
		while (digit > 0) {
			summ += digit % 10;
			digit /=10;
			count ++;
		}
		System.out.printf("количество циф = %d\nсумма чисел = %d", count, summ);
	}

}
