package com.human.ex;

//문제1)
class Rectangle {

	public double height;
	public double widght;

	public void area(double height, double widght) {
		System.out.println("넓이 : " + height * widght);
	}

	public void periphery(double height, double widght) {
		System.out.println("둘레 : " + (height * 2 + widght * 2));
	}


}


class Circle {
	
	public final static double PI = 3.14;
	public double ridius;
	
	public void area(double ridius) {
		System.out.println("넓이 : " + ridius * ridius * PI);
	}

	public void periphery(double ridius) {
		System.out.println("둘레 : " + (ridius * 2 + PI));
	}
	
}



//문제2)
class Student {
	public int kor;
	public int eng;
	public int math;

	public static void sum(int kor, int eng, int math) {
		System.out.println("총합 : " + (kor + eng + math));
	}

	public static void avg(int kor, int eng, int math) {
		System.out.println("평균 : " + (kor + eng + math) / 3);
	}
}



//문제3)
class Car {

	public String model;
	public int speed;

	public Car(String model) {
		super();
		this.model = model;
	}

	public void statement() {
		System.out.println("현재 차종 : " + model + " 속력은 " + speed + " 입니다.");
	}

	public void speedUp() {
		speed += 10;
//		System.out.println("차의 속도를 10 높임");
	}

	public void speedDown() {
		speed -= 10;
//		System.out.println("차의 속도를 10 낮춤");
	}
}



class CellPhone {
	public String myName;
	public String myPhoneNum;
	public String msg;
	public String opponentName;
	public String opponentPhoneNum;

	public CellPhone(String myName, String myPhoneNum) {
		super();
		this.myName = myName;
		this.myPhoneNum = myPhoneNum;
	}

	public void sendInput(String opponentName, String opponentPhoneNum, String msg) {
		this.opponentName = opponentName;
		this.opponentPhoneNum = opponentPhoneNum;
		this.msg = msg;

	}

	public void sendInput(String opponentName, String opponentPhoneNum) {
		this.opponentName = opponentName;
		this.opponentPhoneNum = opponentPhoneNum;
	}

	public void sendMsgButton() {
		System.out.println(String.format("%s(%s)님의 전화로 %s(%s)님에게 '%s'의 메세지를 보냈습니다.", myName, myPhoneNum, opponentName,
				opponentPhoneNum, msg));
	}

	public void sendButton() {
		System.out.println(
				String.format("%s(%s)님의 전화로 %s(%s)님에게 전화를 걸었습니다.", myName, myPhoneNum, opponentName, opponentPhoneNum));
	}
}



public class Java0331_Ex01 {


	
	
	public static void main(String[] args) {
		
		
		Rectangle rec = new Rectangle();
		rec.area(40, 20);
		rec.periphery(20, 30);
		Circle cir = new Circle();
		cir.area(40);
		cir.periphery(20);
//		
//		
//		Student.sum(70,80,50);
//		Student.avg(70, 80, 60);
		
//		Car c1 = new Car("소나타");
//		c1.statement();
//		c1.speedUp();
//		c1.speedUp();
//		c1.statement();
//		c1.speedDown();
//		c1.statement();

		
		
//		CellPhone phone = new CellPhone("홍길동", "010-1111-1111");
//		phone.sendInput("홍길남", "010-2222-2222", "안녕");
//		phone.sendMsgButton();
//		phone.sendInput("홍길남", "010-2222-2222");
//		phone.sendButton();

	}

}
