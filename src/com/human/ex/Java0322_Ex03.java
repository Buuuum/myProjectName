package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Java0322_Ex03 {

	public static void main(String[] args) {


		//		문제1)
		//		for(int i=1; i<=50; i++) {
		//			if(i%2==0) {
		//				System.out.println(i);
		//			}
		//		}



		//		문제2)
		//		for(int i=1; i<=100; i++) {
		//			if(i%10==0) {
		//				System.out.println(i);
		//			}
		//		}



		//		문제3)
		//		int sum = 0;
		//		for(int i=30; i<=300; i++) {
		//			if(i%6==0) {
		//				sum += i;
		//			}
		//		}
		//		System.out.println(sum);



		//		문제4)
		//		int a = Integer.parseInt(new Scanner(System.in).nextLine());
		//		for(int i=1; i<=a; i++) {
		//			System.out.println(i);
		//		}



		//		문제5)
		//		Scanner sc = new Scanner(System.in);
		//		int a = Integer.parseInt(sc.nextLine());
		//		int b = Integer.parseInt(sc.nextLine());
		//		
		//		if(a>b) {
		//			for(int i=b; i<=a; i++) {
		//				System.out.println(i);
		//			}
		//		}else {
		//			for(int i=a; i<=b; i++) {
		//				System.out.println(i);
		//			}
		//		}



		//		문제6)
		//		Scanner sc = new Scanner(System.in);
		//		int a = Integer.parseInt(sc.nextLine());
		//		int b = Integer.parseInt(sc.nextLine());
		//		
		//		if(a>b) {
		//			for(int i=b; i<=a; i++) {
		//				if(i%2==0) {
		//					System.out.println(i);
		//				}
		//			}
		//		}else {
		//			for(int i=a; i<=b; i++) {
		//				if(i%2==0) {
		//					System.out.println(i);
		//				}
		//			}
		//		}



		//		문제7)
		//		int sum = 0;
		//		for(int i=1; i<=100; i++) {
		//			if(i%2==0) {
		//				sum-=i;
		//			}else {
		//				sum+=i;
		//			}
		//		}
		//		System.out.println(sum);



		//		문제8)
		//		double result = 0;
		//		for(double i=1; i<100; i++) {
		//			result += i/(i+1);
		//		}
		//		System.out.println(result);



		//		문제9)
		//		int a = 0;
		//		int b = 1;
		//		int temp = 1;
		//		for(int i=0; i<10; i++) {
		//			System.out.print(temp+" ");
		//			temp = a+b;
		//			a = b;
		//			b = temp;
		//		}



		//		문제10)
		//		Scanner sc = new Scanner(System.in);
		//		
		//		String color = "빨강";
		//		int brightness = 50;
		//		int menu = 1;
		//		
		//		while(!(menu==0)) {
		//			System.out.println(String.format("현재 색상은 %s이고 밝기는 %d입니다.", color, brightness));
		//			System.out.print("색상 변경:1, 밝기 변경:2, 종료:0");
		//			menu = Integer.parseInt(sc.nextLine());
		//
		//			switch(menu) {
		//			case 1:
		//				System.out.print("어떤 색상으로 변경하시겠습니까?(빨강,노랑,파랑) : ");
		//				String colorInput = sc.nextLine();
		//				if(colorInput.equals("빨강")) {
		//					color = "빨강";
		//					System.out.println("색상이 빨강으로 변경되었습니다.");
		//				}else if(colorInput.equals("노랑")) {
		//					color = "노랑";
		//					System.out.println("색상이 노랑으로 변경되었습니다.");
		//				}else if(colorInput.equals("파랑")) {
		//					color = "파랑";
		//					System.out.println("색상이 파랑으로 변경되었습니다.");
		//				}else {
		//					System.out.println("잘못 입력하셨습니다.");
		//				}
		//				break;
		//			case 2:
		//				System.out.print("밝기 올림:1, 밝기 내림:2 : ");
		//				int brightnessInput = Integer.parseInt(sc.nextLine());
		//				if(brightnessInput==1) {
		//					if(brightness>100) {
		//						System.out.println("밝기가 최대입니다.");
		//					}else {
		//						System.out.println("밝기를 올립니다.");
		//						brightness+=1;
		//					}
		//				}else if(brightnessInput==2) {
		//					if(brightness<=0) {
		//						System.out.println("밝기를 더 내릴 수 없습니다.");
		//					}else {
		//						System.out.println("밝기를 내립니다");
		//						brightness-=1;
		//					}
		//				}else {
		//					System.out.println("잘못 입력하셨습니다.");
		//				}
		//				break;
		//			case 0:
		//				System.out.println("종료합니다.");
		//				break;
		//				default:
		//					System.out.println("잘못 입력하셨습니다.");
		//			}
		//		}


		//		문제11)
		//		int sum = 0;
		//		for(int i=1; i<=100; i++) {
		//			if(i%2==0) {
		//				sum-=i;
		//			}else {
		//				sum+=i;
		//			}
		//		}
		//		System.out.println(sum);



		//		문제12)
		//		double result = 0;
		//		for(double i=1; i<100; i++) {
		//			result += i/(i+1);
		//		}
		//		System.out.println(result);



		//		문제13)
		//		for(int i=1; i<=25;) {
		//			for(int j = 1; j <= 5; j++) {
		//				System.out.printf("%2d ", i);
		//				i++;
		//			} 
		//			i += 4;
		//			if(i>25) {
		//				break;
		//			}
		//			System.out.println();
		//			for(int j = 5; j > 0; j--) {
		//				System.out.printf("%2d ", i);
		//				--i;
		//			}
		//			i += 6;
		//			System.out.println();
		//		}



		//		문제14)
		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("월:1 화:2 수:3 목:4 금:5 토:6 일:7");
		//		System.out.print("달의 시작 요일 입력 : ");
		//		int month = Integer.parseInt(sc.nextLine());
		//		System.out.print("일 수 : ");
		//		int day = Integer.parseInt(sc.nextLine());
		//		int a = 7;
		//		System.out.println("월\t화\t수\t목\t금\t토\t일");
		//		for(int i=1; i<=day; i++) {
		//			for(int j=1; j<month;j++) {
		//				if(i==1) {
		//					System.out.print("\t");
		//				}
		//			}
		//			System.out.print(i+"\t");
		//			if(i==a-month+1) {
		//				System.out.println();
		//				a+=7;
		//			}
		//		}


		
		//		문제15)
//		Scanner sc = new Scanner(System.in);
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		int[] arr2 = new int[9];
//
//		System.out.print("이동 방향은?(왼쪽/오른쪽) : ");
//		String move = sc.nextLine();
//		System.out.print("이동 칸 수는? : ");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.print("채울 숫자는? : ");
//		int num2 = Integer.parseInt(sc.nextLine());
//
//		if(move.equals("왼쪽")) {
//			for(int i=0; i<arr.length-num1; i++) {
//				arr2[i] = arr[i+num1];
//			}
//			for(int i=0; i<num1; i++) {
//				arr2[i+arr.length-num1] = num2;
//			}
//			System.out.println(Arrays.toString(arr2));
//		}else if(move.equals("오른쪽")) {
//			for(int i=0; i<num1; i++) {
//				arr2[i] = num2;
//			}
//			for(int i=0; i<arr.length-num1; i++) {
//				arr2[i+num1] = arr[i];
//			}
//			System.out.println(Arrays.toString(arr2));
//		}else {
//			System.out.println("잘못 입력");
//		}

		

		//		문제16)
//		Scanner sc = new Scanner(System.in);
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		int[] arr2 = new int[9];
//
//		System.out.print("회전 방향은?(왼쪽/오른쪽) : ");
//		String move = sc.nextLine();
//		System.out.print("회전 횟수는? : ");
//		int num = Integer.parseInt(sc.nextLine());
//
//		if(move.equals("왼쪽")) {
//			for(int i=0; i<arr.length-num; i++) {
//				arr2[i] = arr[i+num];
//			}
//			for(int i=0; i<num; i++) {
//				arr2[i+arr.length-num] = arr[i];
//			}
//			System.out.println(Arrays.toString(arr2));
//		}else if(move.equals("오른쪽")) {
//			for(int i=0; i<num; i++) {
//				arr2[i] = arr[i+arr.length-num];
//			}
//			for(int i=0; i<arr.length-num; i++) {
//				arr2[i+num] = arr[i];
//			}
//			System.out.println(Arrays.toString(arr2));
//		}else {
//			System.out.println("잘못 입력");
//		}
		
		
		
//		문제17)
		int[] arr = new int[100];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		for(int i=2; i<=50; i++) {
			for(int j=i+1; i<arr.length; i++) {
				if(j%i==0) {
					arr[i] = 0;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(!(arr[i]==0)) {
				System.out.print(arr[i]+" ");
			}
		}
		


	}
}
