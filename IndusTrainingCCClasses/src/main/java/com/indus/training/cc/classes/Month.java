package com.indus.training.cc.classes;

public final class Month {
	private int days;
	private String mName;
	public static final Month january = new Month(31, "January");
	public static final Month february = new Month(28, "February");
	public static final Month march = new Month(31, "March");
	public static final Month april = new Month(30, "April");
	public static final Month may = new Month(31, "May");
	public static final Month june = new Month(30, "June");
	public static final Month july = new Month(31, "July");
	public static final Month august = new Month(31, "August");
	public static final Month september = new Month(30, "September");
	public static final Month october = new Month(31, "October");
	public static final Month november = new Month(30, "November");
	public static final Month december = new Month(31, "December");

	private Month(int days, String name) {
		this.days = days;
		this.mName = name;
	}

	public String getmName() {
		return mName;
	}

	public int getmDays() {
		return this.days;
	}

	@Override
	public String toString() {
		return "Month [days=" + days + ", mName=" + mName + "]";
	}

}
