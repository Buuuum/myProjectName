package practice.object;

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


	@Override
	public String toString() {
		return "모델 = " + model + "\n색상 = " + color + "\n제조회사 = " + company + "\n최대 속도 = " + maxSpeed
				+ "Km/h\n타이어 제조회사 = " + tire.tireCompany + "\n타이어 가격 = " + tire.price + "원\n주행거리 = " + tire.disDriven + "Km";
	}
	
	

}
