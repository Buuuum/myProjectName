package com.human.dto;

public class Tree extends Owner{

	public String name;
	public int price;
	public int growTime;
	public int difficulty;
	public int amount;
	public int maxAmount;
	
	Owner owner = new Owner();
	
	
	
	public Tree(String name, int price, int growTime, int difficulty, int amount, int maxAmount, String ownerName, int age, String phoneNum) {
		super();
		this.name = name;
		this.price = price;
		this.growTime = growTime;
		this.difficulty = difficulty;
		this.amount = amount;
		this.maxAmount = maxAmount;
		this.ownerName = ownerName;
		this.age = age;
		this.phoneNum = phoneNum;
				
	}



	void treeInfo() {
		System.out.println("나무이름 : " + name + "\n가격 : " + price + "원" + "\n키운 시간 : " + growTime + "h" + "\n난이도 : " + difficulty + "\n그루 수 : " + amount + "\n최대 그루 수 : " + maxAmount +"\n");
	}
}
