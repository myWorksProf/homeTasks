package DZ_Modul__05_3_Mnogomernye_massivy;

import java.util.Arrays;

//		DZ_05_3
//			МНОГОМЕРНЫЕ МАССИВЫ
//				Задание 1 
//					Сформировать массив, элементами которого будут 
//					квадраты соответствующих индексов. 
//					Вывести результат на экран.

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] squaredIndex = new int[11];
		
		for (int i = 0; i < squaredIndex.length; i++) {
			squaredIndex[i] = i * i;
		}
		System.out.println(Arrays.toString(squaredIndex));

	}

}
