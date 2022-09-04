package DZ_Modul__05_1_Stroki;

import java.util.Scanner;

//	Домашнее задание № 5.1
//		СТРОКИ
//			Задание 1 
//				Ввести с клавиатуры строку текста, а затем один символ. 
//				Показать на консоль индексы и количество совпадений (ищем 
//				вхождения символа в строку). В случае если совпадений не 
//				найдено, вывести соответствующий текст.

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите любую строку текста:  ");
		String str = sc.nextLine();
		
		System.out.print("Введите один символ:  ");
		String oneChar = sc.next();
		
		sc.close();
		boolean flag = false;
		if (oneChar.length() == 1) {
			char ch = oneChar.charAt(0);
			
			int count = 0;
			 
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					System.out.println("индекс символа: " + i);
					count ++;
					flag = true;
				}
			}
			System.out.printf("Количество символов '%c': %d", ch, count);
		}
		if (!flag) {
			System.out.println("совпадений не	найдено.");
		}
		
		

	}

}
