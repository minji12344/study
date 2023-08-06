package Cardgame;

import java.util.Scanner;

public class Cardgame {

	public static void main(String[] args) {
		
		// 3. 카드게임 -> 객체화
		// 컴퓨터, 사람를 객체화한다. 컴퓨터VS컴퓨터, 컴퓨터VS사람, 사람VS사람
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int play1 = 0;
		int play2 = 0;
		int j = 0;

		for (int i =0; i<10; i++) {
//			System.out.println("[1,2,3,4,5,6,7,8,9,10]");
			for(j =0; j<10; j++){ 
				arr[j] = j+1;
			
				System.out.print(arr[j] +" ");
	//			continue;
				}
				System.out.println();
				System.out.println("Play1 카드를 두 장을 고르세요");
				int card01 = scan.nextInt();
				if(j==card01) {
					arr[j] = arr[j] - arr[card01];
				}
				System.out.println(arr[j-1]);
				if(card01 > 11) {
					System.out.println("잘못입력했습니다.");
					continue;
				}
				int card02 = scan.nextInt();
				if(card02 > 11) {
					System.out.println("잘못입력했습니다.");
					continue;
				}
				System.out.println("Play2 카드 두 장을 고르세요 ");
				int card03 = scan.nextInt();
				if(card03 > 11) {
					System.out.println("잘못입력했습니다.");
					continue;
				}
				int card04 = scan.nextInt();
				if(card04 > 11) {
					System.out.println("잘못입력했습니다.");
					continue;
				}
				
				play1 = card01 + card02;
				play2 = card03 + card04;
				
				if(play1>play2) {
					System.out.println("play1이 승리하였습니다.");					
				}else if (play1<play2) {
					System.out.println("play2이 승리하였습니다.");
				}else if(play1 == play2){
					System.out.println("무승부 입니다.");
				}
				}		
			}
	}