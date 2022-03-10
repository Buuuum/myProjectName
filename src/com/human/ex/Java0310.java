package com.human.ex;

import com.human.dto.Human2;

public class Java0310 {

	public static void main(String[] args) {
		
		
		Human2 h2 = new Human2();
		h2.age=10;
		System.out.println(h2.age);
		
		Human2 h3 = new Human2("홍길동", 24, 182);
		
		System.out.println("이름 : "+h3.name + "\n나이 : "+ h3.age +"\n키 : "+ h3.height);
		
	}
}
