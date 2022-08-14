package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 4
//				Написать программу, которая выведет на консоль «Hello world»,
//				не используя в исходном коде пробельных символов. 
public class Task_04 {

	public static void main(String[] args) {
		String str =  "Helloworld";
		String strModified = str.replaceAll("(.{5})", "$1 ");
		System.out.println("исходная строка " + str);
        System.out.println("измененная строка " + strModified);
	}

}
