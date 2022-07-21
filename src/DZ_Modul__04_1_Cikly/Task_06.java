package DZ_Modul__04_1_Cikly;

public class Task_06 {

	public static void main(String[] args) {
		
//		Домашнее задание No 4.1
//		Задание 6
//		Вывести на консоль все восьмизначные числа, цифры в которых не повторяются. 
//		Эти числа должны делиться на 12345, без остатка. 
//		Показать общее количество найденных чисел. 

		for (int i = 10_000_000; i < 100_000_000; i++) {
			if (i % 12345 == 0) {
				int number = i;
		        	int num1 = number % 10;
		        	number = number / 10;
		        	int num2 = number % 10;
		        	number = number / 10;
		        	if (num2 != num1) {
		        		int num3 = number % 10;
		        		number = number / 10;
			        	if (num3 != num2 && num3 != num1) {
				        	int num4 = number % 10;
				        	number = number / 10;
				        	if (num4 != num3 && num4 != num2 && num4 != num1) {
					        	int num5 = number % 10;
					        	number = number / 10;
					        	if (num5 != num4 && num5 != num3 && num5 != num2 && num5 != num1) {
						        	int num6 = number % 10;
						        	number = number / 10;
						        	if (num6 != num5 && num6 != num4 && num6 != num3 && num6 != num2 && num6 != num1) {
							        	int num7 = number % 10;
							        	number = number / 10;
							        	if (num7 != num6 && num7 != num5 && num7 != num4 && num7 != num3 && num7 != num2 && num7 != num1) {
								        	int num8 = number % 10;
								        	number = number / 10;
								        	if (num8 != num7 && num8 != num6 && num8 != num5 && num8 != num4 && num8 != num3 && num8 != num2 && num8 != num1) {
								        		int res = i / 12345;
												System.err.println("  --> " + res);
								        		System.out.println("--> " + i);	
								        		
								        	}
						        		}
					        		}
				        		}
			        		}
		        		}
		        	}
			}
		}		
		System.out.println("Конец программы!");
	}

}
