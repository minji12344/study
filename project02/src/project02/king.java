package project02;

import java.util.Scanner;

public class king {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cardGame = {"거지", "시민", "귀족", "왕"};
		int[] arr = new int[4];
		
		int score1 = 0;
		int score2 = 0;
		int hr1 = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i=0; i<4; i++) {
			System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
			System.out.println("플레이어 1 차례 : ");
			int player1 = sc.nextInt();
			int computer = rand(arr);		
			arr[i] = computer;
			System.out.println("컴퓨터 : " + computer);
			
			if((player1 == 1 && computer == 4) || (player1 == 4 && computer == 1)) {
				System.out.println("노예와 왕이 만났습니다!");
				if(player1 == 1) {
					score1 += 4;
					hr1 = 1;
				} else {
					score2 += 4;
					hr1 = 2;
				}
				break;
			}
			else if(player1 > computer) {
				score1++;
			} else if(computer > player1) {
				score2++;
			}
		}
		
		if(hr1 == 1) {
			System.out.println("Player 1이 히든 룰로 승리하였습니다.");
		}
		else if(hr1 == 2) {
			System.out.println("컴퓨터가 히든 룰로 승리하였습니다.");
		}
		else if(score1 > score2) {
			System.out.println("Player 1이 승리하였습니다.");
		} else if(score1 < score2) {
			System.out.println("컴퓨터가 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
		
	}
	
	public static int rand(int[] arr) {
		int computer = (int)(Math.random()*4+1);
		
		for(int k = 0; k < arr.length; k++) {
			 System.out.println("arr [ " + k +"] = " + arr[k]);
			if(arr[k] == computer) {
				computer = (int)(Math.random()*4+1);
				k = -1; // k = 0; 문제의 원인 -> k++ 1번째 검사를 한다.
				continue;
			}
			else if(arr[k] == 0) {
				break;
			}
		}
		
		return computer;
	}
}
