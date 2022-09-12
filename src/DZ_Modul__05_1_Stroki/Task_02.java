package DZ_Modul__05_1_Stroki;

import java.util.Random;
import java.util.Scanner;

//	Домашнее задание № 5.1
//		СТРОКИ
//			Задание 2
//				Написать программу, которая создаст строку, в которой 
//				находятся все целые числа, начиная с 1, выписаны в одну 
//				строку «123456789101112131415...». Строка должна быть 
//				длиной не более 1 000 символов. 
//				По числу n (введенного с клавиатуры), выведите цифру на 
//				n-й позиции (используется нумерация с 1).

public class Task_02 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int size = rand.nextInt(800) + 20;
		System.out.println("показано цифр:  " + size);
		char[] charList = new char[size];
		String template = "1234567890";
		
		for (int i = 0; i < charList.length; i++) {
			int index = rand.nextInt(0, template.length());
			char ch = template.charAt(index);
			charList[i] = ch;
		}
		
		String str = new String(charList);
		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите номер позиции:  ");
		int oneChar = sc.nextInt();
		
		sc.close();
		
		
		
		System.out.println("цифра на " + oneChar + " позиции = " + charList[oneChar - 1] );

	}

}
