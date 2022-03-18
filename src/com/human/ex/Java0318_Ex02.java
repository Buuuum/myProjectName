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
		
		
		
//		문제4)
//		int[] a = {1,2,3};
//		int[] b = new int[6];
//		int i = 0;
//		for(i=0; i<3; i++) {
//			b[i] = i+1;
//		}
//		for(int j=3; j<6; j++) {
//			b[j] = b[i+1];
//			i--;
//		}
//		for(int n=0; n<6; n++) {
//		System.out.println(b[n]);
//		}
		
		
		int[] a = {1,2,3};
		int[] b = new int[6];
		int i = 0;
		int count = 3;
		
		for(i=a.length-1; i>=0; i--) {
			b[i] = a[i];
			b[count] = a[i];
			count++;
		}
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		System.out.println(b[5]);
		
		
		
	}
}
