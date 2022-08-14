package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 4
//					Дана точка на плоскости заданная координатами x и y, 
//					определить и вывести в консоль, в какой четверти находится точка, 
//					в прямоугольной (декартовой) системе координат. 
//					Четверти обозначены римскими цифрами.

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите координату Х, целое число от -10 до 10: ");
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			int x1 = 0;
			int y1 = 0;
			System.out.print("Введите координату У, целое число от -10 до 10: ");
				if (sc.hasNextInt()) {
					int y = sc.nextInt();
					if (x == 0) {
						x1 = 0;
					} else if (x >= -10 && x <= 0) {
						x1 = -5;
					} else if (x >=0 && x <= 10) {
						x1 = 5;	
					} 
					 if (y == 0) {
						y1 = 0;
					} else if (y >= -10 && y <= 0) {
						y1 = -5;
					} else if (y >=0 && y <= 10) {
						y1 = 5;	
					} 
					if (x1 == 5 && y1 == 5 ) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится в I четверти\n", x, y);					
					if (x1 == 0 && y1 == 5 ) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится на границее I и II четверти\n", x, y);					
					if (x1 == -5 && y1 == 5) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится в II четверти\n", x, y);					
					if (x1 == -5 && y1 == 0 ) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится  на границее II и III четверти\n", x, y);
					if (x1 == -5 && y1 == -5) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится в III четверти\n", x, y);					
					if (x1 == 0 && y1 == -5) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится на границее III и IV четверти\n", x, y);
					if (x1 == 5 && y1 == 0) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится на границее I и IV четверти\n", x, y);					
					if (x1 == 5 && y1 == -5 ) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится в v четверти\n", x, y);
					if (x1 == 0 && y1 == 0) System.out.printf("\nТочка с ккоординатами x = %d и y = %d находится строго в центе\n", x, y);
					
				} 	
				else {
					System.err.println("\nerror: на наш взгляд это точно не цифра :F!!!\n");
			  	}
		} 	
			else {
			System.err.println("\nerror: появилось сомнение, что это цифра :F!!!\n");
			}
		sc.close();	
		System.out.println("\nПрограмма завершена!");

	}
}
