package com.ch04;
/**
 *  대입연산자
 *  산술연산자
 *  단항연산자
 * @author 이규영
 *
 */
public class App01 {

	public static void main(String[] args) {
		 int number1 = 10;
		 number1 = 20;
		 //number1 = number1 + 30;  // 20+30
		 number1 += 30;
		 
		 // 산술연산자
//		  int number2 = 5;
//		  int number3 = 2;
		 int number2 = 5, number3 = 2;
		 
		 double result =  1.0 * number2 / number3;
		 // 2.5가 나오도록 출력
		 System.out.println(result);
		 
		 // 단항연산자
		 
		 int number4 = number3;
		 System.out.println(number4);
		 number4++;
		 System.out.println(number4);
		 
		 // number4  가 현재 3입니다.
		 int number5 =  ++number4;
		 System.out.println("1 : " + number4);
		 System.out.println("2 : " + number4++);
		 System.out.println("3 : " + ++number4);
		 
		 
	}

}
