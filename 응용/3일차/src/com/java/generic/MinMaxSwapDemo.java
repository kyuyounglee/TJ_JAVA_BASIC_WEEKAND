package com.java.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MinMaxSwapDemo {

	public static void main(String[] args) {
		MinMaxSwap<Double> mms = new MinMaxSwap<>();
		List<Double> list = new ArrayList<>();
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			list.add(rd.nextInt(100)*1.0);
		}		
		// 데이터리스트 확인
		System.out.println(list);
		
		// 최대값
		double max = mms.max(list);
		// 최소값
		double min = mms.min(list);
		System.out.println("max = "+max);
		System.out.println("min = " +min);
	}

}
