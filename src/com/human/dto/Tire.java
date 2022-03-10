package com.human.dto;

public class Tire {
	
	String tireCompany;
	int price;
	int disDriven;
	
	
	public Tire() {
	}
	
	public Tire(String tireCompany, int price,
			int dis_driven) {
		this.tireCompany = tireCompany;
		this.price = price;
		this.disDriven = dis_driven;
	}
	
	


//	public String tireInfo() {
//		return "Tire Company= " + tireCompany + "\nPrice = " + price + "\nDistance Driven = " + disDriven;
//	}
	
	void tireInfo() {
		System.out.println("Tire Company= " + tireCompany + "\nPrice = " + price + "\nDistance Driven = " + disDriven);
	}
}
