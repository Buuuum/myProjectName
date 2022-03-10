package com.human.dto;

public class Car extends Tire {

	String model;
	String color;
	String company;
	int maxSpeed;

	public Car(String model, String color, String company, int maxSpeed, String tireCompany, int price,
			int dis_driven) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
		this.maxSpeed = maxSpeed;
		this.tireCompany = tireCompany;
		this.price = price;
		this.disDriven = dis_driven;
	}

	void run() {
		System.out.println("주행을 시작합니다.");
	}

	void stop() {
		System.out.println("주행을 멈춥니다");
	}

//	public String carInfo() {
//		return "Model = " + model + "\nColor = " + color + "\nCompany = " + company + "\nMaxSpeed = " + maxSpeed;
//	}

	void carInfo() {
		System.out.println(
				"모델 = " + model + "\n색상 = " + color + "\n제조회사 = " + company + "\n최대 속도 = " + maxSpeed + " Km/h");
	}

}
