package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 12
//					Программа запрашивает шестизначное число. После вво-
//					да определяет, будет ли являться «счастливым» билет с та-
//					ким номером (сумма первых трех цифр совпадает с суммой трех последних).
//						Пример входных данных: 
//							423027
//							954832
//							Вывод:
//								Да
//								Нет

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// являться ли «счастливым» билет с введенным номером 
        // (сумма первых трех цифр совпадает с суммой трех последних).

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите шестизначное целое число: \t");
		if (sc.hasNextInt()) {
			int numberTicket = sc.nextInt();
			String strnumberTicket = numberTicket + "";
			if (strnumberTicket.length() == 6) {
	
				int sum = numberTicket % 10;
				 numberTicket /= 10 ; 
				 sum += numberTicket % 10;
				 numberTicket /= 10 ; 
				 int sumOne = sum += numberTicket % 10;
				 System.out.println("\nСумма последних трех цифр - " + sumOne);
				 
				 numberTicket /= 10 ; 
				 sum += numberTicket % 10;
				 numberTicket /= 10 ; 
				 sum += numberTicket % 10;
				 numberTicket /= 10 ; 
				 sum += numberTicket % 10;
				 int sumTwo = sum - sumOne;
				 
				 System.out.println("Суммма первых трех цифр - " + sumTwo);	
				 System.out.println(sumOne == sumTwo ? "\nБилет счастливый!\n " : "\nБилет не счастливый :(");	
			}else {
				System.out.printf("\nЦыфр должно быть ровно 6  :( !!!\n", numberTicket );
			}
		}else {
			System.out.print("\nкаждое число должно быть целым  :( !!!\n");
		}
	sc.close();
	System.out.println("\nПрограмма завершена!");
	}
}