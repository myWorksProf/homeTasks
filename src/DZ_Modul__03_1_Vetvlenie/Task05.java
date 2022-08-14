package DZ_Modul__03_1_Vetvlenie;

//		DZ_3.1
//			ВЕТВЛЕНИЕ
//				Задание 5
//					Организовать ввод с клавиатуры даты рождения человека. 
//					Программа должна вывести знак зодиака и название года по китайскому календарю. 
//					Пример входных данных: 
//						5 12 1974 
//						Вывод:
//						Знак: Стрелец
//						Год: Тигра

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// вывести знак зодиака и название года по китайскому календарю.
 		
		Scanner sc =new Scanner(System.in);
		System.out.print("Пример 10 02 1980\n Введите дату рождения: ");		
			String dayBirth = sc.nextLine();
			String horoscopeSymbol = "";
			String signYear = "";
			String strDayBirth = dayBirth.replaceAll("\\s","");
			if (strDayBirth.length() == 8) {
			int day = Integer.parseInt (strDayBirth.substring(0,2));
			int month = Integer.parseInt (strDayBirth.substring(2,4));
			int year = Integer.parseInt (strDayBirth.substring(4));
			if (month >= 1 && month <= 12)	{
				if (day>=1 && day <=31) {
					switch (month) {
						case 1:
							if (day <= 20) {
								horoscopeSymbol = "Козерог";
							}
							else {
								 horoscopeSymbol = "Водолей"; 
							}							
							break;
						case 2:
							if (day <= 18) {
								horoscopeSymbol = "Водолей";
							}
							else if (day >= 19 && day <= 29) {
								horoscopeSymbol = "Рыбы";
							}
							break;
						case 3:
							if (day <= 20) {
								horoscopeSymbol = "Рыбы";
							}
							else {
								 horoscopeSymbol = "Овен";
							}
							break;
						case 4:
							if (day <= 20) {
								horoscopeSymbol = "Овен";
							}
							else if (day >= 21 && day <= 30){
								 horoscopeSymbol = "Телец";
							}
							break;
						case 5:
							if (day <= 20) {
								horoscopeSymbol = "Телец";
							}
							else {
								 horoscopeSymbol = "Близнецы"; 
							}	
							break;
						case 6:
							if (day <= 21) {
								horoscopeSymbol = "Близнецы";
							}
							else if (day >= 22 && day <= 30){
								 horoscopeSymbol = "Рак";
							}
							break;
						case 7:
							if (day <= 22) {
								horoscopeSymbol = "Рак";
							}
							else {
								 horoscopeSymbol = "Лев"; 
							}	
							break;
						case 8:
							if (day <= 23) {
								horoscopeSymbol = "Лев";
							}
							else {
								 horoscopeSymbol = "Дева"; 
							}	
							break;
						case 9:
							if (day <= 23) {
								horoscopeSymbol = "Дева";
							}
							else if (day >= 24 && day <= 30){
								 horoscopeSymbol = "Весы";
							}
							break;
						case 10:
							if (day <= 23) {
								horoscopeSymbol = "Весы";
							}
							else {
								 horoscopeSymbol = "Скорпион"; 
							}			
							break;
						case 11:
							if (day <= 22) {
								horoscopeSymbol = "Скорпион";
							}
							else if (day >= 23 && day <= 30){
								 horoscopeSymbol = "Стрелец";
							}
							break;
						case 12:
							if (day <= 21) {
								horoscopeSymbol = "Стрелец";
							}
							else {
								 horoscopeSymbol = "Козерог"; 
							}
							break;
					}
					System.out.println("\nЗнак: " + horoscopeSymbol);
				} 
				else {
					System.err.printf("Это число %d за пределами нашего календаря  ;)!!!", day );
				}
			}
			else {
				System.err.printf("Такой месяц %d за пределами нашего календаря  ;)!!!", month);	
			}
					int  symbolYear = year % 12;
					switch (symbolYear) {
						case 0:
							signYear = "Обезьяны";
							break;
						case 1:
							signYear = "Петуха";
							break;
						case 2:
							signYear = "Собаки";
							break;
						case 3:
							signYear = "Свиньи";
							break;
						case 4:
							signYear = "Крысы";
							break;
						case 5:
							signYear = "Быка";
							break;
						case 6:
							signYear = "Тигра";
							break;
						case 7:
							signYear = "Кролика";
							break;
						case 8:
							signYear = "Дракона";
							break;
						case 9:
							signYear = "Змеи";
							break;
						case 10:
							signYear = "Лошади";
						case 11:
							signYear = "Козы";
							break;
					}
					System.out.println("Год: " + signYear);
		} else {System.err.println("\nerror: не корректная дата рождения :F!!!\n");}
	sc.close();	
	System.out.print("\nПрограмма завершена!");

	}

}
