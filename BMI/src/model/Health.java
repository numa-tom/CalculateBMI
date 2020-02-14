package model;

import java.io.Serializable;

public class Health implements Serializable{

	private double height, weight, bmi;
	private String body;


	public Health() {	}
	public Health(double height, double weight, double bmi, String body) {
		this.height=height;
		this.weight=weight;
		this.bmi   =bmi;
		this.body  =body;

	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}

	public double getBMI() {
		return bmi;
	}
	public void setBMI(double bmi) {
		this.bmi=bmi;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body=body;
	}



}
