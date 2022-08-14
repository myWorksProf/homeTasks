package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 7
//				Разработать программу, которая позволит при известном 
//				годовом проценте вычислить сумму вклада в банке через 
//				два года, если задана исходная величина вклада. 

public class Task_07 {

	public static void main(String[] args) {
		double deposit= 1000; 
		final double interest = 5;
		double depositInterest = deposit+ (deposit * interest)/100; depositInterest =
		depositInterest+ (depositInterest * interest)/100;
		System.out.printf("сумму вклада - %.2f\n", deposit);
		System.out.printf("проценты за год - %.2f \n", interest);
		System.out.printf("сумму вклада за два года с учетом процентов - %.2f", depositInterest);
		
	}

}

/*

 */