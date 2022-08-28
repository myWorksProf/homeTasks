package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 7
//				Заполнить массив размерности n случайными цифрами 
//				от 3 до 13. Подсчитать, сколько раз встречается каждая 
//				цифра. Вывести результат на экран. n – задается с клавиатуры.


public class Task_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите размерность массива:  ");
		int size = sc.nextInt();
		sc.close();
		Random rand = new Random();
		int[] massN = new int[size];
//		int[] massN = new int[] {3, 8, 1, -8, 8, -2, -5, 6, -2, -3};
		int countJ = 1;
		int num = 0;
		
		for (int i = 0; i < massN.length; i++) {
			massN[i] = rand.nextInt(11)+ 3;
		}
		
		System.out.println("исходный массив : \n" + Arrays.toString(massN));
		
		for (int i = 0; i < massN.length; i++ ) {
			for (int j = i + 1; j < massN.length; j++) {
				if (massN[i] == massN[j] && massN[i] != 0) {
					num = massN[i];
					countJ++;
					massN[j] = 0;
				}
				
			}
			if (countJ == 1 && massN[i] != 0) {
				num = massN[i];
			}
			if (massN[i] != 0) {
				System.out.printf("\n%2d -- %2d раз", num, countJ);	
			}
			
			num = 0;
			countJ = 1;

		}
		System.out.println("\nКонец программы!");



	}

}
