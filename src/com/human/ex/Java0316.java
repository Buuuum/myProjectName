package com.human.ex;

public class Java0316 {
	
	public static void main(String[] args) {
		
////		1. if
//		if(5==6) {
//			System.out.println(false);
//		}
//		if(5!=6) {
//			System.out.println(true);
//		}
		
		
////		2. if else
//		String str = "if";
//		if(str.equals("if")) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
	
////		3. else if
//		int a = 1;
//		if(a==1) {
//			System.out.println(1);
//		}else if(a==2) {
//			System.out.println(2);
//		}else if(a==2) {
//			System.out.println(2);
//		}else if(a==3) {
//			System.out.println(3);
//		}else {
//			System.out.println("없으면 출력");	
//		}
		
		
////		4. switch
//		switch (a) {
//		case 1: 
//			System.out.println(1);
//			break;
//		case 2: 
//			System.out.println(2);
//		case 3: 
//			System.out.println(3);
//			break;
//		default:
//			System.out.println(4);
//		}
		
		
////		5. for
//		for(int i=0; i<10; i++) {
//			System.out.println(1);
//		}
		
		
		
//		for(int i=1; i<6; i++) {
//			System.out.println("안녕");
//		}
//		
//		for(int i=1; i<5; i++) {
//			System.out.println(i);
//		}
		
	
//		int sum = 0;
//		for(int i=1; i<11; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		int sum = 0;
//		for(int i=8; i<21; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//
//		
//		for(int i=6; i<10; i++) {
//			System.out.println(i);
//		}
			
		
		
//		for(int i=1; i<6; i++) {
//			for(int j=0; j<5-i; j++)
//				System.out.print(" ");
//			for(int k=1; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
		
//		int sum = 0;
//		for(int i=20; i<31; i++) {
//			if(i%2==0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		
//		int sum = 0;
//		int i = 1;
//		while (i<11) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		
//		int i = 1;
//		while(i<5) {
//			System.out.println("안녕");
//			i++;
//		}
		
//		int i = 1;
//		while(i<5) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i = 1;
//		int sum = 0;
//		while(i<11) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
//		int i = 8;
//		int sum = 0;
//		while(i<21) {
//			if(i%2==1) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
		
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<6; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<(6-i)*2-2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
