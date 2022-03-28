package com.human.ex02;

public class Blackjack_Example {
	public static java.util.Scanner sc =

			new java.util.Scanner(System.in);

	public static int deck[] = new int[52];

	public static int p1Deck[] = new int[52];

	public static int p2Deck[] = new int[52];


	public static int deckIndex = 52;

	public static int p1DeckIndex = 0;

	public static int p2DeckIndex = 0;

	public static boolean isP1GEnd = false;

	public static boolean isP2GEnd = false;


	public static final String CARD_SHAPE[] =

			{ "스페이드", "다이아", "하트", "클로버" };

	public static final String CARD_NUMBER[] =

			{ "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };


	public static int p1Scoure = 0;

	public static int p2Scoure = 0;


	public static void main(String[] args) {

		for(int i=0;i<deck.length;i++) {

			deck[i]=i;

		}

		deckIndex=52;

		p1DeckIndex=0;

		p2DeckIndex=0;


		for(int i=0;i<10000;i++) {

			int randomIndex=(int)(Math.random()*52);

			int temp=deck[0];

			deck[0]=deck[randomIndex];

			deck[randomIndex]=temp;

		}

		//전체 카드

		// for(int i=0;i<deck.length;i++) {

		// System.out.println(deck[i]);//모든 deck안 카드의 고유번호 출력

		// System.out.println(CARD_SHAPE[deck[i]/13]);//모든 deck안 카드의 모양출력

		// System.out.println(CARD_NUMBER[deck[i]%13]);////모든 deck안 카드의 숫자출력

		// System.out.println("--------------------");////모든 deck안 카드의 숫자출력

		// }


		//p1카드 얻기

		p1Deck[p1DeckIndex]=deck[deckIndex-1];

		deckIndex--;

		p1DeckIndex++;


		p1Deck[p1DeckIndex]=deck[deckIndex-1];

		deckIndex--;

		p1DeckIndex++;

		p1Deck[p1DeckIndex]=deck[deckIndex-1];

		deckIndex--;

		p1DeckIndex++;

		p1Deck[p1DeckIndex]=deck[deckIndex-1];

		deckIndex--;

		p1DeckIndex++;

		// p1카드 출력

		System.out.println("p1출력");

		for(int i=0;i<p1DeckIndex;i++) {

			System.out.println(CARD_SHAPE[p1Deck[i]/13]+":"+CARD_NUMBER[p1Deck[i]%13]+" ");

		}


		//p2카드 얻기

		p2Deck[p2DeckIndex]=deck[deckIndex-1];

		deckIndex--;

		p2DeckIndex++;

		p2Deck[p2DeckIndex]=deck[deckIndex-1];

		deckIndex--;

		p2DeckIndex++;


		p2Deck[p2DeckIndex]=deck[deckIndex-1];

		deckIndex--;

		p2DeckIndex++;


		p2Deck[p2DeckIndex]=deck[deckIndex-1];

		deckIndex--;

		p2DeckIndex++;

		// p2카드 출력

		System.out.println("p2출력");

		for(int i=0;i<p2DeckIndex;i++) {

			System.out.println(CARD_SHAPE[p2Deck[i]/13]+":"+CARD_NUMBER[p2Deck[i]%13]+" ");

		}


		//p1점수계산

		//A 1 or 11

		//2~10까지는 2~10

		//10초과는 10

		for(int i=0;i<p1DeckIndex;i++) {

			if(p1Deck[i]%13==0) {

				p1Scoure+=11;//일단 A를 11으로 놓고 계산함

			}else if(p1Deck[i]%13<10) {//A~10

				p1Scoure+=p1Deck[i]%13+1;

			}else {

				p1Scoure+=10;

			} 

		}


		for(int i=0;p1Scoure>21;i++) {

			if(p1Deck[i]==0) {

				p1Scoure=p1Scoure-10;

			} 

		}

		//p2점수 계산


		for(int i=0;i<p2DeckIndex;i++) {

			if(p2Deck[i]%13==0) {

				p2Scoure+=11;//일단 A를 11으로 놓고 계산함

			}else if(p2Deck[i]%13<10) {//A~10

				p2Scoure+=p2Deck[i]%13+1;

			}else {

				p2Scoure+=10;

			} 

		}

		for(int i=0;p2Scoure>21;i++) {

			if(p2Deck[i]==0) {

				p2Scoure=p2Scoure-10;

			} 

		}

		String result="";

		if(p1Scoure>21) {

			result="p2Scoure 승리";

		}else if(p2Scoure>21) {

			result="p1Scoure 승리";

		}else if(p1Scoure>p2Scoure) {

			result="p1Scoure 승리";

		}else if(p1Scoure<p2Scoure) {

			result="p2Scoure 승리";

		}else {

			result="무승부";

		} 

		System.out.println(p1Scoure+":"+p2Scoure+":"+result);
	}
}
