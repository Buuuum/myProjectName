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
//		boolean b = a%3==0;
//		boolean c = a%7==0;
//		boolean d = a%2==0;
//		boolean e = a%5==0;
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
//		boolean a = x>0;
//		boolean b = y>0;
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
//		case 0:
//		System.out.println("일요일");
//		break;
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
		
		
		
//		문제9)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("청소년(1) 성인(2) 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("키 입력 : ");
//		double height = Double.parseDouble(sc.nextLine());
//		System.out.print("몸무게 입력 : ");
//		double	weight = Double.parseDouble(sc.nextLine());
//		double bmi = (weight/((height-100)*0.9))*100;
//		
//		if(a==1) {
//			if(bmi>=150) {
//				System.out.println("고도 비만");
//			}else if(bmi>=130) {
//				System.out.println("중도 비만");
//			}else if(bmi>=120) {
//				System.out.println("경도 비만");
//			}else if(bmi>=95) {
//				System.out.println("정상");
//			}else if(bmi<95) {
//				System.out.println("체중미달");
//			}
//		}else if(a==2) {
//			if(bmi>=150) {
//				System.out.println("고도 비만");
//			}else if(bmi>=120) {
//				System.out.println("비만");
//			}else if(bmi>=110) {
//				System.out.println("과체중");
//			}else if(bmi>=100) {
//				System.out.println("정상");
//			}else if(bmi<100) {
//				System.out.println("체중미달");
//			}
//		}else {
//			System.out.println("잘못 입력");
//		}
		
		
		
//		문제10)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("목둘레(1), 가슴둘레(2), 팔길이(3), 허리둘레(4) 중 번호를 고르세요 : ");
//		int num = Integer.parseInt(sc.nextLine());
//		System.out.print("치수를 입력하세요 : ");
//		int size = Integer.parseInt(sc.nextLine());
//		
//		if(num==1) {
//			if(size>=33&&size<36) {
//				System.out.println("목둘레 " + size);
//				System.out.println("미국 SIZE : S");
//				System.out.println("한국 SIZE : 90~95");
//			}else if(size>=36&&size<38) {
//				System.out.println("목둘레 " + size);
//				System.out.println("미국 SIZE : M");
//				System.out.println("한국 SIZE : 95~100");
//			}else if(size>=38&&size<41) {
//				System.out.println("목둘레 " + size);
//				System.out.println("미국 SIZE : L");
//				System.out.println("한국 SIZE : 100~105");
//			}else if(size>=41&&size<43) {
//				System.out.println("목둘레 " + size);
//				System.out.println("미국 SIZE : XL");
//				System.out.println("한국 SIZE : 105~120");
//			}else if(size>=43&&size<45) {
//				System.out.println("목둘레 " + size);
//				System.out.println("미국 SIZE : XXL");
//				System.out.println("한국 SIZE : 110이상");
//			}else {
//				System.out.println("잘못입력");
//			}
//		}else if(num==2) {
//			if(size>=86&&size<91) {
//				System.out.println("가슴둘레 " + size);
//				System.out.println("미국 SIZE : S");
//				System.out.println("한국 SIZE : 90~95");
//			}else if(size>=96&&size<102) {
//				System.out.println("가슴둘레 " + size);
//				System.out.println("미국 SIZE : M");
//				System.out.println("한국 SIZE : 95~100");
//			}else if(size>=107&&size<112) {
//				System.out.println("가슴둘레 " + size);
//				System.out.println("미국 SIZE : L");
//				System.out.println("한국 SIZE : 100~105");
//			}else if(size>=117&&size<122) {
//				System.out.println("가슴둘레 " + size);
//				System.out.println("미국 SIZE : XL");
//				System.out.println("한국 SIZE : 105~120");
//			}else if(size>=127&&size<132) {
//				System.out.println("가슴둘레 " + size);
//				System.out.println("미국 SIZE : XXL");
//				System.out.println("한국 SIZE : 110이상");
//			}else {
//				System.out.println("잘못입력");
//			}
//		}else if(num==3) {
//			if(size>=78&&size<81) {
//				System.out.println("팔길이 " + size);
//				System.out.println("미국 SIZE : S");
//				System.out.println("한국 SIZE : 90~95");
//			}else if(size>=81&&size<84) {
//				System.out.println("팔길이 " + size);
//				System.out.println("미국 SIZE : M");
//				System.out.println("한국 SIZE : 95~100");
//			}else if(size>=84&&size<86) {
//				System.out.println("팔길이 " + size);
//				System.out.println("미국 SIZE : L");
//				System.out.println("한국 SIZE : 100~105");
//			}else if(size>=86&&size<89) {
//				System.out.println("팔길이 " + size);
//				System.out.println("미국 SIZE : XL");
//				System.out.println("한국 SIZE : 105~120");
//			}else if(size>=89&&size<91) {
//				System.out.println("팔길이 " + size);
//				System.out.println("미국 SIZE : XXL");
//				System.out.println("한국 SIZE : 110이상");
//			}else {
//				System.out.println("잘못입력");
//			}
//		}else if(num==4) {
//			if(size>=28&&size<30) {
//				System.out.println("허리둘레 " + size);
//				System.out.println("미국 SIZE : S");
//				System.out.println("한국 SIZE : 90~95");
//			}else if(size>=30&&size<32) {
//				System.out.println("허리둘레 " + size);
//				System.out.println("미국 SIZE : M");
//				System.out.println("한국 SIZE : 95~100");
//			}else if(size>=32&&size<34) {
//				System.out.println("허리둘레 " + size);
//				System.out.println("미국 SIZE : L");
//				System.out.println("한국 SIZE : 100~105");
//			}else if(size>=34&&size<38) {
//				System.out.println("허리둘레 " + size);
//				System.out.println("미국 SIZE : XL");
//				System.out.println("한국 SIZE : 105~120");
//			}else if(size>=38&&size<41) {
//				System.out.println("허리둘레 " + size);
//				System.out.println("미국 SIZE : XXL");
//				System.out.println("한국 SIZE : 110이상");
//			}else {
//				System.out.println("잘못입력");
//			}
//		}else {
//			System.out.println("잘못 입력");
//		}
		
		
		
//		문제11)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 수 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("연산자(+ - * /) 선택 : ");
//		String b = sc.nextLine();
//		System.out.print("두번째 수 입력 : ");
//		int c = Integer.parseInt(sc.nextLine());
//		int result = 0;
//		switch(b) {
//		case "+" : 
//			result = a + c;
//			System.out.println(String.format("%d + %d = %d 입니다.", a, c, result));
//			break;
//		case "-" : 
//			result = a - c;
//			System.out.println(String.format("%d - %d = %d 입니다.", a, c, result));
//			break;
//		case "*" : 
//			result = a * c;
//			System.out.println(String.format("%d * %d = %d 입니다.", a, c, result));
//			break;
//		case "/" : 
//			result = a / c;
//			System.out.println(String.format("%d / %d = %d 입니다.", a, c, result));
//			break;
//		}
	
		
		
//		문제12)
//		Scanner sc = new Scanner(System.in);
//
//		int you = (int)(Math.random()*3+1);
//		System.out.print("가위,바위,보 중 무엇을 내겠습니까? : ");
//		String me = sc.nextLine();
//		
//		if(you==1) {
//			if(me.equals("가위")) {
//				System.out.println("상대가 가위를 냈습니다");
//				System.out.println("비겼습니다.");
//			}else if(me.equals("바위")) {
//				System.out.println("상대가 가위를 냈습니다");
//				System.out.println("이겼습니다.");
//			}else if(me.equals("보")) {
//				System.out.println("상대가 가위를 냈습니다");
//				System.out.println("졌습니다.");
//			}else {
//				System.out.println("잘못입력");
//			}
//		}else if(you==2) {
//			if(me.equals("가위")) {
//				System.out.println("상대가 바위를 냈습니다");
//				System.out.println("졌습니다.");
//			}else if(me.equals("바위")) {
//				System.out.println("상대가 바위를 냈습니다");
//				System.out.println("비겼습니다.");
//			}else if(me.equals("보")) {
//				System.out.println("상대가 바위를 냈습니다");
//				System.out.println("이겼습니다.");
//			}else {
//				System.out.println("잘못입력");
//			}
//		}else if(you==3) {
//			if(me.equals("가위")) {
//				System.out.println("상대가 보를 냈습니다");
//				System.out.println("이겼습니다.");
//			}else if(me.equals("바위")) {
//				System.out.println("상대가 보를 냈습니다");
//				System.out.println("졌습니다.");
//			}else if(me.equals("보")) {
//				System.out.println("상대가 보를 냈습니다");
//				System.out.println("비겼습니다.");
//			}else {
//				System.out.println("잘못입력");
//			}
//		}else {
//			System.out.println("잘못입력");
//		}
		
		
		
//		문제12)
//		int a = (int) (Math.random()*5+6);
//		System.out.println(a);
		
		
		
//		문제13)
//		int a = (int) (Math.random()*45+1);
		
				
		
//		문제14)
//		int a = (int) (Math.random()*3);
//		
//		switch(a) {
//		case 0:
//			System.out.println("가위");
//			break;
//		case 1:
//			System.out.println("바위");
//			break;
//		case 2:
//			System.out.println("보");
//			break;
//		}
		
		
		
//		문제13)
		Scanner sc = new Scanner(System.in);
		System.out.println("번 돈은 얼마입니까? (단위:만원) : ");
		int inCome = Integer.parseInt(sc.nextLine());
		int money = 0;
		int tax = 0;
		int tax2 = 0;
		
		if(inCome<=1200) {
			tax = (int) (inCome*0.06);
			money = (int) (inCome-tax);
			System.out.println("번 돈(세전) : "+ inCome);
			System.out.println("세금 : " + tax);
			System.out.println("번 돈(세후) : " + money);
		}else if(inCome>=1200&&inCome<4600) {
			tax = (int) (1200*0.06);
			tax2 = (int) ((inCome-1200)*0.15);
			money = (int) inCome-(tax+tax2);
			System.out.println("번 돈(세전) : "+ inCome);
			System.out.println("세금 : " + (tax + tax2));
			System.out.println("번 돈(세후) : " + money);
		}else if(inCome>=4600&&inCome<8800) {
			tax = (int) (4600*0.15);
			tax2 = (int) ((inCome-4600)*0.24);
			money = (int) inCome-(tax+tax2);
			System.out.println("번 돈(세전) : "+ inCome);
			System.out.println("세금 : " + (tax + tax2));
			System.out.println("번 돈(세후) : " + money);
		}else if(inCome>=8800&&inCome<15000) {
			tax = (int) (8800*0.24);
			tax2 = (int) ((inCome-8800)*0.35);
			money = (int) inCome-(tax+tax2);
			System.out.println("번 돈(세전) : "+ inCome);
			System.out.println("세금 : " + (tax + tax2));
			System.out.println("번 돈(세후) : " + money);
		}else if(inCome>=15000&&inCome<30000) {
			tax = (int) (15000*0.35);
			tax2 = (int) ((inCome-15000)*0.38);
			money = (int) inCome-(tax+tax2);
			System.out.println("번 돈(세전) : "+ inCome);
			System.out.println("세금 : " + (tax + tax2));
			System.out.println("번 돈(세후) : " + money);
		}else if(inCome>=30000&&inCome<50000) {
			tax = (int) (30000*0.38);
			tax2 = (int) ((inCome-30000)*0.40);
			money = (int) inCome-(tax+tax2);
			System.out.println("번 돈(세전) : "+ inCome);
			System.out.println("세금 : " + (tax + tax2));
			System.out.println("번 돈(세후) : " + money);
		}else if(inCome>50000) {
			tax = (int) (50000*0.40);
			tax2 = (int) ((inCome-50000)*0.42);
			money = (int) inCome-(tax+tax2);
			System.out.println("번 돈(세전) : "+ inCome);
			System.out.println("세금 : " + (tax + tax2));
			System.out.println("번 돈(세후) : " + money);
		}
		
		
		
	}
}
