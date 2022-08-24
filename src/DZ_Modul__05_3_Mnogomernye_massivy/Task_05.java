package DZ_Modul__05_3_Mnogomernye_massivy;

import java.util.Arrays;
import java.util.Random;

//	DZ_05_3
//		МНОГОМЕРНЫЕ МАССИВЫ
//			Задание 5
//				Создать массив из 20 случайных чисел в диапазоне от -10 
//				до 20. Определить максимальное количество подряд иду-
//				щих положительных элементов, не прерываемых ни нулями, 
//				ни отрицательными числами. Вывести на консоль исходный 
//				массив и найденный фрагмент

public class Task_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 20;
		int[] array20Rand = new int [size]; //{6, 13, 8, -1, -2, 13, -2, 18, 16, -8, -3, -10, 10, 1, -4, 16, -10, 13, -18, 11};
		Random rand = new Random();
		
		for (int i = 0; i < array20Rand.length; i++) {
			array20Rand[i] = rand.nextInt(30) -10;  
		}
		System.out.println("Исходный массив:");
		System.out.println(Arrays.toString(array20Rand));
		int count = 0;
		int maxCount = 0;
		int endIndex = 0;
		for (int i = 0; i < array20Rand.length; i++) {
			if(array20Rand[i] > 0) {
				count ++;
			}
			if(maxCount < count) {
				maxCount = count;
				endIndex = i;
			}
			if (array20Rand[i] == 0 || array20Rand[i] < 0) {
				count = 0;
			}
		}
		int[] fragment = new int[maxCount];
		int startIndex = endIndex - maxCount + 1;
		for (; maxCount > 0; maxCount --) {
			System.arraycopy(array20Rand, startIndex, fragment, 0, maxCount);
		}
		System.out.println("полученнй фрагмент массива:");
		System.out.println(Arrays.toString(fragment));
	}

}
