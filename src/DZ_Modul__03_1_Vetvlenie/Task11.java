package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 11
//					Найти корни квадратного уравнения и вывести их на 
//					экран, если они есть. Если корней нет, то вывести сообще-
//					ние об этом. Конкретное квадратное уравнение определяет-
//					ся коэффициентами a, b, c, которые вводит пользователь с клавиатуры.

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// Найти корни квадратного уравнения и вывести их на
		// экран, если они есть. Если корней нет, то вывести сообщение об этом.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите a:\t");
		double a = sc.nextDouble();
		System.out.print("Введите b:\t");
		double b = sc.nextDouble();
		System.out.print("Введите c:\t");
		double c = sc.nextDouble();
		double D;
		D = b * b - 4 * a * c;
		if (D > 0) {
		    double x1, x2;
		    x1 = (-b - Math.sqrt(D)) / (2 * a);
		    x2 = (-b + Math.sqrt(D)) / (2 * a);
		    System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
		}
		else if (D == 0) {
		    double x;
		    x = -b / (2 * a);
		    System.out.println("Уравнение имеет единственный корень: x = " + x);
		}
		else {
		    System.out.println("Уравнение не имеет действительных корней!");
		}		
		sc.close();
		System.out.println("\nПрограмма завершена!");
	}
}
