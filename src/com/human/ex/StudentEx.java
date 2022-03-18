package com.human.ex;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		
//		문제0)
		Scanner sc = new Scanner(System.in);
		
		boolean student[] = new boolean[50];
		int input = 0;
		
		while(!(input==6)) {
			System.out.println("--------------------메뉴-------------------- ");
			System.out.print("1.전체 출석사항 2.결석자 추가 3.출석자 추가 6.프로그램 종료");
			input = Integer.parseInt(sc.nextLine());
			
			if(input==1) {
				for(boolean n : student) {
					System.out.println(n);
				}
			}else if(input==2){
				System.out.print("결석 처리할 학생 번호는? : ");
				input = Integer.parseInt(sc.nextLine());
				
				student[input-1] = false;
				System.out.println(String.format("%d번 학생 결석 처리 완료", input));
				
			}else if(input==3){
				System.out.print("출석 처리할 학생 번호는? : ");
				input = Integer.parseInt(sc.nextLine());
				
				student[input-1] = true;
				System.out.println(String.format("%d번 학생 출석 처리 완료", input));
				
			}else {
				if(input==6) {
					continue;
				}
				System.out.println("잘못 입력");
			}
			
		}
		System.out.println("프로그램 종료");
		
	}
}
