package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ
//			Задание 1  
//				В переменных х и y хранятся два натуральных числа. 
//				Создайте программу, выводящую на консоль: 
// 					результат целочисленного деления x на y; 
//					остаток от деления x на y;
//					квадратный корень x.

public class Task_01 {

	public static void main(String[] args) {
		int x = 37;
		int y = 5;
		int delem = x / y;
		int ostatok = x % y;
		System.out.printf("%d / %d = %d\n", x, y, delem );	
		System.out.println(x + " % "+ y + " = "+ ostatok);
		System.out.println("√" + x + " = " + Math.sqrt(x));
	}

}
