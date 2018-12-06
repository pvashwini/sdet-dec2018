package com.training.sdetday3.IO;

import java.io.Serializable;

public class Laptop implements Serializable{
	
	private int modelNumber;
	private String modelName;
	private String make;
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Laptop(int modelNumber, String modelName, String make) {
		super();
		this.modelNumber = modelNumber;
		this.modelName = modelName;
		this.make = make;
	}
	@Override
	public String toString() {
		return "Laptop [modelNumber=" + modelNumber + ", modelName=" + modelName + ", make=" + make + "]";
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	

}
