package practice;

public class Calculator_Ex01 {

	static double pi = 3.14159;
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	
	
	
	public static void main(String[] args) {
		double result1 = 10*10*Calculator_Ex01.pi;
		double result2 = Calculator_Ex01.plus(10, 5);
		double result3 = Calculator_Ex01.minus(10, 5);
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
