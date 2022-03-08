package com.human.ex;



class Human{
	String name;
	int age;
	double height;
}


public class Java0308_02 {

	public static void main(String[] args) {
		
//		String name1 = "홍길동";
//		int age1 = 24;
//		double height1 = 178.4;
//		
//		String name2 = "홍길남";
//		int age2 = 47;
//		double height2 = 172.4;
//		
//		String name3 = "홍길수";
//		int age3 = 35;
//		double height3 = 182.4;
		

		Human h1 = new Human();
		h1.name = "홍길동";
		h1.age = 24;
		h1.height = 178.4;
		
		Human h2 = new Human();
		h2.name = "홍길남";
		h2.age = 47;
		h2.height = 172.4;
		
		Human h3 = new Human();
		h3.name = "홍길수";
		h3.age = 35;
		h3.height = 182.4;
		
		System.out.println("이 : "+h2.name);
		System.out.println("나이 : "+h2.age);
		System.out.println("키 : "+h2.height);
	}
}
