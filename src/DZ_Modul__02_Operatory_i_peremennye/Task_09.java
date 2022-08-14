package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 9
//				проверить, имеет ли число вещественную часть. 
//				Ќапример, числа 3.14 и 2.5 имеют вещественную часть, 
//				а числа 5.0 и 10.0 нет.

public class Task_09 {

	public static void main(String[] args) {
		double realNum1 = 3.14;
		double realNum2 = 2.5;
		double realNum3 = 5.0;
		double realNum4 = 10.0;
		int roundNum1 = (int) realNum1;
		double roundNum2 = Math.floor(realNum2);
		int roundNum3 = (int) realNum3;
		double roundNum4 = Math.round(realNum4);
		boolean isEqual_1 = (realNum1 != roundNum1);
		boolean isEqual_2 = (realNum2 != roundNum2);
		boolean isEqual_3 = (realNum3 != roundNum3);
		boolean isEqual_4 = (realNum4 != roundNum4);
		double materialPart1 = realNum1%1;
		double materialPart2 = realNum2%1;
		double materialPart3 = realNum3%1;
		double materialPart4 = realNum4%1;
		
		System.out.printf("original number 1 - %.2f \n",realNum1);
		System.out.printf("converted int - %d \n",roundNum1);
		System.out.printf("whether the number %.2f has a real part ?  %b \n",realNum1, isEqual_1);
		System.out.printf("число %.2f имеет вещественную часть = %.2f \n", realNum1, materialPart1);
		System.out.printf(" original number 2 - %.2f \n",realNum2);
		System.out.printf(" Math.floor - %.2f \n",roundNum2);
		System.out.printf("whether the number %.2f has a real part ?  %b \n",realNum2, isEqual_2);
		System.out.printf(" число %.2f имеет вещественную часть = %.2f\n", realNum2, materialPart2);
		System.out.printf("original number 3 - %.2f \n",realNum3);
		System.out.printf("converted int - %d \n",roundNum3);
		System.out.printf("whether the number %.2f has a real part ?  %b \n",realNum3, isEqual_3);
		System.out.printf("число %.2f не имеет вещественную часть, т.к. вещественна¤ часть = %.2f\n", realNum3, materialPart3);
		System.out.printf(" original number 4 - %.2f \n",realNum4);
		System.out.printf(" Math.round - %.2f \n",roundNum4);
		System.out.printf("whether the number %.2f has a real part ?  %b \n",realNum4, isEqual_4);
		System.out.printf(" число %.2f не имеет вещественную часть, т.к. вещественна¤ часть  = %.2f\n", realNum4, materialPart4);
	}

}
