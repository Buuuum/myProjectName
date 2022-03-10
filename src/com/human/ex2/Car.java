package com.human.ex2;

public class Car {

	String model;
	String color;
	String company;
	int maxSpeed;
	
	Tire tire = new Tire();

	
	public Car(String model, String color, String company, int maxSpeed, String tireCompany, 
	int price, int disDriven){
		this.model = model;
		this.color = color;
		this.company = company;
		this.maxSpeed = maxSpeed;
		this.tire.tireCompany = tireCompany;
		this.tire.price = price;
		this.tire.disDriven = disDriven;
	}
	
	

}
