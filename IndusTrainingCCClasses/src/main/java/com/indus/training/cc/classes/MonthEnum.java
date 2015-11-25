package com.indus.training.cc.classes;

public enum MonthEnum {
	january(31, "January"), february(28, "February"), march(31, "March"), april(
			30, "April"), may(31, "May"), june(30, "June"), july(31, "July"), august(
			31, "August"), september(30, "September"), october(31, "October"), november(
			30, "November"), december(31, "December");

	private int days;
	private String mName;

	private MonthEnum(int days, String name) {
		this.days = days;
		this.mName = name;
	}

	public String getmName() {
		return mName;
	}

	public int getmDays() {
		return this.days;
	}

	
}
