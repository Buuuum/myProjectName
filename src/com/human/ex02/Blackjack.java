package com.human.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Blackjack {

	
	
	public static void main(String[] args) {

		String[] cardshape = {"하트","다이아","스페이드","클로버"};
		String[] cardNumber = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

		int[] deck = new int[52];
		for (int i=0; i<deck.length; i++) {
			deck[i] = i;
		}

		for(int i=0; i<10000; i++) {
			int randomIndex = (int) (Math.random()*52);
			int temp = deck[0];
			deck[0] = deck[randomIndex];
			deck[randomIndex] = temp;
		}

		//		for(int i=0;i<deck.length; i++) {
		//			System.out.println(deck[i]+" : "+cardshape[deck[i]/13]+" "+cardNumber[deck[i]%13]);
		//		}


		int deckIndex = 0;

		int[] p1Deck = new int[11];
		int[] p2Deck = new int[11];
		int p1DeckIndex = 0;
		int p2DeckIndex = 0;


//		p1Deck[p1DeckIndex++] = deck[deckIndex++];
//		p2Deck[p2DeckIndex++] = deck[deckIndex++];
//
		
		Scanner sc = new Scanner(System.in);
		boolean isP1PlayFlag = true;
		boolean isP2PlayFlag = true;
	
		while((isP1PlayFlag||isP2PlayFlag)&&p1DeckIndex<p1Deck.length&&p2DeckIndex<p2Deck.length) {
			if(isP1PlayFlag) {
				System.out.print("\np1 카드를 받으시겠습니까?(1.yes 2.no) : ");
				String input = sc.nextLine();
				if(input.equals("1")) {
					p1Deck[p1DeckIndex++] = deck[deckIndex++];
					System.out.println("p1");
					for(int i=0; i<p1DeckIndex; i++) {
						System.out.println("Deck["+i+"] : " + cardshape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]);
					}
				}else {
					System.out.println("p1 카드 받기 종료\n");
					isP1PlayFlag = false;
				}
			}
			if(isP2PlayFlag) {
				System.out.print("\np2 카드를 받으시겠습니까?(1.yes 2.no) : ");
				String input = sc.nextLine();
				if(input.equals("1")) {
					p2Deck[p2DeckIndex++] = deck[deckIndex++];
					System.out.println("p2");
					for(int i=0; i<p2DeckIndex; i++) {
						System.out.println("Deck["+i+"] : " + cardshape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]);
					}
				}else {
					System.out.println("p2 카드 받기 종료\n");
					isP2PlayFlag = false;
				}
			}
			if(!isP1PlayFlag&&!isP2PlayFlag) {
				System.out.println("p1");
				for(int i=0; i<p1DeckIndex; i++) {
					System.out.println("Deck["+i+"] : " + cardshape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]);
				}

				System.out.println("p2");
				for(int i=0; i<p2DeckIndex; i++) {
					System.out.println("Deck["+i+"] : " + cardshape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]);
				}
			}
		}
		
		
		
		
		

		
		
		
	}
	
	
//	static void p1Score() {
//		for(int i=0;i<p1DeckIndex;i++) {
//			if(p1Deck[i]%13==0) {
//				p1Scoure+=11;//일단 A를 11으로 놓고 계산함
//			}else if(p1Deck[i]%13<10) {//A~10
//				p1Scoure+=p1Deck[i]%13+1;
//			}else {
//				p1Scoure+=10;
//			} 
//		}
//	}
//	
//	static void p2Score() {
//		for(int i=0;i<p2DeckIndex;i++) {
//			if(p2Deck[i]%13==0) {
//				p2Scoure+=11;//일단 A를 11으로 놓고 계산함
//			}else if(p2Deck[i]%13<10) {//A~10
//				p2Scoure+=p2Deck[i]%13+1;
//			}else {
//				p2Scoure+=10;
//			} 
//		}
//	}
	
}
