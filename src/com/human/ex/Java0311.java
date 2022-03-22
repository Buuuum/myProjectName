package com.human.ex;

import java.util.Arrays;

import practice.object.Human;

public class Java0311 {
	
	public static void main(String[] args) {
		
//		int[] a = {5, 2, 3, 0};
//		int b = 4;
//		a[1] = a[1]+b;  // 5, 6, 3
//		a[2] = a[0]+a[1];  // 5, 6, 11
//		a[3] = a[0]+a[1]+a[2];  // 5, 6, 11, 22 
//		int sum = a[0]+a[1]+a[2]+a[3];  // 44
//		sum = sum/5;  // 44/5 = 8
//		System.out.println(sum);
		
		
//		Human arr4[] = new Human[3];
//		arr4[0] = new Human();
//		System.out.println(arr4[0]);
//		
//		arr4[1] = new Human();
//		System.out.println(arr4[1]);
//		arr4[1].name = "짱구";
//		arr4[1].age = 4;
//		arr4[1].height = 92.4;
//		System.out.println(arr4[1]);
		
		
		
		int arr1[] = new int[5];
		int[] arr2 = new int[5];
		int []arr3;
		arr3 = new int[5];
		int[] arr4 = {1,2,3,4,5};
		
		
		arr1[1] = 10;
		arr1[2] = 20;
		arr1[3] = 30;
		arr1[4] = 40;
		
		int sum = arr1[1]+arr1[4]+10;
		arr1[0] = arr1[1]+arr1[2];
		
		arr2[0]=arr1[0];
		arr2[1]=arr1[1];
		arr2[2]=arr1[2];
		arr2[3]=arr1[3];
		
		System.out.println(arr2[0]);
		System.out.println(Arrays.toString(arr2));
		
		double arrDouble[] = new double[3];
		arrDouble[0]=1.1;
		arrDouble[1]=1.2;
		arrDouble[2]=1.3;
		
		System.out.println(Arrays.toString(arrDouble));
		
		Human arrHuman[] = new Human[3];
		arrHuman[0] = new Human("123",2,2);
		arrHuman[0].age = 10;
		System.out.println(arrHuman[0].age);
		System.out.println(Arrays.toString(arrHuman));
	}

}
