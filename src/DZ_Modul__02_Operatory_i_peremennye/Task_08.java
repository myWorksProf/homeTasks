package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 8
//				«на скорость распространени¤ звука в воздушной среде, 
//				можно вычислить рассто¤ние до места удара молнии по 
//				времени между вспышкой и раскатом грома. «на¤ врем¤ в 
//				секундах между вспышкой и раскатом грома (константа в 
//				программе), вычислите рассто¤ни¤ до места удара молнии и 
//				выведите его на экран

public class Task_08 {

	public static void main(String[] args) {
		final double speedSound = 331.46;
		final double timeFlash = 95.3;
		double DistancePlace = speedSound * timeFlash;
		System.out.printf(" скорость звука - %.2f м/с.\n ¬рем¤ до вспышки - %.2f сек.\n –ассто¤ние до молнии - %.2f м.", speedSound, timeFlash, DistancePlace);
	}

}
