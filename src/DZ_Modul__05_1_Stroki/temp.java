package DZ_Modul__05_1_Stroki;

import java.util.Scanner;

//	Домашнее задание № 5.1
//		СТРОКИ
//			Задание 4
//				Ввести строку с клавиатуры (латиницей). Из введенной 
//				строки выбрать все слова, начинающиеся на гласные буквы 
//				и заканчивающиеся на согласные. Вывести отобранные 
//				слова на консоль. 

public class temp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите любую строку текста:  ");
		String str = sc.nextLine();
		sc.close();

//		String tempGlas = "aeiouy";
//		String tempSoglas = "bcdfghjklmnpqrstvwxz";
		
//		String str2 = str.replaceAll("\\p{Punct}", " ").toLowerCase();
		String str2 = str.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
		System.out.println(str);
//		System.out.println(str2);
		
		char[] charList = str2.toCharArray();
		char [] glas = new char[] {'a', 'i', 'o', 'u', 'y', 'e' }; //  tempGlas.toCharArray();
		char [] soglas = new char[] {'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k',
				'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'}; // tempSoglas.toCharArray();
		int charStr = 0;
		 str.toLowerCase();
		boolean flag = false; 
		 
		for (int i = 0; i < str.length(); i++) {
			if (charList[i] != ' ' ) {
				charStr ++;
				
			}
			 if (i != 0 && str2.charAt(i) == ' ' && str2.charAt(i - 1) != ' ' || i + 1 == str2.length()) {
				 char tmp = 0;
				for (int j = 0; j < soglas.length; j ++) {
					if(i + 1 == str.length() && charList[i] != ' ') {
						tmp = charList[i];
					}
					else {
						tmp = charList[i-1];
					}
					if ( tmp == soglas[j]) {
					
						for (int k = 0; k < glas.length; k++) {
							if(i + 1 == str.length() && charList[i] != ' ') {
								tmp = charList[i + 1 - charStr];
							}
							else {
								tmp = charList[i  - charStr];
							}
							
							if (tmp == glas[k]) {
								int c = 0;
								if (i + 1 == str.length() && charList[i] != ' ') {
									c = i + 1 - charStr;
									for (;c <= i; c ++) {
										System.out.print(str.charAt(c));
									}
								}
								else {
									c = i  - charStr;
									for (;c < i; c ++) {
										System.out.print(str.charAt(c));
									}
								}
								flag = true;
								System.out.println();
							}
							
						}
						
					}
				}
			}
			if (charList[i] == ' ' ){
				charStr = 0;	
			}
		  
		}
		System.out.println(flag? "" : "Ну значит нет таких слов :)");
			
		
	}

}
