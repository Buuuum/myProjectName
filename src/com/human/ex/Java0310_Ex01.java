package com.human.ex;

import java.util.Scanner;

public class Java0310_Ex01 {
	
	public static void main(String[] args) {
		
//		문제1)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 : ");
//		int a =Integer.parseInt(sc.nextLine());
//		
//		if(a>10) {
//			System.out.println("10보다 큽니다.");
//		}else {
//			System.out.println("10보다 작습니다.");
//		}
		
		
//		문제2)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("true를 입력하세요 : ");
//		String a = sc.nextLine();
//		
//		if(a.equals("true")) {
//			System.out.println("true가 입력되었습니다.");
//		}else {
//			System.out.println("true가 입력되지 않았습니다.");
//		}
		
		
//		문제3)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("암호를 입력하세요 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		if(a==1004) {
//			System.out.println("암호가 맞음");
//		}else {
//			System.out.println("암호가 틀림");
//		}
	
		
//		문제4)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String a = sc.nextLine();
		
		if(a.equals("안녕")) {
			System.out.println("너도 안녕");
		}else if(a.equals("잘자")) {
			System.out.println("너도 잘자");
		}else if(a.equals("잘가")) {
			System.out.println("너도 잘가");
		}else {
			System.out.println("다시 입력");
		}
			
	}

}
