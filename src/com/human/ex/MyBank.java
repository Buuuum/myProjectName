package com.human.ex;

public class MyBank {

	public static int account = 0;

	// 입금

	public static void insert(int i) {

		MyBank.account = MyBank.account + i;

	}

	// 출금

	public static void withdraw(int i) {

		MyBank.account = MyBank.account - i;

	}

	// 확인

	public static int select() {

		return account;

	}

	public static boolean menu() {

		boolean returnValue = true;

		System.out.println("1. 입력 2.출금 3. 확인 4. 종료 >>");

		switch (new java.util.Scanner(System.in).nextLine()) {

		case "1":

			System.out.println("입금액>>");

			insert(Integer.parseInt(

					new java.util.Scanner(System.in).nextLine()));

			break;

		case "2":

			System.out.println("출금액>>");

			withdraw(Integer.parseInt(

					new java.util.Scanner(System.in).nextLine()));

			break;

		case "3":

			System.out.println("현재 금액 >>" + select());

			break;

		default:

			returnValue = false;

		}

		return returnValue;

	}
	
	
	

	public static void main(String[] args) {

		while (menu()) {

		}

		System.out.println("프로그램 종료");

	}

}
