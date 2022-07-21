package DZ_Modul__04_1_Cikly;

public class Task_01 {

	public static void main(String[] args) {
//		Домашнее задание No 4.1
//		Задание 1
//		Показать на экране все числа Фибоначчи
//		в диапазоне от 	0 до 10 000 000. 

		
	    
	    int num1 = 1;
	    int num2 = 1;
		int res = num1 + num2;
	    //Первые две переменные выводим вне цикла:
	    System.out.printf("1 -> 0\n2 -> %d\n3 -> %d\n", num1, num2);
//	    for( int i= 1; i <= 100; i++){
//	      res = num1 + num2;
//	      if (res <= 100_000_000) {
//	    	  
//	      System.out.println("res = " + res);
//	      System.out.println( "i = "+ i);
//	      
//	      }
//	      else {
//	    	  break;
//	      }
//	    
//	    }
	    		int i =3;
	    do {
	    		res = num1 + num2;
	    		i++;
		    	num1 = res;
		    	System.out.printf("%d -> %d\n", i, res);
		    	num1 = num2;
		      	num2 = res;
		    }
	    while  (res <=10_000_000); 
		System.out.println("Конец программы!");
	}

}
