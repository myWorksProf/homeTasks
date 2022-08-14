package DZ_Modul__02_Operatory_i_peremennye;

//	Домашнее задание № 2
//		ОПЕРАТОРЫ И ПЕРЕМЕННЫЕ 
//			Задание 12
//				Ученикам первого класса дают 1 пирожок. Если вес пер-
//				воклассника менее 30 кг, дополнительно дают 1 стакан мо-
//				лока и ещё 1 пирожок. В первых классах школы учится n
//				учеников. Стакан молока имеет емкость 200 мл, а упаковка молока – 0,9 л. 
//				Написать программу, которая определит количество пакетов молока
//				и пирожков, необходимых каждый день для условий:
//				 если в школе 100% всех учеников, у которых вес меньше 30 кг;
//				 если в школе 60% учеников имеют вес меньше 30 кг.
//				 если в школе 1% учеников имеют вес меньше 30 кг.
//					(!!!) Учесть, что нельзя купить два с половиной пакета молока; 
//					можно купить два или три.

import java.util.Scanner;

public class Task_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Задайте количество учиников в классе ");
		int uchenikov = sc.nextInt(); 
		double  stakan = 0.2;
		int pirogok = 1;
		int uchenikov60 = uchenikov * 60 / 100;
		int uchenikov1 = (int) Math.ceil(uchenikov /100);
		int allPirogok = uchenikov * pirogok * 2;
		int allmoloka = (int)Math.ceil(stakan * uchenikov /0.9);
		int allPirogok60 = (uchenikov60 * pirogok * 2) + (pirogok * (uchenikov - uchenikov60));
		int allmoloka60 = (int)Math.ceil(stakan * uchenikov60 /0.9);
		int allPirogok1 = (uchenikov1 * pirogok * 2) + (pirogok * (uchenikov - uchenikov1));
		int allmoloka1 = (int) Math.ceil(stakan * uchenikov1 /0.9);
		
		sc.close();
		System.out.printf("Всего учиников в школе %d\n%d учеников в школе весом меньше 30кг\n нужно %d пирожков\n нужно %d пактов молока\n\n", 
				uchenikov, uchenikov, allPirogok, allmoloka);
		System.out.println("если в школе 60% учеников имеют вес меньше 30 кг.");
		System.out.printf("%d учеников в школе весом меньше 30кг\n нужно %d пирожков\n нужно %d пактов молока\n\n", 
				uchenikov60, allPirogok60, allmoloka60);
		System.out.println("если в школе 1% учеников имеют вес меньше 30 кг.");
		System.out.printf("%d учеников в школе весом меньше 30кг\n нужно %d пирожков\n нужно %d пактов молока", 
				uchenikov1, allPirogok1, allmoloka1);
		
	}

}
