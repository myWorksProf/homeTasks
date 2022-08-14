package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 10
//				Написать программу расчета идеального веса к росту. В 
//				константах хранятся рост (height) и вес (weight). Вывести на 
//				консоль сообщение, сколько килограмм нужно набрать или 
//				сбросить (идеальный вес = рост - 110).

public class Task_10 {

	public static void main(String[] args) {
		final double height = 175;
		final double wiedch = 75.7;
		double IdealWeight = height - 110;
		double difference = wiedch - IdealWeight;
		System.out.printf("рост %.2f см \n", height);
		System.out.printf("вес %.2f кг \n", wiedch);
		System.out.printf("для идеального веса нужно скинуть %.2f кг \n", difference);
	}

}
