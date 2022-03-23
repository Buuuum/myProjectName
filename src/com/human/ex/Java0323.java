package com.human.ex;

import java.util.Arrays;

public class Java0323 {
	
	
	public static void main(String[] args) {
		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<2-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		for(int i=1; i<6; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			for(int j=1; j<12-(i*2); j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<6; i++) {
//			for(int j=1; j<6-i; j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j<(i*2)+1; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<6-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		


//		int [] arr= {7,5,9,0,3,1,6,2,4,8};
//		//버블정렬
//		for(int j=0;j<arr.length-1;j++) {
//			for(int i=0;i<arr.length-1;i++) {
//				if(arr[i] >arr[i+1]) {
//					int temp=arr[i];
//					arr[i]=arr[i+1];
//					arr[i+1]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		int[] a = {5,2,8,5,7,1};
		int temp = 0;
		for(int i=a.length-1; i>0; i--) {
			int maxIndex = 0;
			int selectIndex = i;
			for(int j=0; j<=selectIndex; j++) {
				if(a[j] > a[maxIndex]) {
					maxIndex = j;
				}
			}
			temp = a[maxIndex];
			a[maxIndex] = a[selectIndex];
			a[selectIndex] = temp;
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
