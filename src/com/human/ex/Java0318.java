package com.human.ex;

import java.util.Arrays;

public class Java0318 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i*6;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
