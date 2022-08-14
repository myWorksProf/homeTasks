package DZ_Modul__04_1_Cikly;

public class Task_08 {

//	Домашнее задание No 4.1
//		Задание 8
//			Электронные часы показывают время в формате от 00:00 
//			до 23:59. Написать программу, которая выведет на консоль 
//			сколько раз за сутки случается так, что слева от двоеточия 
//			показывается симметричная комбинация для той, что справа
//			от двоеточия (например, 02:20, 11:11 или 15:51). Вывести 
//			на экран все симметричные комбинации. Вывести общее число комбинаций. 

	
	
    //private static int number = 6;
    public static void main(String[] args) {

    	int num1, num2, num3, num4;
    	int count = 0;
    	for (int hor = 0; hor <= 23; hor++) {
    	//	num2 = hor % 10;
    	//	num1 = hor / 10 % 10;
    		for (int min = 0; min < 60; min++) {
    	//		num4 = min % 10;
    	//		num3 = min / 10 % 10;
    	//		if (num1 == num4 && num2 == num3) {
    			if(hor/10%10==min%10&hor%10==min/10%10){
    				count++;
    				System.out.printf ("%02d:%02d\n", hor, min);
    			}
    		}
        }
    	System.out.println("общее число комбинаций = " + count);
    	System.out.println("Конец программы!");
    }
}

