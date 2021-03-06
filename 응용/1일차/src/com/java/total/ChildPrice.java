package com.java.total;

public class ChildPrice implements Price{

	@Override
	public int getPrice() {		
		return PRICE - (int)(PRICE*0.8);
	}

}
