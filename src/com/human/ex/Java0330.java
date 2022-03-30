package com.human.ex;


//문제2)
class Student{
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	static void sum(int kor, int eng, int math) {
		System.out.println("총합 : "+(kor + eng + math));
	}
	
	static void avg(int kor, int eng, int math) {
		System.out.println("평균 : "+(kor + eng + math)/3);
	}
}



//문제3)
class Car{
	
	String model;
	int speed;
	
	public Car(String model) {
		super();
		this.model = model;
	}

	void statement() {
		System.out.println("현재 차종 : "+model+" 속력은 "+speed+" 입니다.");
	}
	
	void speedUp() {
		speed += 10;
//		System.out.println("차의 속도를 10 높임");
	}
	
	void speedDown() {
		speed -= 10;
//		System.out.println("차의 속도를 10 낮춤");
	}
}



public class Java0330 {

	
	
//		문제1)
		static double height = 0;
		static double weight = 0;
		
		
		static void area(double height, double weight) {
			System.out.println("넓이 : "+ height*weight);
		}
		
		static void periphery(double height, double weight) {
			System.out.println("둘레 : "+ (height*2+weight*2));
		}
		
	
	

		
		
		
		
		
	public static void main(String[] args) {
		
		area(40, 20);
		periphery(20, 30);
		
		
		Student.sum(70,80,50);
		Student.avg(70, 80, 60);
		
		Car c1 = new Car("소나타");
		c1.statement();
		c1.speedUp();
		c1.speedUp();
		c1.statement();
		c1.speedDown();
		c1.statement();
		
	}

}
