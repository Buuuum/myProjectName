package com.human.dto;

public class CarExample {

	public static void main(String[] args) {
		
	
		Car myCar = new Car("Ferari812", "Red", "Ferari", 300, "금호타이어",30000,11816);
				
		
//		System.out.println(myCar.carInfo());
//		System.out.println(myCar.tireInfo());
		myCar.carInfo();
		myCar.tireInfo();
		myCar.run();
		myCar.stop();
	}
}
