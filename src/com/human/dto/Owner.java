package com.human.dto;

public class Owner {
	
	public String ownerName;
	public int age;
	public String phoneNum;
	
	

	public Owner() {
	}
	
	public Owner(String name, int age, String phoneNum) {
		super();
		this.ownerName = name;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	
	void ownerInfo() {
		System.out.println("주인 이름 : " + ownerName + "\n주인 나이 : " + age + "세\n주인 전화번호 : " + phoneNum + "\n");
	}
}
