package com.human.ex;

public class Java0322_Ex02 {
	
	public static void main(String[] args) {
		
		
//		문제1)
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i+"*"+j+"="+i*j);
//				if(!(i*j/10==0)) {
//					System.out.print(" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		문제2)
//		for(int i=1; i<=9; i++) {
//			System.out.println("1단");
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
		
	
	for(int i=1; i<=9; i++) {
		for(int j=1; j<=3; j++) {
			System.out.print(j+"*"+i+"="+j*i+" ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=1; i<=9; i++) {
		for(int j=4; j<=6; j++) {
			System.out.print(j+"*"+i+"="+j*i+" ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=1; i<=9; i++) {
		for(int j=7; j<=9; j++) {
			System.out.print(j+"*"+i+"="+j*i+" ");
		}
		System.out.println();
	}
	
	}
}
