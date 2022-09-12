package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Random;
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
		
		System.out.print("Введите размер массива:  ");
		int size = sc.nextInt();
		
//		sc.close();
//		int size = 20;
		//	int[] massStr = new int[size];		
			//int[] massStr = new int[size];	
			char[] charList = new char[size];
		// StringBuilder  str = new StringBuilder(size);		
		Random rand = new Random();
		 
		int count = 0, countWord = 0, countNum = 0;
		
		//for (int i = 0; i < size; i++) {

			//size--;
//  заполняем заданный массив символами в рандомном порядк.		
			int remainderArrayLength = 0;	
			for (int i = 0; i < charList.length; ) {
				
//  	заполняем заданный массив буквами	
				
				remainderArrayLength = size  - i;
				int wordLength = rand.nextInt(5) + 1;
				if (remainderArrayLength < wordLength) {
					wordLength = remainderArrayLength;
				}
//				System.out.println("wordLength = " + wordLength);
				for (int j = 0; j < wordLength; j++){

					int tmp = rand.nextInt(122 - 97 + 1) + 97;;//'a' + rand.nextInt('z' - 'a');
					charList[i] = (char)tmp;
					countWord++;
					i++;
				}
				
//		заполняем заданный массив пробелами		
				remainderArrayLength = size - i;
				int numberSpaces = rand.nextInt(5) + 1;
				if(remainderArrayLength < numberSpaces) {
					numberSpaces = remainderArrayLength;
				}
				if (remainderArrayLength <=5 && remainderArrayLength > 2) {
					numberSpaces = 2;
				}
				if (remainderArrayLength <= 2) {
					numberSpaces = 0;
				}
//				System.out.println("numberSpaces = " + numberSpaces);
				for (int j = 0; j < numberSpaces; j++) {

					int tmp = 32;
					charList[i] = (char)tmp;
					countNum++;
					i++;
				}
				count ++;
			}
			
//  считаем количество слов
			int countSpase = 1;
			for (int i = 0; i < charList.length; i++) {
				
				if (i > 0 && charList[i] == ' ') {
					if (charList[i] != charList[i+1])
					countSpase ++;
				}
			}
		
		System.out.println(charList);

		System.out.println("\n количество:\n\n	слов : " + countSpase + "\n	проходов = " + count + ";\n	букв  = " + countWord + ";\n	пробелов = " +  countNum);
	}
}
