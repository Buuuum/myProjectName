package com.human.ex2;

public class CarEx {
	
	public static void main(String[] args) {
		
		Car car = new Car("제네시스", "화이트", "현대자동차", 250, "한국타이어", 100000, 1000);

		System.out.println(car.model);
		System.out.println(car.company);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		System.out.println(car.tire.tireCompany);
		System.out.println(car.tire.price);
		System.out.println(car.tire.disDriven);
	}

}
