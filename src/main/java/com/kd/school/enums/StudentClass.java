package com.kd.school.enums;

public enum StudentClass {
	NURSERY(1), LKG(2), UKG(3),FIRSTSTD(4),SECONDSTD(5), THIRDSTD(6),FOURTHSTD(7);

	private int value;

	public int getValue() {
		return value;
	}
	
	private StudentClass(int value) {
		this.value = value;
	}

}
