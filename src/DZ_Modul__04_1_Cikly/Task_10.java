package DZ_Modul__04_1_Cikly;

public class Task_10 {

	public static void main(String[] args) {

//		Домашнее задание No 4.1
//			Задание 10
//				2520 – наименьшее число, которое можно разделить на 
//				каждое из чисел от 1 до 10, без остатка. Написать программу, 
//				которая рассчитывает наименьшее положительное число, 
//				которое делится на все числа от 1 до 20.

			
			int limonCount = 0;
			for (long i =1; i < 1_000_000_000; i++) {
				int count = 0;
				for (int j = 2; j <= 20; j++) {
					if (i % j != 0) {
						break;
					}
					count ++;
				}
				if (count == 19) {
					System.err.println("наименьшее число ->   " + i);
					break;
				}

//				if (i % 100_000_000 == 0) {
//					limonCount++;
//					System.out.printf("%d_000_000\n", limonCount);
//					System.out.printf("i ->  %d\n", i);
//					
//				}
//				//System.out.printf("i ->  %d\n", i);
			
			
			}
			System.out.println("Конец программы!");	
    }

}
