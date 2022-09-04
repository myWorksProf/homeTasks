package DZ_Modul__04_1_Cikly;
	
//		Домашнее задание No 4.1
//			Задание 11
//				Напишите программу, которая выводит на экран числа 
//				от 1 до 1 000. При этом вместо чисел, кратных трём, 
//				программа должна выводить слово fizz, а вместо чисел, 
//				кратных	пяти – слово buzz. Если число кратно пятнадцати, 
//				то программа должна выводить вместо числа слово hiss. 	

public class Task_11 {

	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				if (i % 5 == 0) {
					if (i % 15 == 0) {
						System.out.println("hiss");		//" П Я Т Ь Н А Д Ц А Т Ь ");//
						continue;
					}
					System.out.println("buzz");		//" П Я Т Ь ");//
					continue;
				}
				System.out.println("fizz");		//" Т Р И ");//
			}
			else {
				System.out.println( i );
			}
		}
		   System.out.println("Конец программы!");	
	}
}
