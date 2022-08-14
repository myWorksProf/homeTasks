package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 5
//				Подсчитать площадь и длину окружности для круга с радиусом R. 
//				Радиус должен быть задан константой в программе. 
//				Вывести результат на консоль. 

public class Task_05 {

	public static void main(String[] args) {
		final double R = 5.5;
		double circumArea = Math.PI * Math.pow(R,2);
		double circuymLength = 2 * Math.PI * R;	
		System.out.println("радиус окружности = " + R);
		System.out.printf("площадь окружности = %.2f \n", circumArea);
		System.out.printf("длина окружности =  %.2f", circuymLength);	
	}

}
