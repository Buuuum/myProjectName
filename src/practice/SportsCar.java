package practice;

public class SportsCar extends Car{
	
	String mode;
	
	SportsCar(String model, String color, String mode){
		this.model = model;
		this.color = color;
		this.mode = mode;
	}
	
	
	void driveMode() {System.out.println(mode + "로 주행 중 입니다.");}
	
	void changeMode(String mode) {
		this.mode = mode;
		
		System.out.println(mode + "로 변경합니다.");
	}
}
