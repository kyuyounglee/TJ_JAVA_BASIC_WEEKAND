package com.java.array;

import java.util.Random;

public class App05 {

	public static void main(String[] args) {
		// 랜덤 함수를 이용
//		Random rd = new Random();
//		int randnumber= rd.nextInt(46)+1; // (0 ~ 45) + 1 = 1 ~ 46
		// rotto 6
		int[] rotto = new int[6];
		// 1. 각각의 배열요소에 랜덤한 값을 입력한다
		// 2. 2번째 입력부터는 기존 입력된 값과 중복이 발생하면
		// 다시 랜덤하게 추출한다
		int index = 0;
		boolean isDuplecate = false; // 중복판단 변수
		while (true) {
			Random rd = new Random();
			int randnumber= rd.nextInt(46)+1; // (0 ~ 45) + 1 = 1 ~ 46
			// 새로 추출한 값과 기존값을 비교한다.
			for (int i = 0; i < 6; i++) {
				if(rotto[i] == randnumber) {
					isDuplecate = true;
					break;
				};
			}
			if(isDuplecate)
			{
				continue;
			}
			rotto[index] = randnumber;
			index++;
			if(index > 5) {
				break;
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(rotto[i]);
		}

	}

}
