package com.java.object;
/**
 * 
 * ������ �迭�� �ִ밪 ã�� �޼ҵ�
 * ������ �迭�� �ּҰ� ã�� �޼ҵ�
 * ������ �迭�߿� Ư������ �ִ��� ã�¸޼ҵ�
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
