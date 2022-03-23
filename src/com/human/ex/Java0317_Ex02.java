package com.human.ex;

import java.util.Scanner;

public class Java0317_Ex02 {

	public static void main(String[] args) {
		
		
//		문제0)
//		do while 문
//		int i = 3;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<11);
		
//		int i = 9;
//		int sum = 0;
//		do {
//			sum += i;
//			i++;
//		}while(i<31);
//		System.out.println(sum);
		
		
//		while 문
//		int i = 3;
//		while(i<11) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i = 9;
//		int sum = 0;
//		while(i<31) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		
//		for 문
//		for(int i=3; i<11; i++) {
//			System.out.println(i);
//		}
		
//		int sum = 0;
//		for(int i=9; i<31; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		문제1)
//		while 문
//		int a = 2;
//		int b = 1;
//		b++;
//		System.out.println(String.format("a:%d, b:%d", a,b));
//		while(b<15) {
//			a=a+1;
//			b=b+1;
//			System.out.println(String.format("a:%d, b:%d", a,b));
//		}
		
//		for 문
//		int a = 2;
//		int b = 1;
//		b++;
//		System.out.println(String.format("a:%d, b:%d", a,b));
//		for(int i=b; i<15; i++) {
//			a=a+1;
//			b=b+1;
//			System.out.println(String.format("a:%d, b:%d", a,b));
//		}
		
		
//		문제2)
//		for(int i=1; i<101; i++) {
//			for(int j=1; j<101; j++) {
//				if(i%j==0) {
//					System.out.println(String.format("%d는 %d의 약수", i,j));
//				}
//			}
//		}
		
		
//		문제3)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 수 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 수 입력 : ");
//		int b = Integer.parseInt(sc.nextLine());
//
//		for(int i=1; i<101; i++) {
//			if(i%a==0&&i%b==0) {
//				System.out.println(String.format("%d와 %d는 %d의 공통약수", a,b,i));
//			}
//		}
		
		
//		문제4)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 수 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 수 입력 : ");
//		int b = Integer.parseInt(sc.nextLine());
//		int max = 0;
//		int i = 0;
//		for(i=1; i<101; i++) {
//			if(i%a==0&&i%b==0) {
//				max = i;
//			}
//		}
//		System.out.println(String.format("%d은(는) %d와 %d의 최대공약수", max,a,b));
		
		
//		문제5)
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		while(sum<=100) {
//			int a = Integer.parseInt(sc.nextLine());
//			sum +=a;
//		}
//		System.out.println(sum);
		
		
//		문제6)
//		Scanner sc = new Scanner(System.in);
//		int t = 0;
//		int f = 0;
//		int sum = 0;
//		for(t=0; t<3;){
//			System.out.print("10이하의 수 입력 : ");
//			int a = Integer.parseInt(sc.nextLine());
//			if(0<a&&a<=10) {
//				sum+=a;
//				t++;
//			}else {
//				f++;
//				System.out.println("10이하의 수가 아닙니다.");
//			}
//		}
//		System.out.println(String.format("맞은 횟수:%d, 틀린 횟수:%d, 맞은 수 총합:%d", t,f,sum));

		
//		문제7)
//		Scanner sc = new Scanner(System.in);
//		int a = Integer.parseInt(sc.nextLine());
//		int b = Integer.parseInt(sc.nextLine());
//		 
//		for(int i=1; i<101; i++) {
//			if(i%a==0&&i%b==0) {
//				System.out.println("최소공배수 : " + i);
//				break;
//			}
//		}
		
		
//		문제8)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 수 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("두번째 수 : ");
//		int b = Integer.parseInt(sc.nextLine());
//		System.out.print("세번째 수 : ");
//		int c = Integer.parseInt(sc.nextLine());
//		int d = 0;
//
//		if(a<b) {
//			if(b<c) {
//			}else if(a<c) {
//				d = b;
//				b = c;
//				c = d;
//			}
//		}
//		if(b<a) {
//			if(a<c) {
//				d = a;
//				a = b;
//				b = d;
//			}else if(b<c) {
//				d = a;
//				a = b;
//				b = c;
//				c = d;
//			}
//		}
//		if(c<b) {
//			if(b<a) {
//				d = a;
//				a = c;
//				c = d;
//			}else if(c<a) {
//				d = a;
//				a = c;
//				c = b;
//				b = d;
//			}
//		}
//		System.out.println(String.format("가장 작은 수 : %d\n가장 큰 수 : %d", a,c));

		
//		문제9)
//		Scanner sc = new Scanner(System.in);
//		int i = 0;
//		int p = 0;
//		
//		for(i=0; i<5; i++) {
//			System.out.print("수학 점수 입력 : ");
//			int math = Integer.parseInt(sc.nextLine());
//			
//			if(math<=60) {
//				p++;
//			}
//		}
//		System.out.println("탈락자 : "+p+" 명");
		
		
//		문제10)
//		int i = 0;
//		int sum = 0;
//		for(i=1; sum<101-i; i++) {
//			sum += i;
//		}
//		System.out.println(String.format("%d : %d", i, sum));
		
		
//		문제11)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열 입력 : ");
//		String a = sc.nextLine();
//		System.out.print("숫자 입력 : ");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		for(int i=1; i<=b; i++) {
//			System.out.println(a);
//		}
		
		
//		문자12)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 수 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("두번째 수 입력 : ");
//		int b = Integer.parseInt(sc.nextLine());
//		int sum = 0;
//		
//		if(a>b) {
//			for(int i=b; i<=a; i++) {
//				sum+=i;
//			}
//			System.out.println(sum);
//		}else {
//			for(int i=a; i<=b; i++) {
//				sum+=i;
//			}
//			System.out.println(sum);
//		}
		
		
		
//		문제13)
//		Scanner sc = new Scanner(System.in);
//
//		int num = 0;
//		boolean isPrime = false;
//		num = Integer.parseInt(sc.nextLine());
//
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				isPrime = true;
//				break;
//			}
//		}
//
//		if (isPrime) {
//			System.out.println(num + "은(는) 소수가 아닙니다.");
//		} else {
//			System.out.println(num + "은(는) 소수입니다.");
//		}
		
		
	
//		문제14)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 수 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("두번째 수 : ");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		for(int i=a; i<=b; i++) {
//			System.out.println(i);
//		}
		
		
//		문제15)
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("종료 입력 전까지 반복");
//			String a = sc.nextLine();
//			if(a.equals("종료")) {
//				System.out.println("종료됨");
//				break;
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		for(;;) {
//			System.out.println("종료 입력 전까지 반복");
//			String a = sc.nextLine();
//			if(a.equals("종료")) {
//				System.out.println("종료됨");
//				break;
//			}
//		}
			
			
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("종료 입력 전까지 반복");
//			String a = sc.nextLine();
//			if(a.equals("종료")) {
//				System.out.println("종료됨");
//				break;
//			}
//		}while(true);
			
		
		
//		문제16)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("찾을 단 수 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		for(int i=1; i<10; i++) {
//			System.out.println(String.format("%d * %d : %d", a, i, a*i));
//		}

		
		
//		문제17)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		int num = 0;
//		for(int i=1; i<1001; i++) {
//			if(i%a==0) {
//				num++;
//			}
//		}
//		System.out.println(String.format("%d의 배수 갯수는 : %d", a, num));
		
		
		
//		문제18)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("행의 수 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("열의 수 : ");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		for (int i=1; i<101; i++) {
//			System.out.print(i + " ");
//			if(i%a==0) {
//				System.out.println();
//			}
//			if(a*b==i) {
//				break;
//			}
//		}
		
		
//		문제19)
//		Scanner sc = new Scanner(System.in);
//		int com = 0;
//		int t = 0;
//		int f = 0;
//		
//		for(t=0; t<3;) {
//			com = (int) (Math.random()*2);
//			System.out.print("앞면이면 0 뒷면이면 1 입력 : ");
//			int a = Integer.parseInt(sc.nextLine());
//			if(com==a) {
//				t++;
//				System.out.println("맞췄습니다.");
//			}else {
//				f++;
//				System.out.println("틀렸습니다.");
//			}
//		}
//		System.out.println(String.format("맞춘 횟수 : %d, 틀린 횟수 : %d", t,f));
		
		
		
//		문제20)
//		int com = (int) (Math.random()*6+1);
//		
//		Scanner sc = new Scanner(System.in);
//		int t = 0;
//		int f = 0;
//		
//		for(t=0; t<10;) {
//			System.out.print("주사위 수는 몇일까요? : ");
//			int a = Integer.parseInt(sc.nextLine());
//			if(com==a) {
//				t++;
//			}else {
//				f++;
//			}
//		}
//		System.out.println(String.format("맞춘 횟수 : %d, 틀린 횟수 : %d", t,f));

		
		
	}

}
