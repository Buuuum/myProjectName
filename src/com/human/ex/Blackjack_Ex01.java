package com.human.ex;

import java.util.Scanner;

public class Blackjack_Ex01 {



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

		Scanner sc = new Scanner(System.in);
		boolean isP1PlayFlag = true;
		boolean isP2PlayFlag = true;
		int p1Score = 0;
		int p2Score = 0;
		
		while((isP1PlayFlag||isP2PlayFlag)&&p1DeckIndex<p1Deck.length&&p2DeckIndex<p2Deck.length) {
			if(isP1PlayFlag) {
				System.out.print("\np1 카드를 받으시겠습니까?(1.yes 2.no) : ");
				String input = sc.nextLine();
				if(input.equals("1")) {
					p1Deck[p1DeckIndex++] = deck[deckIndex++];
					System.out.println("p1");
					for(int i=0; i<p1DeckIndex; i++) {
						p1Score = 0;
						System.out.println("Deck["+i+"] : " + cardshape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]);
					}
					for(int i=0;i<p1DeckIndex;i++) {
						if(p1Deck[i]%13==0&&p1Score<11) {
							p2Score+=11;
						}else if(p1Deck[i]%13==0) {
							p1Score+=1;
						}else if(p1Deck[i]%13<10) {
							p1Score+=p1Deck[i]%13+1;
						}else {
							p1Score+=11;
						} 
						if(p1Score>21) {
							System.out.println("p1 점수 : " + p1Score);
							System.out.println("p1 패");
							break;	
						}
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
						p2Score = 0;
						System.out.println("Deck["+i+"] : " + cardshape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]);
					}
					for(int i=0;i<p2DeckIndex;i++) {
						if(p2Deck[i]%13==0&&p2Score<11) {
							p2Score+=11;
						}else if(p2Deck[i]%13==0) {
							p2Score+=1;
						}else if(p2Deck[i]%13<10) {
							p2Score+=p2Deck[i]%13+1;
						}else {
							p2Score+=11;
						} 
						if(p2Score>21) {
							System.out.println("p2 점수 : " + p2Score);
							System.out.println("p2 패");
							break;	
						}
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
				System.out.println("p1 점수 : " + p1Score);
				System.out.println("\np2");
				for(int i=0; i<p2DeckIndex; i++) {
					System.out.println("Deck["+i+"] : " + cardshape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]);
				}
				System.out.println("p2 점수 : " + p2Score);
				if(p1Score>21) {
					System.out.println("p1이 이겼습니다");
				}else if(p2Score>21) {
					System.out.println("p2가 이겼습니다.");
				}else if(p1Score>p2Score) {
					System.out.println("p1이 이겼습니다");
				}else if(p1Score<p2Score) {
					System.out.println("p2가 이겼습니다");
				}else {
					System.out.println("무승부");
				}
			}

		}




	}

}

