package DZ_Modul__05_2_Massivy;

import java.util.Arrays;
import java.util.Scanner;

//	Домашнее задание № 5.2
//		МАССИВЫ
//			Задание 12
//				Программа должна выводить слово Yes для симметрич-
//				ного массива и слово No – для несимметричного. Симме-
//				тричным считается массив, в котором значения элементов с 
//				конца равно значению элементов с начала. Массив задается 
//				и инициализируется в начале программы.
//					Примеры значений для симметричного массива:
//						1, 2, 3, 2, 1
//						2, 2, 3, 2, 2

public class Task_12 {

	public static void main(String[] args) {

		int[] mass = new int[] {1, 2, 3, 4, 3, 2, 1};
		
		System.out.println("Вывести симметричный массив : \n 1 - Да\n 2 - Нет");
		Scanner sc = new Scanner(System.in);
		int negativ = sc.nextInt();
		boolean flag = false;
		int halfMass = 0;
		if (negativ == 2) {
			mass[2] = -4;
		}
		if (mass.length % 2 != 0) {

			halfMass = (mass.length - 1) / 2;
			int count = 0;
		
			for (int i = 0; i < halfMass; i++) {
				for (int j = mass.length - 1 - i; j == mass.length -1 - i; j++) {
					if(mass[i] == mass[j]) {
						count ++;
					}	
				}
			}
			if (count == halfMass) {
				flag = true;
			}
		}
		System.out.println("исходный массив " + Arrays.toString(mass));
		System.out.println(flag? "Yes" : "No");
	}

}
