package com.javalec.base;

public class Calc {
	public int num1, num2;
	public int result;
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Calc(String num1, String num2) {
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
	}


	// method
	public String actionAdd() {
		result = num1 + num2;
		return Integer.toString(result);
	}
	public String actionSub() {
		result = num1 - num2;
		return Integer.toString(result);

	}
	public String actionMul() {
		result = num1 * num2;
		return Integer.toString(result);

	}
	public String actionDiv() {
		double dResult = (num1*1.0) / num2;
		String result = String.format("%.4f", dResult);
		return result;
	}
	
}
