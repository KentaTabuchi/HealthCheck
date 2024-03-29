package model;

import java.io.Serializable;

/**
 * @author tabuchikenta
 * 身長、体重、BMI,体型　を表すJavaBean
 */
public class Health implements Serializable {

	private double height;
	private double weight;
	private double bmi;
	private String bodyType;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

}
