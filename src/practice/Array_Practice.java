package practice;

import java.util.Scanner;

public class Array_Practice {

	
	public static void main(String[] args) {
		
//		String[] names = new String[3];
//		int size = names.length;
//
//		Scanner put = new Scanner(System.in);
//
//		for(int i=0; i<size; i++){
//			System.out.print("이름을 입력하세요. ");
//			names[i] = put.next();            
//		}
//
//		for(int i=0; i<size; i++){
//
//			System.out.println("이름: " +names[i]);
//		}
		
		
		
//		int[] arr = new int[]{1,2,3,4,5};
//	
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for(int n : arr) {
//			System.out.println(n);
//		}

		
//		int[] arr = new int[5];
//		int i=0;
//		int sum=0;
//		int a=0;
//		for(i=0; i<arr.length; i++) {
//			arr[i] = i;
//			sum += arr[i];
//		}
//		a = sum/5;
//		System.out.println(a);
		
		
		int[] a = {5,2,3,0};
		a[1] = a[1]+4;
		a[2]=a[0]+a[1];
		a[3]=a[0]+a[1]+a[2];
		int sum = a[0]+a[1]+a[2]+a[3];
		sum = sum/5;
		System.out.println(sum);
		
	}
}
