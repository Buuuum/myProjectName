package com.human.ex;

import java.util.Scanner;

public class IfEx {
	
	
	public static void main(String[] args) {
		
//		문제1)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("a 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("b 입력 : ");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		if(a==0) {
//			a = 5;
//			System.out.println("a : "+a+"\n"+"b : "+b);
//		}else {
//			b=a+3;
//			System.out.println("a : "+a+"\n"+"b : "+b);
//		}
	
	
//		문제2)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("음수나 양수 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		if(a<0) {
//			System.out.println(Math.abs(a));
//		}else {
//			System.out.println(a);
//		}
	
		
		boolean b1=5!=3;
		boolean b2=5==3;
		
		if(b1)
			if(b2)
				System.out.println("1번");
			else
				System.out.println("2번");
		else
		System.out.println("3번");
		System.out.println("4번");
		
		
		
	}

}
