package com.entity;

public class Student {
	private String name;
	private int roll;
	private String div;
	private String cource;
	private double fees;
	public Student() {
		super();
	}
	public Student(String name, int roll, String div, String cource, double fees) {
		super();
		this.name = name;
		this.roll = roll;
		this.div = div;
		this.cource = cource;
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", div=" + div + ", cource=" + cource + ", fees=" + fees
				+ "]";
	}

}
