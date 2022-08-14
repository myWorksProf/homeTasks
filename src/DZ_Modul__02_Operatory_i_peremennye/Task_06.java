package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 6
//				Есть прямоугольник, у которого известна ширина w и 
//				высота h. Найти и вывести на консоль периметр и площадь 
//				заданного прямоугольника. Высота и ширина прямоугольника 
//				должна задаваться константными переменными в коде программы.

public class Task_06 {

	public static void main(String[] args) {
		final int height = 15;
		final int width = 20;
		System.out.printf("ширина прямоугольника - %d\nвысота прямоугольника - %d\n", height, width);
		System.out.printf("периметр прямоугольника - 2 * %d + 2 * %d  = %d \n", height, width, (2 * height) + (2 * width));
		System.out.printf("площадь прямоугольника - %d * %d = %d ", height, width, (height * width));
	}

}
