package com.human.ex;

public class Java0321 {

	public static void main(String[] args) {

		//		int sum = 0;
		//		
		//		for(int i=5; i<21; i++) {
		//			if(i%3==0) {
		//				sum += i;
		//			}
		//		}
		//		System.out.println(sum);





		for(int i =1; i<100; i++) {

			int a=i/10;

			int b=i%10;

			if(a>0 && b>0 && a%3==0 && b%3==0) {

				System.out.println(i+"짝짝");

			}

			else if(a>0 &&a%3==0) {

				System.out.println(i+"짝");

			}

			else if(b>0 &&b%3==0) {

				System.out.println(i+"짝");

			}

			else {

				System.out.println(i);

			}

		}
	}
}
