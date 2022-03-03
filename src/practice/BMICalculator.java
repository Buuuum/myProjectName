package practice;

import java.util.Scanner;

public class BMICalculator {

	public static double calculateBMI(double weight, double tall) {
		double a = weight/(tall*tall) ; 
		return a;
	}
	public static void printBMIClassification(double bmi) {
		System.out.println((float)bmi);
		if(bmi>24.9) {
			System.out.println("비만");
		}else if(bmi>22.9){
			System.out.println("과체중");
		}else if(bmi>18.5) {
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		double tall = input.nextDouble();
		// BMI 지수 계산
		double bmi = calculateBMI(weight, tall);
		// BMI 지수를 입력하여 비만도 결과 출력
		printBMIClassification(bmi);
	}
}
