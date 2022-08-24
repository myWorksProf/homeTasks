package DZ_Modul__04_2_Vlozennye_cikly;

import java.util.Scanner;

//	Домашнее задание № 4.2
//		ВЛОЖЕННЫЕ ЦИКЛЫ
//			Задание 10
//				Напишите программу, которая будет считывать с консоли 
//				любое число (от 0 до 99999999) и выводить его цифры в 
//				виде «звёздочек». 

public class Task_10 {

	public static void main(String[] args) {

		System.out.print("Введите любое положительное число:  ");
		Scanner sc = new Scanner(System.in);
		String strDigit = sc.nextLine();
		sc.close();
			for (int i = 1; i < 8; i++) {
				for (int j = 0; j < strDigit.length(); j++) {
					//char strJ = strDigit.charAt(j);
					//System.out.println(strJ);
				switch (i) {
					case 1 :
						switch (strDigit.charAt(j)) {
							case '0':
								System.out.print("  ***    ");
								break;
							case '1':
								System.out.print(" *   ");
								break;
							case '2' :
								System.out.print(" ***   ");
								break;
							case '3' :
								System.out.print(" ***   ");
								break;
							case '4' :
								System.out.print("   *    ");
								break;
							case '5' :
								System.out.print("*****  ");
								break;
							case '6' :
								System.out.print(" ***   ");
								break;
							case '7' :
								System.out.print("*****  ");
								break;
							case '8' :
								System.out.print(" ***   ");
								break;
							case '9' :
								System.out.print(" ***   ");
								break;
						}
						break;
					case 2 :
						switch (strDigit.charAt(j)) {
							case '0' :
								System.out.print(" *   *   ");
								break;
							case '1' :
								System.out.print("**   ");
								break;
							case '2' :
								System.out.print("*   *  ");
								break;
							case '3' :
								System.out.print("*   *  ");
								break;
							case '4' :
								System.out.print("  **    ");
								break;
							case '5' :
								System.out.print("*      ");
								break;
							case '6' :
								System.out.print("*      ");
								break;
							case '7' :
								System.out.print("    *  ");
								break;
							case '8' :
								System.out.print("*   *  ");
								break;
							case '9' :
								System.out.print("*   *  ");
								break;
						}
						break;
					case 3 :
						switch (strDigit.charAt(j)) {
							case '0' :
								System.out.print("*     *  ");
								break;
							case '1' :
								System.out.print(" *   ");
								break;
							case '2' :
								System.out.print("   *   ");
								break;
							case '3' :
								System.out.print("    *  ");
								break;
							case '4' :
								System.out.print(" * *    ");
								break;
							case '5' :
								System.out.print("*      ");
								break;
							case '6' :
								System.out.print("*      ");
								break;
							case '7' :
								System.out.print("   *   ");
								break;
							case '8' :
								System.out.print("*   *  ");
								break;
							case '9' :
								System.out.print("*   *  ");
								break;
						}
						break;
					case 4 :
						switch (strDigit.charAt(j)) {
							case '0' :
								System.out.print("*     *  ");
								break;
							case '1' :
								System.out.print(" *   ");
								break;
							case '2' :
								System.out.print("  *    ");
								break;
							case '3' :
								System.out.print(" ***   ");
								break;
							case '4' :
								System.out.print("*  *    ");
								break;
							case '5' :
								System.out.print(" ***   ");
								break;
							case '6' :
								System.out.print("****   ");
								break;
							case '7' :
								System.out.print("  *    ");
								break;
							case '8' :
								System.out.print(" ***   ");
								break;
							case '9' :
								System.out.print(" ****  ");
								break;
						}
						break;
					case 5 :
						switch (strDigit.charAt(j)) {
							case '0' :
								System.out.print("*     *  ");
								break;
							case '1' :
								System.out.print(" *   ");
								break;
							case '2' :
								System.out.print(" *     ");
								break;
							case '3' :
								System.out.print("    *  ");
								break;
							case '4' :
								System.out.print("******  ");
								break;
							case '5' :
								System.out.print("    *  ");
								break;
							case '6' :
								System.out.print("*   *  ");
								break;
							case '7' :
								System.out.print(" *     ");
								break;
							case '8' :
								System.out.print("*   *  ");
								break;
							case '9' :
								System.out.print("    *  ");
								break;
						}
		
						break;
					case 6 :
						switch (strDigit.charAt(j)) {
							case '0' :
								System.out.print(" *   *   ");
								break;
							case '1' :
								System.out.print(" *   ");
								break;
							case '2' :
								System.out.print("*      ");
								break;
							case '3' :
								System.out.print("*   *  ");
								break;
							case '4' :
								System.out.print("   *    ");
								break;
							case '5' :
								System.out.print("*   *  ");
								break;
							case '6' :
								System.out.print("*   *  ");
								break;
							case '7' :
								System.out.print("*      ");
								break;
							case '8' :
								System.out.print("*   *  ");
								break;
							case '9' :
								System.out.print("    *  ");
								break;
						}
						break;
					case 7 :
						switch (strDigit.charAt(j)) {
							case '0' :
								System.out.print("  ***    ");
								break;
							case '1':
								System.out.print("***  ");
								break;
							case '2' :
								System.out.print("*****  ");
								break;
							case '3' :
								System.out.print(" ***   ");
								break;
							case '4' :
								System.out.print("   *    ");
								break;
							case '5' :
								System.out.print(" ***   ");
								break;
							case '6' :
								System.out.print(" ***   ");
								break;
							case '7' :
								System.out.print("*      ");
								break;
							case '8' :
								System.out.print(" ***   ");
								break;
							case '9' :
								System.out.print(" ***   ");
								break;
						}
						break;
				}	//  end switch
				 
			} // end for прорисовка одной цифры
			System.out.println();	
		}	// end for проход по всем цифрам
	}

}
