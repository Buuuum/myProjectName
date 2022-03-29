package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Java0329_Ex01 {

//	문제1)
//	public static void triangle1() {
//		for(int i=1; i<=7; i++) {
//			for(int j=1; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	
//	
//	public static void triangle2() {
//		for(int i=0; i<=7; i++) {
//			for(int j=1; j<=7-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	
//	
//	public static void triangle3() {
//		for(int i=1; i<=7; i++) {
//			for(int j=1; j<=7-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	
	
//	문제2)
//	public static void businessCard(String a, String b, int c) {
//		System.out.println(String.format("이름 : %s\n성별: %s\n나이 : %d", a, b, c));
//	}

	
	
//	문제3)
//	public static int arrSum(int[] arr) {
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		return sum;
//	}
	
	
	
//	문제4)
//	public static void calendar() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("월:1 화:2 수:3 목:4 금:5 토:6 일:7");
//		System.out.print("달의 시작 요일 입력 : ");
//		int month = Integer.parseInt(sc.nextLine());
//		System.out.print("일 수 : ");
//		int day = Integer.parseInt(sc.nextLine());
//		int a = 7;
//		System.out.println("월\t화\t수\t목\t금\t토\t일");
//		for(int i=1; i<=day; i++) {
//			for(int j=1; j<month;j++) {
//				if(i==1) {
//					System.out.print("\t");
//				}
//			}
//			System.out.print(i+"\t");
//			if(i==a-month+1) {
//				System.out.println();
//				a+=7;
//			}
//		}
//	}
	
	
	
//	문제5)
//	static class Cat{
//		static String name;
//		static int age;
//		
//		public Cat(String name, int age) {
//			Cat.name = name;
//			Cat.age = age;
//		}
//		@Override
//		public String toString() {
//			return "Cat [name : " + name + " age : " + age + "]";
//		}
//	}
//	
//	
//	public static int intFunc(int a) {
//		System.out.println(a);
//		return a;
//	}
//	public static double doubleFunc(double a) {
//		System.out.println(a);
//		return a;
//	}
//	public static String stringFunc(String a) {
//		System.out.println(a);
//		return a;
//	}
//	public static Cat catFunc(Cat cat) {
//		System.out.println(cat);
//		return cat;
//	}
//	public static int[] intArrFunc(int[] arr) {
//		System.out.println(Arrays.toString(arr));
//		return arr;
//	}
//	public static Cat[] catObjectFunc(Cat[] arr2) {
//		System.out.println(Arrays.toString(arr2));
//		return arr2;
//	}

	
	
//	문제6)
//	public static double circle(double a) {
//		final double PI = 3.141592;
//		return a*a*PI;
//	}
//	
//	public static double Square(double a, double b) {
//		return a*b;
//	}
//	
//	public static double triangle(double a, double b) {
//		return (a*b)/2;
//	}
	
	
	
	
//	문제7)
//	public static void gugudan(int dan) {
//		System.out.println("-----"+dan+"단-----");
//		for(int i=1; i<=9; i++) {
//			System.out.println(String.format("%d*%d : %d", dan, i, dan*i));
//		}
//	}
	
	
	
	public static void main(String[] args) {

		
		
		
		
//		gugudan(3);
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("원:1, 사각형:2, 삼각형:3");
//		System.out.print("어떤 도형의 넓이를 구할까요? : ");
//		int menu = Integer.parseInt(sc.nextLine());
//
//
//		if(menu==1) {
//			System.out.print("반지름 입력 : ");
//			double input1 = Double.parseDouble(sc.nextLine());
//			System.out.println(circle(input1));
//		}else if(menu==2) {
//			System.out.println("가로 세로 입력 : ");
//			double input1 = Double.parseDouble(sc.nextLine());
//			double input2 = Double.parseDouble(sc.nextLine());
//			System.out.println(Square(input1, input2));
//		}else if(menu==3) {
//			System.out.println("밑변 높이 입력 : ");
//			double input1 = Double.parseDouble(sc.nextLine());
//			double input2 = Double.parseDouble(sc.nextLine());
//			System.out.println(triangle(input1, input2));
//		}else {
//			System.out.println("잘못 입력");
//		}

		
		
//		triangle1();
//		System.out.println();
//		triangle2();
//		System.out.println();
//		triangle3();
		
		
//		businessCard("홍길동", "남", 25);
		
		
//		int[] arr = {1,2,3,4,7,9};
//		System.out.println(arrSum(arr));
		
		
//		calendar();
		
		
//		System.out.println(intFunc(3));
//		System.out.println(doubleFunc(1.5));
//		System.out.println(stringFunc("asd"));
//		Cat cat = new Cat("나비", 4);
//		System.out.println(catFunc(cat));
//		int[] arr = {1,5,2,6};
//		System.out.println(Arrays.toString(intArrFunc(arr)));
//		Cat[] arr2 = {cat};
//		System.out.println(Arrays.toString(catObjectFunc(arr2)));
		
		
	
		
	}

}
