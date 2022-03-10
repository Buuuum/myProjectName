package com.human.dto;

public class Tire {

	String tireCompany;
	int price;
	int disDriven;

//	public Tire() {
//	}

//	public Tire(String tireCompany, int price, int dis_driven) {
//		this.tireCompany = tireCompany;
//		this.price = price;
//		this.disDriven = dis_driven;
//	}


	void tireInfo() {
		System.out
				.println("타이어 제조회사 = " + tireCompany + "\n타이어 가격 = " + price + " 원" + "\n주행 거리 = " + disDriven + " km");
	}
}
