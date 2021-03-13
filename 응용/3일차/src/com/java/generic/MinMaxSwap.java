package com.java.generic;

import java.util.List;

public class MinMaxSwap<T> {
	@SuppressWarnings("unchecked")
	T max(List<T> list) {		
		if(list.get(0) instanceof Double)
		{	
			Double max = Double.valueOf(list.get(0).toString());
			for (T t : list) {
				if(max < Double.valueOf(t.toString())) {
					max = Double.valueOf(t.toString());
				}
			}	
			return (T) max;
		}
		else if(list.get(0) instanceof Integer)
		{	
			Integer max = Integer.valueOf(list.get(0).toString());
			for (T t : list) {
				if(max < Integer.valueOf(t.toString())) {
					max = Integer.valueOf(t.toString());
				}
			}		
			return (T) max;
		}
		return null;	
	}
	
	@SuppressWarnings("unchecked")
	T min(List<T> list) {		
		if(list.get(0) instanceof Double) {
			Double min = Double.valueOf(list.get(0).toString());
			for (T data : list) {				
				if(min > Double.valueOf(data.toString())) 
					min = Double.valueOf(data.toString());
			}
			return (T)min;
		}else if(list.get(0) instanceof Integer) {
			Integer min = Integer.valueOf(list.get(0).toString());
			for (T data : list) {				
				if(min > Integer.valueOf(data.toString())) 
					min = Integer.valueOf(data.toString());
			}
			return (T)min;
		}
		return null;
	}
	
	@SuppressWarnings("unused")
	private void swap(T x, T y) {
		T temp = x;
		x = y;
		y = temp;
	}
	
}
