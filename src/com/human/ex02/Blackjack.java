package com.human.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Blackjack {

	private static int p1DeckIndeck;
	private static int[] p1Deck;
	private static String[] cardNumber;
	private static String[] cardshape;
	private static int p2DeckIndeck;
	private static int[] p2Deck;
	
	
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
		int p1DeckIndeck = 0;
		int p2DeckIndeck = 0;


//		p1Deck[p1DeckIndeck++] = deck[deckIndex++];
//		p2Deck[p2DeckIndeck++] = deck[deckIndex++];
//
		
		Scanner sc = new Scanner(System.in);
		boolean isP1PlayFlag = true;
		boolean isP2PlayFlag = true;
	
		while((isP1PlayFlag||isP2PlayFlag)&&p1DeckIndeck<p1Deck.length&&p2DeckIndeck<p2Deck.length) {
			if(isP1PlayFlag) {
				System.out.print("\np1 카드를 받으시겠습니까?(1.yes 2.no) : ");
				String input = sc.nextLine();
				if(input.equals("1")) {
					p1Deck[p1DeckIndeck++] = deck[deckIndex++];
				displayP1Deck();
				}else {
					System.out.println("p1 카드 받기 종료\n");
					isP1PlayFlag = false;
				}
			}
			if(isP2PlayFlag) {
				System.out.print("\np2 카드를 받으시겠습니까?(1.yes 2.no) : ");
				String input = sc.nextLine();
				if(input.equals("1")) {
					p2Deck[p2DeckIndeck++] = deck[deckIndex++];
					displayP2Deck();
				}else {
					System.out.println("p2 카드 받기 종료\n");
					isP2PlayFlag = false;
				}
			}
			if(!isP1PlayFlag&&!isP2PlayFlag) {
				System.out.println("p1");
				for(int i=0; i<p1DeckIndeck; i++) {
					System.out.println("Deck["+i+"] : " + cardshape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]);
				}

				System.out.println("p2");
				for(int i=0; i<p2DeckIndeck; i++) {
					System.out.println("Deck["+i+"] : " + cardshape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]);
				}
			}
		}
		
		
		
		
		

		
		
		
	}
	
	
	static void displayP1Deck(){
		System.out.println("p1");
		for(int i=0; i<p1DeckIndeck; i++) {
			System.out.println("Deck["+i+"] : " + cardshape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]);
		}
	}
	
	static void displayP2Deck(){
		System.out.println("p2");
		for(int i=0; i<p2DeckIndeck; i++) {
			System.out.println("Deck["+i+"] : " + cardshape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]);
		}
	}
	
	static void p1Score() {
		
	}
}
