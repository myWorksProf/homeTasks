package DZ_Modul__04_1_Cikly;

public class Task_09 {
	
//		Домашнее задание No 4.1
//			Задание 9
//				Если перечислить все натуральные числа меньше 10, 
//				кратные 3 или 5, мы получаем 3, 5, 6 и 9. Сумма этих кратных – 23.
//				Найдите сумму всех чисел, кратных 3 или 5, начиная с 0 и до 1 000.

	public static void main(String[] args) {
		
		int summaDigit = 0; 
		for (int i = 0; i < 1_000; i++) {
			
			if(i % 3 ==0 || i % 5 == 0) {
				// System.out.println(i);
				summaDigit += i; 
			}
		}
		System.out.println("сумма = " + summaDigit);

	}

}
