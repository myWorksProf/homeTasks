package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ  
//			Задание 11
//				У Деда Мороза есть часы, которые в секундах показыва-
//				ют, сколько осталось до каждого Нового года. Так как Дед 
//				Мороз – человек уже в возрасте, то некоторые математиче-
//				ские операции он быстро выполнять не в состоянии. 
//				Помогите Деду Морозу определить, сколько полных дней, 
//				часов, минут и секунд осталось до следующего Нового года, 
//				если известно сколько осталось секунд. Т. е. разложите вре-
//				мя в секундах на полное количество дней, часов, минут и се-
//				кунд. Выведите результат на консоль.
//				Пример, как должен выглядеть вывод результата:
//				10 дней, 14 часов, 5 минут и 33 секунды

public class Task_11 {
	
	public static void main(String[] args) {
		int  timeSeconds = 3136000;
		int deney, yearMinutes, yearHours, yearSeconds;
		final int day = 60 * 60 * 24;
		final int hour  = 60 * 60;
		final int minuta = 60;
		deney = timeSeconds / day;
		yearHours = (timeSeconds - (deney * day)) / hour;
		yearMinutes = (timeSeconds - ((deney * day) + (yearHours * hour))) / minuta ;
		yearSeconds= timeSeconds % 60 ;
		System.out.printf( "Дано %d секунд. \n До нового года осталось:\n"
				+ "    %d дней\n    %d часов\n    %d минут\n    %d секунд\n",
				timeSeconds, deney, yearHours, yearMinutes,  yearSeconds);

	}
}
