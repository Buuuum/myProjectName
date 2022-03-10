package com.human.dto;

public class TreeEx {

	public static void main(String[] args) {

//		Tree mango = new Tree();
//		mango.name = "Mango";
//		mango.price = 200;
//		mango.growTime = 4;
//		mango.difficulty = 4;
//		mango.amount = 7;
//		mango.maxAmount = 50;
//		mango.owner.name = "홍길동";
//		mango.owner.age = 32;
//		mango.owner.PhoneNum = "010-2345-1658";
//
//		mango.treeInfo();
//		mango.owner.ownerInfo();
		
//		System.out.println("나무이름 : " + mango.name);
//		System.out.println("가격 : " + mango.price + "원");
//		System.out.println("키운 시간 : " + mango.growTime + "h");
//		System.out.println("난이도 : " + mango.difficulty);
//		System.out.println("그루 수 : " + mango.amount);
//		System.out.println("최대 그루 수 : " + mango.maxAmount);
//		System.out.println("주인 이름 : " + mango.owner.name);
//		System.out.println("주인 나이 : " + mango.owner.age + "세");
//		System.out.println("주인 번호 : " + mango.owner.PhoneNum);
//		System.out.println();

		
//		Tree papaya = new Tree();
//		papaya.name = "Papaya";
//		papaya.price = 375;
//		papaya.growTime = 6;
//		papaya.difficulty = 6;
//		papaya.amount = 6;
//		papaya.maxAmount = 50;
//		papaya.owner.name = "김철수";
//		papaya.owner.age = 27;
//		papaya.owner.PhoneNum = "010-4313-4864";
//		
//		papaya.treeInfo();
//		papaya.owner.ownerInfo();
		
//		System.out.println("나무이름 : " + papaya.name);
//		System.out.println("가격 : " + papaya.price + "원");
//		System.out.println("키운 시간 : " + papaya.growTime + "h");
//		System.out.println("난이도 : " + papaya.difficulty);
//		System.out.println("그루 수 : " + papaya.amount);
//		System.out.println("최대 그루 수 : " + papaya.maxAmount);
//		System.out.println("주인 이름 : " + papaya.owner.name);
//		System.out.println("주인 나이 : " + papaya.owner.age + "세");
//		System.out.println("주인 번호 : " + papaya.owner.PhoneNum);
//		System.out.println();

//		Tree bananaPalm = new Tree();
//		bananaPalm.name = "Banana Palm";
//		bananaPalm.price = 500;
//		bananaPalm.growTime = 5;
//		bananaPalm.difficulty = 5;
//		bananaPalm.amount = 7;
//		bananaPalm.maxAmount = 50;
//		bananaPalm.owner.name = "신짱구";
//		bananaPalm.owner.age = 20;
//		bananaPalm.owner.PhoneNum = "010-0488-3485";
//		
//		bananaPalm.treeInfo();
//		bananaPalm.owner.ownerInfo();

//		System.out.println("나무이름 : " + bananaPalm.name);
//		System.out.println("가격 : " + bananaPalm.price + "원");
//		System.out.println("키운 시간 : " + bananaPalm.growTime + "h");
//		System.out.println("난이도 : " + bananaPalm.difficulty);
//		System.out.println("그루 수 : " + bananaPalm.amount);
//		System.out.println("최대 그루 수 : " + bananaPalm.maxAmount);
//		System.out.println("주인 이름 : " + bananaPalm.owner.name);
//		System.out.println("주인 나이 : " + bananaPalm.owner.age + "세");
//		System.out.println("주인 번호 : " + bananaPalm.owner.PhoneNum);
//		System.out.println();

		
//		Tree lemon = new Tree();
//		lemon.name = "Lemon";
//		lemon.price = 750;
//		lemon.growTime = 8;
//		lemon.difficulty = 8;
//		lemon.amount = 1;
//		lemon.maxAmount = 50;
//		lemon.owner.name = "이석훈";
//		lemon.owner.age = 35;
//		lemon.owner.PhoneNum = "010-7455-9615";
//		
//		lemon.treeInfo();
//		lemon.owner.ownerInfo();
		
//		System.out.println("나무 이름 : " + lemon.name);
//		System.out.println("가격 : " + lemon.price + "원");
//		System.out.println("키운 시간 : " + lemon.growTime + "h");
//		System.out.println("난이도 : " + lemon.difficulty);
//		System.out.println("그루 수 : " + lemon.amount);
//		System.out.println("최대 그루 수 : " + lemon.maxAmount);
//		System.out.println("주인 이름 : " + lemon.owner.name);
//		System.out.println("주인 나이 : " + lemon.owner.age + "세");
//		System.out.println("주인 번호 : " + lemon.owner.PhoneNum);
//		System.out.println();

		
		
		Tree mango = new Tree("Mango", 200, 4, 4, 7, 50, "홍길동", 32, "010-2345-1658");
		System.out.println(mango);
		System.out.println(mango.owner);
		
		Tree papaya = new Tree("Papaya", 375, 6, 6, 6, 50, "김철수", 27, "010-4313-4864");
		System.out.println(papaya);
		System.out.println(papaya.owner);
		
		Tree bananaPalm = new Tree("Banana Palm", 500, 5, 5, 7, 50, "신짱구", 20, "010-0488-3485");
		System.out.println(bananaPalm);
		System.out.println(bananaPalm.owner);
		
		Tree lemon = new Tree("Lemon", 750, 8, 8, 1, 50, "이석훈", 35, "010-7455-9615");
		System.out.println(lemon);
		System.out.println(lemon.owner);
	}
}
