package practice;

import java.util.Scanner;

public class Array_Practice {

	
	public static void main(String[] args) {
		
		String[] names = new String[3];
		int size = names.length;

		Scanner put = new Scanner(System.in);

		for(int i=0; i<size; i++){
			System.out.print("이름을 입력하세요. ");
			names[i] = put.next();            
		}

		for(int i=0; i<size; i++){

			System.out.println("이름: " +names[i]);
		}
	}
}
