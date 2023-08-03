package project04;

import java.util.Scanner;

public class Cardgame {

	public static void main(String[] args) {
		
		// 3. 카드게임 -> 객체화
		// 컴퓨터, 사람를 객체화한다. 컴퓨터VS컴퓨터, 컴퓨터VS사람, 사람VS사람
		Scanner scan = new Scanner(System.in);
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int play1 = 0;
		int play2 = 0;

		for (int i =0; i<=9; i++) {
			System.out.println("1,2,3,4,5,6,7,8,9,10");

			System.out.println("Play1 카드를 두 장을 고르세요");
			int card01 = scan.nextInt();
			int card02 = scan.nextInt();
			
			System.out.println("Play2 카드 두 장을 고르세요 ");
			int card03 = scan.nextInt();
			int card04 = scan.nextInt();
			
			
			if(card01 < 11 && card02 < 11 && card03 < 11 && card04 < 11) {
				
				play1 = card01 + card02;
				play1 = card03 + card04;
				
				if(play1>play2) {
					System.out.println("승리.");					
				}else if (play1<play2) {
					System.out.println("패배");
				}else {
					System.out.println("무승부 입니다.");
				}
			}else {
				break;
			}
			
			
			
			}
		}
			
		
	}


