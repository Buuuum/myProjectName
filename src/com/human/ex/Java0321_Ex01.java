package com.human.ex;

import java.util.Scanner;

public class Java0321_Ex01 {

	public static void main(String[] args) {
		
//		문제0)
//		Scanner sc = new Scanner(System.in);
//		
//		boolean student[] = new boolean[50];
//		int input = 0;
//		int num = 0;
//		
//		while(!(input==6)) {
//			System.out.println("--------------------메뉴-------------------- ");
//			System.out.print("1.전체 출석사항 2.결석자 추가 3.출석자 추가 6.프로그램 종료");
//			input = Integer.parseInt(sc.nextLine());
//			
//			if(input==1) {
//				for(int i=0; i<student.length; i++) {
//					System.out.println((i+1) + "번 : " + student[i]);
//				}
//			}else if(input==2){
//				System.out.print("결석 처리할 학생 번호는? : ");
//				num = Integer.parseInt(sc.nextLine());
//				
//				student[num-1] = false;
//				System.out.println(String.format("%d번 학생 결석 처리 완료", input));
//				
//			}else if(input==3){
//				System.out.print("출석 처리할 학생 번호는? : ");
//				num = Integer.parseInt(sc.nextLine());
//				
//				student[num-1] = true;
//				System.out.println(String.format("%d번 학생 출석 처리 완료", input));
//				
//			}else if(input==6){
//				System.out.println("프로그램 종료");
//				break;
//			}else {
//				System.out.println("잘못 입력");
//			}
//			
//		}

		
		
		
		
//		Scanner sc = new Scanner(System.in);
//
//		boolean student[] = new boolean[50];
//		int input = 0;
//		int num = 0;
//
//		while(!(input==6)) {
//			System.out.println("--------------------메뉴-------------------- ");
//			System.out.print("1.전체 출석사항 2.결석자 추가 3.출석자 추가 6.프로그램 종료");
//			input = Integer.parseInt(sc.nextLine());
//			switch(input) {
//			case 1:
//				for(int i=0; i<student.length; i++) {
//					if(student[i]==true) {
//						System.out.println((i+1) + "번 : 출석");
//					}else {
//						System.out.println((i+1) + "번 : 결석");
//					}
//				}
//				break;
//			case 2:
//				System.out.print("결석 처리할 학생 번호는? : ");
//				num = Integer.parseInt(sc.nextLine());
//
//				student[num-1] = false;
//				System.out.println(String.format("%d번 학생 결석 처리 완료", num));
//				break;
//			case 3:
//				System.out.print("출석 처리할 학생 번호는? : ");
//				num = Integer.parseInt(sc.nextLine());
//
//				student[num-1] = true;
//				System.out.println(String.format("%d번 학생 출석 처리 완료", num));
//				break;
//			case 6:
//				System.out.println("프로그램 종료");
//				break;
//				default :
//					System.out.println("잘못 입력");
//			}
//		}
		
		
		
		
//		문제1)
//		Scanner sc = new Scanner(System.in);
//		int menuNum = 1;
//		int account = 0;
//		int money = 0;
//		
//		while(!(menuNum==0)) {
//			System.out.print("전체메뉴 : ");
//			System.out.println("1.입금 2.출금 3.조회 0.종료");
//			menuNum = Integer.parseInt(sc.nextLine());
//			
//			if(menuNum==1) {
//				System.out.print("얼마를 입금하시겠습니까? : ");
//				money = Integer.parseInt(sc.nextLine());
//				account += money;
//			}else if(menuNum==2) {
//				System.out.print("얼마를 출금하시겠습니까? : ");
//				money = Integer.parseInt(sc.nextLine());
//				if(account<=0||money>account) {
//					System.out.println("계좌에 돈이 부족합니다.");
//				}else {
//					account -= money;
//				}
//				
//			}else if(menuNum==3) {
//				System.out.println(String.format("계좌에 %d원 있습니다.", account));
//				
//			}else if(menuNum==0){
//				System.out.println("프로그램 종료");
//				break;
//			}else {
//				System.out.println("잘못 입력");
//			}
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int menuNum = 1;
//		int account = 0;
//		int money = 0;
//		
//		while(!(menuNum==0)) {
//			System.out.print("전체메뉴 : ");
//			System.out.println("1.입금 2.출금 3.조회 0.종료");
//			menuNum = Integer.parseInt(sc.nextLine());
//			
//			switch(menuNum) {
//			case 1:
//				System.out.print("얼마를 입금하시겠습니까? : ");
//				money = Integer.parseInt(sc.nextLine());
//				account += money;
//				break;
//			case 2:
//				System.out.print("얼마를 출금하시겠습니까? : ");
//				money = Integer.parseInt(sc.nextLine());
//				if(account<=0||money>account) {
//					System.out.println("계좌에 돈이 부족합니다.");
//				}else {
//					account -= money;
//				}
//					break;
//			case 3:
//				System.out.println(String.format("계좌에 %d원 있습니다.", account));
//				break;
//			case 0:
//				System.out.println("프로그램 종료");
//				break;
//				default :
//					System.out.println("잘못 입력");
//			}
//		}
		
		
		
		
//		문제2)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("금액을 투입하세요 : ");
//		int moneyInput = Integer.parseInt(sc.nextLine());
//		int change1000 = moneyInput/1000;
//		int change500 = moneyInput%1000/500;
//		int change100 = moneyInput%500/100;
//		int change50 = moneyInput%100/50;
//		int change10 = moneyInput%50/10;
//		
//		System.out.println(String.format("천원짜리 : %d개, 오백원짜리 : %d개, 백원짜리 : %d개, 오십원짜리 : %d개, 십원짜리 : %d개", change1000, change500, change100, change50, change10));
		
		
		
//		문제3)
//		Scanner sc = new Scanner(System.in);
//		int menuNum = 0;
//		int balance = 0;
//		
//		while(!(menuNum==6)) {
//			System.out.println("잔액 : " + balance + "원");
//			System.out.println("1.사이다(700원) 2.콜라(500원) 3.환타(350원) 4.100원 투입 5.500원 투입 6.반환");
//			menuNum = Integer.parseInt(sc.nextLine());
//			
//			if(menuNum==1) {
//				if(balance<700) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					balance -= 700;
//					System.out.println("사이다를 뽑았습니다. ");
//				}
//			}else if(menuNum==2) {
//				if(balance<500) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					balance -= 500;
//					System.out.println("콜라를 뽑았습니다. ");
//				}
//			}else if(menuNum==3) {
//				if(balance<350) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					balance -= 350;
//					System.out.println("환타를 뽑았습니다. ");
//				}
//			}else if(menuNum==4) {
//				System.out.println("100원 투입");
//				balance += 100;
//			}else if(menuNum==5) {
//				System.out.println("500원 투입");
//				balance += 500;
//			}else if(menuNum==6){
//				System.out.println(balance + "원 반환");
//				break;
//			}else {
//				System.out.println("잘못 입력");
//			}
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int menuNum = 0;
//		int balance = 0;
//		
//		while(!(menuNum==6)) {
//			System.out.println("잔액 : " + balance + "원");
//			System.out.println("1.사이다(700원) 2.콜라(500원) 3.환타(350원) 4.100원 투입 5.500원 투입 6.반환");
//			menuNum = Integer.parseInt(sc.nextLine());
//			
//			switch(menuNum) {
//			case 1:
//				if(balance<700) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					balance -= 700;
//					System.out.println("사이다를 뽑았습니다. ");
//				}
//				break;
//			case 2:
//				if(balance<500) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					balance -= 500;
//					System.out.println("콜라를 뽑았습니다. ");
//				}
//				break;
//			case 3:
//				if(balance<350) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					balance -= 350;
//					System.out.println("환타를 뽑았습니다. ");
//				}
//				break;
//			case 4:
//				System.out.println("100원 투입");
//				balance += 100;
//				break;
//			case 5:
//				System.out.println("500원 투입");
//				balance += 500;
//				break;
//			case 6:
//				System.out.println(balance + "원 반환");
//				break;
//				default :
//					System.out.println("잘못 입력");
//			}
//		}
		
		
		
		
		
//		문제4)
//		for(int i=1; i<=1000; i++) {
//			int a = i/10;
//			int b = i%10;
//			int c = i/100;
//			int d = i%100/10;
//			if(c==3||c==6||c==9) {
//				if(d==3||d==6||d==9) {
//					if(b==3||b==6||b==9) {
//						System.out.println("짝짝짝");
//					}else {
//						System.out.println("짝짝");
//					}
//				}else if(d==3||d==6||d==9) {
//					System.out.println("짝짝");
//				}else {
//					System.out.println("짝");
//				}
//			}else if(d==3||d==6||d==9){
//				if(b==3||b==6||b==9) {
//					System.out.println("짝짝");
//				}else {
//					System.out.println("짝");
//				}
//				
//			}else if(a==3||a==6||a==9){
//				if(b==3||b==6||b==9) {
//					System.out.println("짝짝");
//				}else {
//					System.out.println("짝");
//				}
//			}else if(b==3||b==6||b==9) {
//				System.out.println("짝");
//			}else {
//				System.out.println(i);
//			}
//		}
			
		
		
		
//		문제5)
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		int num2 = 0;
//		int menu = 1;
//		int answer = 0;
//		int t = 0;
//		int result = 0;
//
//		while(!(menu==0)) {
//			System.out.print("시작(1) 종료(0) : ");
//			menu = Integer.parseInt(sc.nextLine());
//			if(menu==1) {
//				System.out.println("프로그램을 시작합니다.");
//				System.out.println(String.format("1단계 문제"));
//				while(t<=2){
//					num1 = (int)(Math.random()*10+1);
//					num2 = (int)(Math.random()*10+1);
//					result = num1+num2;
//					System.out.println(String.format("%d + %d = ", num1, num2));
//					answer = Integer.parseInt(sc.nextLine());
//					if(answer==result) {
//						System.out.println("정답입니다.");
//						t++;
//					}else {
//						System.out.println("틀렸습니다.");
//					}
//				}
//				System.out.println(String.format("2단계 문제"));
//				t = 0;
//				while(t<=2){
//					num1 = (int)(Math.random()*10+1);
//					num2 = (int)(Math.random()*10+1);
//					result = num1-num2;
//					System.out.println(String.format("%d - %d = ", num1, num2));
//					answer = Integer.parseInt(sc.nextLine());
//					if(answer==result) {
//						System.out.println("정답입니다.");
//						t++;
//					}else {
//						System.out.println("틀렸습니다.");
//					}
//				}
//				System.out.println(String.format("3단계 문제"));
//				t = 0;
//				while(t<=2){
//					num1 = (int)(Math.random()*10+1);
//					num2 = (int)(Math.random()*10+1);
//					result = num1*num2;
//					System.out.println(String.format("%d * %d = ", num1, num2));
//					answer = Integer.parseInt(sc.nextLine());
//					if(answer==result) {
//						System.out.println("정답입니다.");
//						t++;
//					}else {
//						System.out.println("틀렸습니다.");
//					}
//				}
//				System.out.println(String.format("4단계 문제"));
//				t = 0;
//				while(t<=2){
//					num1 = (int)(Math.random()*10+1);
//					num2 = (int)(Math.random()*10+1);
//					result = num1/num2;
//					System.out.println(String.format("%d / %d = ", num1, num2));
//					answer = Integer.parseInt(sc.nextLine());
//					if(answer==result) {
//						System.out.println("정답입니다.");
//						t++;
//					}else {
//						System.out.println("틀렸습니다.");
//					}
//				}
//				System.out.println("축하합니다.");
//			}
//		}
//		System.out.println("프로그램을 종료합니다.");

		
		
		
//		문제6)
//		Scanner sc = new Scanner(System.in);
//		
//		int voucher = 1;
//		int price = 0;
//		
//		while(!(voucher==0)) {
//			System.out.println("이용권 종류를 선택하세요");
//			System.out.print("주간권(1일권):1, 오후권(오후3시~):2, 윈터야간권(오후5시~):3, 2일권:4, 종료:0 ");
//			voucher = Integer.parseInt(sc.nextLine());
//			if(voucher==0) {
//				System.out.println("종료 되었습니다");
//				break;
//			}
//			System.out.print("대인은 몇명 입니까? : ");
//			int adult = Integer.parseInt(sc.nextLine());
//			System.out.print("청소년은 몇명 입니까? : ");
//			int teenager = Integer.parseInt(sc.nextLine());
//			System.out.print("소인/경로는 몇명 입니까? : ");
//			int child = Integer.parseInt(sc.nextLine());
//			
//			switch(voucher) {
//			case 1:
//				price = (adult*46000)+(teenager*39000)+(child*36000);
//				System.out.println(String.format("주간권 총 가격은 %d원 입니다", price));
//				break;
//			case 2:
//				price = (adult*38000)+(teenager*32000)+(child*29000);
//				System.out.println(String.format("오후권 총 가격은 %d원 입니다", price));
//				break;
//			case 3:
//				price = (adult*20000)+(teenager*17000)+(child*16000);
//				System.out.println(String.format("윈터야간권 총 가격은 %d원 입니다", price));
//				break;
//			case 4:
//				price = (adult*74000)+(teenager*62000)+(child*58000);
//				System.out.println(String.format("윈터야간권 총 가격은 %d원 입니다", price));
//				break;
//				default :
//					System.out.println("메뉴 오류");
//			}
//			
//		}
		
		
		
		
//		문제7)
//		int com = (int) (Math.random()*10+1);
//		Scanner sc = new Scanner(System.in);
//		int t = 0;
//		int f = 0;
//
//		while(!(t==1)) {
//			System.out.println("1~10 중 숫자를 맞춰보세요 : ");
//			int answer = Integer.parseInt(sc.nextLine());
//			if(answer==com) {
//				System.out.println("정답입니다 !!!");
//				System.out.println("도전 횟수 : "+(f+1));
//				t++;
//			}else {
//				f++;
//				if(answer>com) {
//					System.out.println("입력한 숫자가 더 큽니다");
//				}else {
//					System.out.println("입력한 숫자가 더 작습니다");
//				}
//			}
//		}

		
		
		
		
		
	}
}
