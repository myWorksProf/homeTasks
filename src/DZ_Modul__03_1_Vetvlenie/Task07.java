package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 7
//					Пользователь вводит с клавиатуры букву. Программа 
//					должна определить, в какой раскладке введена буква – в ла-
//					тинской или кирилице. Вывести в консоль: «латиница», если 
//					буква введена латиницей или «кирилица», если буква отно-
//					сится к кирилическому алфавиту. Если введена цифра, а не 
//					буква, вывести «цифра». Если символ не относится ни к бук-
//					вам, ни к цифрам, вывести «невозможно определить».

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// определить в какой раскладке введена буква – в латинской или кирилице.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите символ: ");
		char oneChar = sc.next().charAt(0);
		
		int ascii = (int) oneChar;
		if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
			System.out.println("\nлатиница!\n");
		}
		else if(ascii >= 1040 && ascii <= 1103) {
			System.out.println("\nкирилица!\n");
		}
		else if(ascii >= 48 && oneChar <= 57) {
			System.out.println("\nцифра!\n");
		}
		else {
			System.out.println("\nневозможно определить!\n");
		}
	    sc.close();	
		System.out.println("\nПрограмма завершена!");
 
	}

}
