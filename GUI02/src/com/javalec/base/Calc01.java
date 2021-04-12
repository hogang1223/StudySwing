package com.javalec.base;

public class Calc01 {
	
	String num1, num2;
	String stResult;

	public Calc01() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Calc01(String num1, String num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;

	}


	public String add() {
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		stResult = Integer.toString(result);
		return stResult;
	}
	public String sub() {
		int result = Integer.parseInt(num1) - Integer.parseInt(num2);
		stResult = Integer.toString(result);
		return stResult;
	}
	public String mul() {
		int result = Integer.parseInt(num1) * Integer.parseInt(num2);
		stResult = Integer.toString(result);
		return stResult;
	}
	public String div() {
		double result = Double.parseDouble(num1) / Double.parseDouble(num2);
		stResult = String.format("%.4f", result);
		return stResult;
	}
}
