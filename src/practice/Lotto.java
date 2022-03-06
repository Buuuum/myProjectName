package practice;

import java.util.Arrays;

public class Lotto {

	public static int generateNumber() {
		return (int)(Math.random() * 45) + 1;
	}


	public static void main(String[] args) {

		int[] pickNumbers = new int[6];

		for(int i = 0; i < pickNumbers.length; i++) {
			pickNumbers[i] = generateNumber();
		}

//		for(int n : pickNumbers)
//			System.out.printf("%d ", n);
		
		boolean[] isPicked = new boolean[46];
		int[] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
		    // 임시번호 생성
		    int tempNum = generateNumber();
		    // 중복된 수가 아니라면
		    if (isPicked[tempNum] == false) {
		        // 뽑았다고 체크
		        isPicked[tempNum] = true;
		        numbers[i] = tempNum;
		    }
		}
		Arrays.sort(numbers);
		for (int n : numbers)
		    System.out.printf("%d ", n);
	
		for (int i = 0; i < numbers.length; i++) {
		    // 무한 반복!
		    while (true) {
		        // 임시번호 생성
		        int tempNum = generateNumber();
		        // 중복된 수가 아니라면
		        if (isPicked[tempNum] == false) {
		            // 뽑았다고 체크
		            isPicked[tempNum] = true;
		            numbers[i] = tempNum;
		            // 가장 가까운 반복문 탈출!
		            break;
		        }
		    }
		}

		
	}
}
