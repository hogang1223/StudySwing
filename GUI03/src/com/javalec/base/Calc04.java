package com.javalec.base;

public class Calc04 {
	
	String stnum1, stnum2;
	int num1, num2;
	int result;
	String stResult;

	public Calc04() {
		// TODO Auto-generated constructor stub
	}
	
	public Calc04(String stnum1, String stnum2) {
		this.stnum1 = stnum1;
		this.stnum2 = stnum2;
	}

	public String add() {
		num1 = Integer.parseInt(stnum1);
		num2 = Integer.parseInt(stnum2);
		result = num1 + num2;
		stResult = num1 + "+" + num2 + "=" + result ;
		return stResult;
	}
	public String sub() {
		num1 = Integer.parseInt(stnum1);
		num2 = Integer.parseInt(stnum2);
		result = num1 - num2;
		stResult = num1 + "-" + num2 + "=" + result ;
		return stResult;
	}
	public String mul() {
		num1 = Integer.parseInt(stnum1);
		num2 = Integer.parseInt(stnum2);
		result = num1 * num2;
		stResult = num1 + "x" + num2 + "=" + result ;
		return stResult;
	}
	public String div() {
		num1 = Integer.parseInt(stnum1);
		num2 = Integer.parseInt(stnum2);
		double dResult = (num1*1.0) / num2;
		stResult = num1 + "/" + num2 + "=" + dResult ;
		return stResult;
	}
	
	
}
