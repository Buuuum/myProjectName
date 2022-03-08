package com.human.ex;

public class Java0308 {
	
	public static void main(String[] args) {
		
//		String str1 = "홍길동";
//		String str2 = String.format("이름 : %s", str1);
//		String str3 = "이름 : " + str1;
//		System.out.println(String.format("이름 : %s", str1));
//		System.out.println(str2);
//		System.out.println(str3);
		
		
		System.out.println(String.format(":%f:", 3.141592));
		System.out.println(String.format(":%+f:", 3.141592));
		System.out.println(String.format(":%10f:", 3.141592));
		System.out.println(String.format(":%10.3f:", 3.141592));
		System.out.println(String.format(":%-10.3f:", 3.141592));
		System.out.println(String.format(":%%f:", 3.141592));
		System.out.println(String.format(":%.2f:", 3.141592));
		
	}

}
