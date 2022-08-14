package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 1 
//					Написать программу, которая предлагает пользователю 
//					ввести c клавиатуры номер дня недели, и в ответ 
//					показывает название этого дня  (например, 6 – это суббота). 
//					Решить с использованием switch.
//
import java.util.Scanner;

public class Task01 {
 
	public static void main(String[] args) {
		// вводим c клавиатуры номер дня недели, и в ответ показывает название этого дня
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите день недели цифрой - ");
		
		if (sc.hasNextInt()) {
			int digitDayWeek = sc.nextInt();
			if (digitDayWeek >= 1 && digitDayWeek <= 7) {
				switch (digitDayWeek) {
					case 1 :
						System.out.println("Понедельник - это первый день недели");
						break;
					case 2 :
						System.out.println("Вторник - это второй день недели");
						break;
					case 3 :
						System.out.println("Среда - это третий день недели");
						break;
					case 4 :
						System.out.println("Четверг - это четвертый день недели");
						break;
					case 5 :
						System.out.println("Пятница - это пятый день недели");
						break;
					case 6 :
						System.out.println("Суббота - это шестой день недели");
						break;
					case 7 :
						System.out.println("Воскресенье - это седьмой день недели");
						break;
				}
			} else {
					System.err.println("error: нет такого дня недели!!!");
				}
		}  else {
					System.err.println("error: есть подозрение, что это не цифра!!!");
				}
		sc.close();
		System.out.println("\nПрограмма завершена!"); 
	}
}
