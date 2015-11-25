package com.indus.training.test;

import com.indus.training.cc.classes.MonthEnum;

public class TestMonthEnum {

	public static void main(String[] args) {
		//System.out.println(MonthEnum.january.getmName()+MonthEnum.january.getmDays());
		//System.out.println(MonthEnum.january);
		
		MonthEnum[] x=MonthEnum.values();
		for(MonthEnum i:x)
			System.out.println(i.getmName()+" -->" +i.getmDays()+"  OriginalValue----->"+i.ordinal());
	}

}
