package com.java.array;

import java.util.Random;

public class App05 {

	public static void main(String[] args) {
		// ���� �Լ��� �̿�
//		Random rd = new Random();
//		int randnumber= rd.nextInt(46)+1; // (0 ~ 45) + 1 = 1 ~ 46
		// rotto 6
		int[] rotto = new int[6];
		// 1. ������ �迭��ҿ� ������ ���� �Է��Ѵ�
		// 2. 2��° �Էº��ʹ� ���� �Էµ� ���� �ߺ��� �߻��ϸ�
		// �ٽ� �����ϰ� �����Ѵ�
		int index = 0;
		boolean isDuplecate = false; // �ߺ��Ǵ� ����
		while (true) {
			Random rd = new Random();
			int randnumber= rd.nextInt(46)+1; // (0 ~ 45) + 1 = 1 ~ 46
			// ���� ������ ���� �������� ���Ѵ�.
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
