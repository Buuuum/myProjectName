package com.human.dto;

public class Owner {
	
	public String name;
	public int age;
	public String PhoneNum;

	
	void ownerInfo() {
		System.out.println("주인 이름 : " + name + "\n주인 나이 : " + age + "세\n주인 전화번호 : " + PhoneNum + "\n");
	}
}
