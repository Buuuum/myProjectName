package com.human.ex;

import java.util.Date;
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
//		if(!(b==true&&c==true)) {
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
//		}else {
//			System.out.println("오류");
//		}
		
		
//		문제5)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("무엇을 먹었는가? (밥/빵) : ");
//		String input = sc.nextLine();
//		System.out.println("다른 걸 먹었는가? (true/false) : ");
//		boolean a = Boolean.parseBoolean(sc.nextLine());
//		
//		if(input.equals("밥")&&a==true) {
//			System.out.println("밥을 먹었음");
//		}else if(input.equals("밥")&&!a==false) {
//			System.out.println();
//		}else if(input.equals("빵")&&a==true) {
//			System.out.println("빵을 먹었음");
//		}else if(input.equals("빵")&&!a==true) {
//			System.out.println("밥을 먹었음");
//		}
		
		
//		문제6)
//		int i = new Date().getDay();
//		
//		switch (i) {
//		case 1:
//			System.out.println("월요일");
//			break;
//		case 2:
//			System.out.println("화요일");
//			break;
//		case 3:
//			System.out.println("수요일");
//			break;
//		case 4:
//			System.out.println("목요일");
//			break;
//		case 5:
//			System.out.println("금요일");
//			break;
//		case 6:
//			System.out.println("토요일");
//			break;
//		case 7:
//			System.out.println("일요일");
//			break;
//		}
		
		
//		문제7)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("한국 SIZE 입력 : ");
//		int kor = Integer.parseInt(sc.nextLine());
//		boolean s = kor>=90&&kor<95;
//		boolean m = kor>=95&&kor<100;
//		boolean l = kor>=100&&kor<105;
//		boolean xl = kor>=105&&kor<110;
//		boolean xxl = kor>=110;
//		
//		if(xxl) {
//			System.out.println("미국 SIZE : XXL");
//		}else if(xl) {
//			System.out.println("미국 SIZE : XL");
//		}else if(l) {
//			System.out.println("미국 SIZE : L");
//		}else if(m) {
//			System.out.println("미국 SIZE : M");
//		}else if(s) {
//			System.out.println("미국 SIZE : S");
//		}else {
//			System.out.println("SIZE 잘못 입력");
//		}
		
//		if(kor>=110) {
//			System.out.println("미국 SIZE : XXL");
//		}else if(kor>=105) {
//			System.out.println("미국 SIZE : XL");
//		}else if(kor>=100) {
//			System.out.println("미국 SIZE : L");
//		}else if(kor>=95) {
//			System.out.println("미국 SIZE : M");
//		}else if(kor>=90) {
//			System.out.println("미국 SIZE : S");
//		}
		
		
		
//		문제8)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("java 점수 : ");
//		int jScore = Integer.parseInt(sc.nextLine());
//		System.out.print("html 점수 : ");
//		int hScore = Integer.parseInt(sc.nextLine());
//		System.out.print("db 점수 : ");
//		int dScore = Integer.parseInt(sc.nextLine());
//		int avg = (jScore+hScore+dScore)/3;
//		
//		if(avg>=60) {
//			if(jScore<=40) {
//				System.out.print(String.format("java %d 과락", jScore));
//			}else if(hScore<=40) {
//				System.out.print(String.format("html %d 과락", hScore));
//			}else if(dScore<=40) {
//				System.out.print(String.format("db %d 과락", dScore));
//			}else {
//				System.out.println("합격");
//			}
//		}else {
//			System.out.println("불합격");
//		}
		
		
		
		
		
	}
}
