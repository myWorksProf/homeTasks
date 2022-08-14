package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 8
//					Даны два числа x и y. Программа должна вывести в кон-
//					соль YES, – если оба числа четные, либо оба числа нечетные; 
//					иначе программа ничего не выводит.

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// Программа должна вывести в консоль YES, – если оба числа четные,
		// либо оба числа нечетные;
		// иначе программа ничего не выводит.
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число Х: ");
		if (sc.hasNextInt()) {
			int x = sc.nextInt();		
			System.out.print("Введите число Y: ");
			if (sc.hasNextInt()) {
				int y = sc.nextInt();
				x = (x & 1);
				y = (y & 1);
				System.out.println( x == 0 ? "x - чётное" : "x - нечётное");
				System.out.println(y == 0 ? "y - чётное" : "y - нечётное");
				if((x == 0 && y == 0) || (x != 0 && y != 0) ) {
					System.out.println( "\nYES");
				}
			}
			else {
			System.err.println("\nerror: на наш взгляд это точно не цифра :F!!!\n");
		  	}
		}
		else {
		System.err.println("\nerror: на наш взгляд это точно не цифра :F!!!\n");
	  	}
	    sc.close();	
		System.out.println("\nПрограмма завершена!");
	}
}
