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
//		for (int i=1; i<=9; i++) {
//			String stars = "";
//			int spaceWidth = 0;
//			int starWidth = 0;
//			if (i<5) {
//				int upperI = i-1;
//				starWidth = 5-upperI;
//				// 공백 1, 3, 5...
//				spaceWidth = 2*upperI;
//			} else {
//				int lowerI = i-4;
//				starWidth = lowerI;
//				spaceWidth = 10-2*lowerI;
//			}
//			// 왼쪽 별
//			for (int j=1; j<=starWidth; j++) {
//				stars += "*";
//			}
//			// 공백
//			for (int j=1;j<=spaceWidth+1; j++) {
//				stars += " ";
//			}
//			// 오른쪽 별
//			for (int j=1; j<=starWidth; j++) {
//				stars += "*";
//			}
//			System.out.println(stars);
//		}
		
		
		
		
//		Q20)
//		int i,j;
//		int sign=1;
//		for(i=1;i>0;i+=sign) {
//			for(j=0;j<5;j++) {
//				if(i>j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}	
//			}
//			System.out.print(" ");
//			for(j=0;j<5;j++) {
//				if(j<=4-i) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}				
//			}
//			System.out.println("");
//			if(i==5) {
//				sign=-1;
//			}
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
