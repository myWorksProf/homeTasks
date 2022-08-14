package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 2
//					С клавиатуры вводится время (количество часов от 0 до 24)
//					программа выводит приветствие, соответствующее 
//					введенному времени (например, ввели 15 часов – выводится 
//					приветствие «Добрый день»).

import java.util.Scanner;
 
public class Task02 {

	public static void main(String[] args) {
		// программа выводит приветствие, соответствующее введенному времени суток 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите час цифрами - ");
		if (sc.hasNextInt()) {
			int hourse  = sc.nextInt();
			String hour = null;
			if (hourse >= 0 && hourse <=24) {
				if (hourse >=0 && hourse <= 5 || hourse == 24 || hourse == 23 ) {	
					if (hourse == 1) hour = "час";
					if (hourse == 23 || hourse == 24 || hourse > 1 && hourse < 5) hour = "часа"; 	
					if (hourse == 0 || hourse == 5) hour = "часов";
					System.out.printf("\nДоброй ночи! Сейчас %d %s ночи.\n", hourse, hour);
				} else if (hourse >=6 && hourse <= 10) {		
					System.out.printf("\nДобре утро! Сейчас %d часов утра.\n", hourse);
				} else if (hourse >=11 && hourse <= 17) {		
					System.out.printf("\nДоброй день! Сейчас %d часов дня.\n", hourse);
				} else if (hourse >=18 && hourse <= 22) {	
					if (hourse == 21) hour = "час";
					if (hourse == 22) hour = "часа"; 
					if (hourse >17 && hourse <21) hour = "часов";
					System.out.printf("\nДоброй вечер! Сейчас %d %s вечера.\n", hourse, hour);
				}
				//System.out.println(" --  1  --  ");
			} else {
				if (hourse == 25) { System.err.println("\n25 часов в сутках только в избранной касте ПАЖАРНИКОВ!!\n"
						+ " и Только потому, что они на час раньше ложаться спать :D!\n"
						+ " а в остальнм обществе столко часов еще не придумали ;)!!!");
				} else {
				System.err.println("\nerror: столко часов еще не придумали ;)!!!\n");
				}
			}
		} else {
			System.err.println("\nerror: появилось сомнение, что это цифра :F!!!\n");
		}
		sc.close();	
		System.out.println("\nПрограмма завершена!"); 
	}

}
