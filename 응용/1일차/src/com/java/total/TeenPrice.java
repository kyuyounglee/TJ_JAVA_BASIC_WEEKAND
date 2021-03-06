package com.java.total;

public class TeenPrice implements Price{

	@Override
	public int getPrice() {		
		return PRICE - (int)(PRICE*0.3);
	}

}
