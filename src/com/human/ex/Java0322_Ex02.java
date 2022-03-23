package com.human.ex;

public class Java0322_Ex02 {
	
	public static void main(String[] args) {
		
		
//		문제1)
//		for(int i=3; i<=5; i++) {
//			for(int j=6; j<=8; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
//		
//		for(int i=1; i<=3; i++) {
//			for(int j=4; j<=8; j++) {
//				if(j%2==0) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//			}
//		}
//		
//		for(int i=2; i<=6; i++) {
//			if(i%2==0) {
//				for(int j=1; j<=3; j++) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//			}
//		}
		
		
		
//		문제2-1)	
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i+"*"+j+"="+i*j);
//				if(!(i*j/10==0)) {
//					System.out.print(" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		문제2-2)
//		for(int i=1; i<=9; i++) {
//			System.out.println(i+"단");
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
		
		
//		문제2-3)
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=3; j++) {
//				System.out.print(j+"*"+i+"="+j*i+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i=1; i<=9; i++) {
//			for(int j=4; j<=6; j++) {
//				System.out.print(j+"*"+i+"="+j*i+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i=1; i<=9; i++) {
//			for(int j=7; j<=9; j++) {
//				System.out.print(j+"*"+i+"="+j*i+" ");
//			}
//			System.out.println();
//		}
	
		
		
		
		
//		1)
		
//		for(int i=1; i<=7; i++) {
//			for(int j=1; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1; i<=7; i++) {
//			for(int j=1; j<=7-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1; i<=7; i++) {
//			for(int j=1; j<=7-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
//		2)
		
//		Q1)
//		for(int i=0; i<5; i++) {
//			System.out.print("*");
//		}
		
//		Q2)
//		for(int i=0; i<5; i++) {
//			System.out.println("*");
//		}
		
//		Q3)
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q4)
//		for(int i=1; i<6; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		Q5)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<6; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		Q6)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<6; j++) {
//					System.out.print(j+i);
//			}
//			System.out.println();
//		}
		
		
//		Q7)
//		for(int i=0; i<5; i++) {
//			for(int j=5; j<10; j++) {
//					System.out.print(j-i);
//			}
//			System.out.println();
//		}		
		
//		Q8)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<=i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q9)
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q10)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<i+1; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<5-i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q11)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q12)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<=i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q13)
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<5; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q14)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<i+1; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<5-i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q15)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<i+1; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<5-i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q16)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=i*2; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q17)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<i+1; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<9-(i*2); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Q18)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=i*2; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//			for(int i=1; i<5; i++) {
//				for(int j=1; j<i+1; j++) {
//					System.out.print(" ");
//				}
//				for(int k=0; k<9-(i*2); k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		
//		Q19)
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5-i; j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j<(i*2)+1; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<5; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j<9-(i*2); j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		Q20)
//		for(int i=1; i<6; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			for(int j=1; j<12-(i*2); j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<6; i++) {
//			for(int j=1; j<6-i; j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j<(i*2)+1; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<6-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		
		
//		Q21)
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<i+1; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<10-(i*2); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i*2; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}
}
