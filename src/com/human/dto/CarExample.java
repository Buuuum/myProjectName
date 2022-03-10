package com.human.dto;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car("Ferari 812", "Red", "Ferari", 300, "금호타이어", 100000, 1816);
		Car YourCar = new Car("Audi R8", "White", "Audi", 280, "미쉐린타이어", 80000, 861);

		myCar.carInfo();
		myCar.tireInfo();
		System.out.println();
		YourCar.carInfo();
		YourCar.tireInfo();
		myCar.run();
		myCar.stop();
	}
}
