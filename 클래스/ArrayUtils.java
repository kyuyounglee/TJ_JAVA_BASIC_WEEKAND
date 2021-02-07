package com.java.object;
/**
 * 
 * 정수형 배열의 최대값 찾는 메소드
 * 정수형 배열의 최소값 찾는 메소드
 * 정수형 배열중에 특정값이 있는지 찾는메소드
 *
 */
public class ArrayUtils {
	
	public int findMax(int[] ary,int length) {		
		int max = ary[0];
		for (int i = 0; i < length; i++) {
			if(max < ary[i]) {
				max = ary[i];
			}
		}		
		return max;
	}
	public int findMin(int[] ary,int length) {		
		int min = ary[0];
		for (int i = 0; i < length; i++) {
			if(min > ary[i]) {
				min = ary[i];
			}
		}		
		return min;
	}
	public int findMaxindex(int[] ary,int length) {		
		int max = ary[0];
		int maxIndex = 0;
		for (int i = 0; i < length; i++) {
			if(max < ary[i]) {
				max = ary[i];
				maxIndex = i;
			}
		}		
		return maxIndex;
	}
	
}
