package DZ_Modul__05_3_Mnogomernye_massivy;

import java.util.Arrays;
import java.util.Scanner;

//	DZ_05_3
//		МНОГОМЕРНЫЕ МАССИВЫ
//			Задание 7
//				Заполните n-мерный квадратный массив возрастающими 
//				числами – змейкой. Выведите результат на экран с 
//				соблюдением ширины столбцов
//					Пример:
//						1 2 3 4
//						8 7 6 5 
//						9 10 11 12
//						16 15 14 13

public class Task_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите размерность массива:  ");
		int size = sc.nextInt();
		int[][] arraySquare = new int[size][size];
		int digit = 1;
		boolean flag = false;
		for (int i = 0; i < arraySquare.length; i++ ) {
			if (i != 0 && i %2 != 0) {
				for (int j = arraySquare.length-1; j >= 0 ; j--) {
					arraySquare[i][j] = digit++;
				}
			}
			else {
				for (int j = 0; j < arraySquare.length ; j++) {
					arraySquare[i][j] = digit++;	
				}
			}
			
			
//			int stopFlag = 1;
//			for (int j = 0; j < arraySquare[i].length; j++) {
//					
//					if ( stopFlag == 1 && (i + 1) % 2 == 0) {
//						digit = digit + size - 1;
//						flag = true;
//						stopFlag = 0;
//					}
//					if (flag) {
//						arraySquare[i][j] = digit--;
//					} 
//					else {
//						arraySquare[i][j] = digit++;	
//					}
//
//			}
//			if ( stopFlag == 0 && (i + 1) % 2 == 0) {
//			digit = digit + size + 1;
//			flag = false;
//			}
		}
		//вывод массива в консоль
		for (int i = 0; i < arraySquare.length; i++ ) {
			for (int j = 0; j < arraySquare[i].length; j++) {
				System.out.printf("%2d ", arraySquare[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
