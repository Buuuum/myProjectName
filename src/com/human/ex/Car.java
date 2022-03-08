package com.human.ex;

public class Car {

	String model;
	String color;
	String company;
	int maxSpeed;
	
	String wh_company;
	int wh_price;
	int dis_driven;


	

	public Car(String model, String color, String company, int maxSpeed, String wh_company, int wh_price,
			int dis_driven) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
		this.maxSpeed = maxSpeed;
		this.wh_company = wh_company;
		this.wh_price = wh_price;
		this.dis_driven = dis_driven;
	}
	
	
	void run(){
		System.out.println("달립니다.");
	}
	
	void stop() {
		System.out.println("멈춥니다");
	}




	public String carInfo() {
		return "Model = " + model + "\nColor = " + color + "\nCompany = " + company + "\nMaxSpeed = " + maxSpeed;
	}

	public String WheelInfo() {
		return "Wheel Company= " + company + "\nPrice = " + wh_price + "\nDistance Driven = " + dis_driven;
	}


}
