package com.human.ex;

import java.util.Scanner;

public class MenuEx {

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
//			}else {
//				if(input==6) {
//					continue;
//				}
//				System.out.println("잘못 입력");
//			}
//			
//		}
//		System.out.println("프로그램 종료");
		
		
		
		
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
//			}else {
//				if(menuNum==0) {
//					continue;
//				}
//				System.out.println("잘못 입력");
//			}
//		}
//		System.out.println("프로그램 종료");
		
		
		
		
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
//		System.out.println(change1000);
//		System.out.println(String.format("천원짜리 : %d개, 오백원짜리 : %d개, 백원짜리 : %d개, 오십원짜리 : %d개, 십원짜리 : %d개", change1000, change500, change100, change50, change10));
		
		
	}
}
