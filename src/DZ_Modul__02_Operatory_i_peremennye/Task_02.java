package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 2
//				В переменной n хранится натуральное (целое) трехзначное число. 
//				Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

public class Task_02 {

	public static void main(String[] args) {
		int n = 254;
		int num1 = n % 10;
		int num2 = n / 10 % 10;
		int num3 = n /100;
		int summa = num1 + num2 + num3;
		System.out.printf("исходное число %d \n",n);	
		System.out.printf("вычесленно первое число = %d \n", num3);	
		System.out.printf("вычесленно второе число = %d \n", num2);
		System.out.printf("вычесленно третье число = %d \n", num1);
		System.out.printf("сумма %d + %d + %d = %d \n", num3, num2, num1, summa);
	}

}
