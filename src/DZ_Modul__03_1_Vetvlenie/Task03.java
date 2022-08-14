package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 3
//					Написать программу, которая предлагает пользователю 
//					выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в 
//					ответ показывает, какие звуки издает выбранное животное. 
//					В списке должно быть не менее 10 животных.

import java.util.Scanner;
public class Task03 {

	public static void main(String[] args) {
		// какие звуки издает выбранное животное
	 	
		Scanner sc =new Scanner(System.in);
		System.out.print(" 1-кошка\n 2-сабака\n 3-корова\n 4-свинка\n 5-тигр\n 6-коза\n"
				+ " 7-баран\n 8-лошадь\n 9-осел\n 10-мышка\n Выбирите из списка номер животного и введите его номер: ");
		if (sc.hasNextInt()) {
			int digitAnimal = sc.nextInt();
			if (digitAnimal >= 1 && digitAnimal <=10) {
				switch (digitAnimal) {
					case 1:
						System.out.println("\n кошка говорит мяу - мяу");
						break;
					case 2:
						System.out.println("\n сабака говорит гав - гав");
						break;
					case 3:
						System.out.println("\n корова говорит му - му");
						break;
					case 4:
						System.out.println("\n свинка говорит хрю - хрю");
						break;
					case 5:
						System.out.println("\n тигр говорит ррр - ррр");
						break;
					case 6:
						System.out.println("\n коза говорит мее - мее");
						break;
					case 7:
						System.out.println("\n баран говорит бее - бее");
						break;
					case 8:
						System.out.println("\n лошадь говорит игого - игого");
						break;
					case 9:
						System.out.println("\n осел говорит иа - иа");
						break;
					case 10:
						System.out.println("\n мышка говорит пии - пии");
						break;
				}
			} else {
				System.err.printf("%d: животного с таким номером нет унас в списке ;)!!!\n", digitAnimal);
			}
			
		} else {
			System.err.println("\nerror: появилось сомнение, что это цифра :F!!!\n");
		}
		sc.close();	
		System.out.println("\nПрограмма завершена!");

	}

}
