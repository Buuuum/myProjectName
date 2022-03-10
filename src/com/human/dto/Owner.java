package com.human.dto;

public class Owner {
	
	public String name;
	public int age;
	public String PhoneNum;

	
	void ownerInfo() {
		System.out.println("이름 : " + name + "\n나이 : " + age + "세\n전화번호 : " + PhoneNum + "\n");
	}
}
