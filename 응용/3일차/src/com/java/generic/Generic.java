package com.java.generic;

import java.util.Arrays;

public class Generic<T> {
	protected T[] v;

	public T[] getV() {
		return v;
	}

	public void setV(T[] v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Generic [v=" + Arrays.toString(v) + "]";
	}
	

}
