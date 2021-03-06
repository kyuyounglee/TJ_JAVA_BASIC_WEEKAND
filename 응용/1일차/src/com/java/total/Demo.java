package com.java.total;

public class Demo {

	static int  totalPrice(Price[] prices) {
		int total = 0;
		for (Price p : prices) {
			total += p.getPrice();
		}
		return total;
	}
	
	static Price[] makePrice() {
		Price[] prices
		= {
				new AdultPrice()
				,new ChildPrice()
				,new TeenPrice()
				,new ChildPrice()
				,new TeenPrice()
				,new ChildPrice()
				,new ChildPrice()
				,new TeenPrice()
				,new TeenPrice()
				,new AdultPrice()
				,new AdultPrice()
		};
		return prices;
	}
	
	public static void main(String[] args) {
		Price[] ary = makePrice();
		int total =  totalPrice(ary);
		System.out.println("total = " + total);

	}

}
