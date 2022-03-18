package com.human.ex;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Java0318_Ex02 {

	public static void main(String[] args) {
		
		
//		문제1)
//		Scanner sc = new Scanner(System.in);
//		int[] a = new int[5];
//		
//		for(int i=0; i<5; i++) {
//			System.out.print(String.format("%d번 인덱스에 넣을 수는? : ", i));
//			int input = Integer.parseInt(sc.nextLine());
//			a[i] = input;
//		}
//		
//		System.out.print("찾을 수는? : ");
//		int find = Integer.parseInt(sc.nextLine());
//		
//		for(int j=0; j<5; j++) {
//			if(a[j]==find) {
//				System.out.print(String.format("%d는 %d번 인덱스에 있습니다.", find, j));
//			}
//		}
		
		
		
//		문제2)
//		Scanner sc = new Scanner(System.in);
//		String[] a = new String[5];
//		
//		for(int i=0; i<5; i++) {
//			System.out.print(String.format("%d번 인덱스에 넣을 문자는? : ", i));
//			String input = sc.nextLine();
//			a[i] = input;
//		}
//		
//		System.out.print("찾을 문자는? : ");
//		String find = sc.nextLine();
//		
//		for(int j=0; j<5; j++) {
//			if(a[j].equals(find)) {
//				System.out.print(String.format("%s는 %d번 인덱스에 있습니다.", find, j));
//			}
//		}
		
		
		
//		문제3)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("배열 크기 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		int[] arr = new int[a];
//		int count = 0;
//		
//		for(int i=0; i<a; i++) {
//			for(int j=1; j<=3; j++) {
//				if(count==a) {
//					break;
//				}else {
//					arr[count] = j;
//					count++;
//				}
//			}
//			System.out.println(arr[i]);
//		}
		
		
		
//		문제4-1)
//		int[] a = {1,2,3};
//		int[] b = new int[6];
//		int i = 0;
//		int count = 3;
//		
//		for(i=a.length-1; i>=0; i--) {
//			b[i] = a[i];
//			b[count] = a[i];
//			count++;
//		}
//		for(int n : b) {
//			System.out.println(n);
//		}
		
		
		
//		문제4-2)
//		int[] a = {7,15,23,15,23};
//		int[] b = new int[10];
//		int count = 0;
//
//		for(int i=a.length-1; i>=0; i--) {
//			b[count] = a[i];
//			count++;
//
//		}
//		for(int j=0; j<5; j++) {
//			b[count] = a[j];
//			count++;
//		}
//		for(int n : b) {
//			System.out.println(n);
//		}
		
		
		
//		문제5)
		int com = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		for(int i=0; i<100; i++) {
			com = (int) (Math.random()*6+1);
			if(com==1) {
				one++;
			}else if(com==2) {
				two++;
			}else if(com==3) {
				three++;
			}else if(com==4) {
				four++;
			}else if(com==5) {
				five++;
			}else{
				six++;
			}
		}
		System.out.println(String.format("1 : %d\n2 : %d\n3 : %d\n4 : %d\n5 : %d\n6 : %d", one,two,three,four,five,six));
		
	}
}
