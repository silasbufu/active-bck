package com.iuri.active_bck.constants;

public enum NumericBoolean {

	FALSE(0),
	TRUE(1);
	
	private final Integer numericBoolean;

	NumericBoolean(Integer numericBoolean) {
		this.numericBoolean = numericBoolean;
	}

	public Integer getNumericBoolean() {
		return this.numericBoolean;
	}
	
}
