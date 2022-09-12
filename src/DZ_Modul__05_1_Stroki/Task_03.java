package DZ_Modul__05_1_Stroki;

import java.util.Scanner;

//	Домашнее задание № 5.1
//		СТРОКИ
//			Задание 3
//			Подсчитать среднюю длину слова, во введенном с 
//			клавиатуры предложении.


public class Task_03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите любую строку текста:  ");
		String str = sc.nextLine();
		sc.close();
		
//		String str = "  ехал грека   через реку, видит   грека в реке рак";
		System.out.println(str);
		int countWord = 1;
		str = str.trim();
//	считаю количество слов		
		for (int i = 0; i < str.length(); i++) {
			
			if (i > 0 && str.charAt(i) == ' ') {
				if (str.charAt(i) != str.charAt(i+1)) {
				countWord ++;
				}
			}
		}

//	создаю массив для хранения количества букв в каждом слове		
//		int[] countWord = new int[count];
//		int countJ = 0;
		
//	считаю количество букв в каждом слове
		
		int countChar = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) != ' ') {
				countChar ++;
			}
			
//			if (str.charAt(i) == ' ') {
//				if (str.charAt(i) != str.charAt(i+1)) {
//				countWord[countJ] = count;
//				countJ ++;
//				}
//			}
			
		}	
//		for (int i = 0; i < str.length(); i ++) {
//			
//			if (str[i] == '')
//		}
		System.out.printf(" char = %d\n word = %d\n", countChar, countWord);
		System.out.println(" средняя длина слова = " + countChar / countWord);
		
	}

}
