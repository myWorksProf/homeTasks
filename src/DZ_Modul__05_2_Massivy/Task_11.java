package DZ_Modul__05_2_Massivy;

import java.util.Scanner;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 11
//				Заполнить массив размерности n словами, состоящими 
//				только из строчных латинских букв. Слова между собой раз-
//				делены пробелами, количество пробелов случайное – от 1 до 5. 
//				Подсчитать общее количество слов в массиве. n – задается с клавиатуры.

public class Task_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите размерность массива:  ");
		int size = sc.nextInt();
		System.out.print("Введите любую строку текста:  ");
		String str = sc.nextLine();
		sc.close();
		
		String[] massStr = new String[size];		

	}

}
