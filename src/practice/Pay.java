package practice;

public class Pay {

	public static void printPay(double basePay, int hours) {
		
		if(hours>60) {
			System.out.println("ERROR : 제한 근무시간 초과.");
		}else if(hours>40) {
			double more = 0;
			more = (hours-40)*basePay*1.5;
			System.out.println("$ "+((basePay*(hours-(hours-40)))+more));
		}else if(basePay<8.00) {
			System.out.println("ERROR : 최저시급 불이행");
		}else {		
			System.out.println("$ "+(basePay*hours));
		}
	}
	
	public static void main(String[] args) {
		printPay(7.30, 35);
		printPay(8.20, 47);
		printPay(10.00, 73);
	}
}
