package com.human.ex;

import java.util.Scanner;

public class Java0315_Ex01 {
	
	public static void main(String[] args) {
		
		
//		문제1)
//		Scanner sc = new Scanner(System.in);
//		int a = Integer.parseInt(sc.nextLine());
//		boolean b = true;
//		b = a>14;
//		
//		if(b==true) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
		
//		문제2)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		boolean b = true;
//		boolean c = true;
//		
//		b = a<=12;
//		c = a>22;
//		
//		if(b==true||c==true) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//		
//		not 연산자
//		b = a>12;
//		c = a<=22;
//		
//		if(!b==true||!c==true) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
		
		
//		문제3)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		boolean b = true;
//		boolean c = true;
//		boolean d = true;
//		boolean e = true;
//		b = a%3==0;
//		c = a%7==0;
//		d = a%2==0;
//		e = a%5==0;
//		
//		if((b==true||c==true)&&(c==true&&d==true)) {
//			System.out.println("3또는 7의 배수이며 2와 5의 배수");
//		}else if(b==true||c==true) {
//			System.out.println("3또는 7의 배수");
//		}else if(d==true&&e==true) {
//			System.out.println("2와 5의 배수");
//		}else {
//			System.out.println("해당 없음");
//		}
		
		
		
//		문제4)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("x의 좌표 : ");
//		int x = Integer.parseInt(sc.nextLine());
//		System.out.println("y의 좌표 : ");
//		int y = Integer.parseInt(sc.nextLine());
//		
//		boolean a = true;
//		boolean b = true;
//		a = x>0;
//		b = y>0;
//		
//		if(!a==true&&b==true) {
//			System.out.println("1번 위치(-x,y축)");
//		}else if(a==true&&b==true) {
//			System.out.println("2번 위치(x,y축)");
//		}else if(a==true&&!b==true) {
//			System.out.println("3번 위치(x,-y축)");
//		}else if(!a==true&&!b==true) {
//			System.out.println("4번 위치(-x,-y축)");
//		}
		
		
		
//		문제4)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 입력 : ");
//		int age = Integer.parseInt(sc.nextLine());
//		System.out.println("버스카드 ?(true/false) : ");
//		boolean a = Boolean.parseBoolean(sc.nextLine());
//		boolean b = true;
//		
//		if(age<=15==true&&a==true) {
//			System.out.println("버스 요금은 1200원 입니다.");
//		}else if(age<=15==true&&!a==true) {
//			System.out.println("버스 요금은 1300원 입니다.");
//		}else if(age>15==true&&a==true) {
//			System.out.println("버스 요금은 1500원 입니다.");
//		}else if(age>15==true&&!a==true) {
//			System.out.println("버스 요금은 1600원 입니다.");
//		}
		
		
//		문제5)
		Scanner sc = new Scanner(System.in);
		System.out.print("무엇을 먹었는가? (밥/빵) : ");
		String input = sc.nextLine();
		System.out.println("다른 걸 먹었는가? (true/false) : ");
		boolean a = Boolean.parseBoolean(sc.nextLine());
		
		if(input.equals("밥")&&a==true) {
			System.out.println("밥을 먹었음");
		}else if(input.equals("밥")&&!a==false) {
			System.out.println();
		}else if(input.equals("빵")&&a==true) {
			System.out.println("빵을 먹었음");
		}else if(input.equals("빵")&&!a==true) {
			System.out.println("밥을 먹었음");
		}
		
		
		
		
	}
}
