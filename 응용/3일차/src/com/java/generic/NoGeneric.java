package com.java.generic;

import java.util.Arrays;

public class NoGeneric {
	protected Object[] v;

	public Object[] getV() {
		return v;
	}

	public void setV(Object[] v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "NoGeneric [v=" + Arrays.toString(v) + "]";
	}
	
	
}
