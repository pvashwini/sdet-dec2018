package com.training.sdetday1;

public class Customer extends Person {

	private double income;

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Customer [income=" + income + "]"+super.toString();
	}
	
}
