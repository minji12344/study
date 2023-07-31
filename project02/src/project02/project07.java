package project02;

import java.util.Scanner;

public class project07 {

	public static void main(String[] args) {
		//별만들기 -> 반복문
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j + i < 4) {					
					System.out.print(" ");
				}else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>j) {					
					System.out.print(" ");
				}else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
		
		
		//숫자모양 ->배열
		
		int[][] arr = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = 5*i+j+1;
			}
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[j][i] = 5*i+j+1;
			}
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i % 2 ==0) {					
					arr[i][j] = 5*i+j+1;
				}else {
					arr[i][j]=5*i-j+5;
				}
			}
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i % 2 ==0) {					
					arr[j][i] = 5*i+j+1;
				}else {
					arr[j][i]=5*i-j+5;
				}
			}
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//왕거지게임
		//{"노예"<"시민"<"귀족"<"왕"}
		// 계급 순으로 승패가 갈린다.
		// 거지와 왕이 만나면 거지를 낸 플레이어가 게임에서 승리한다.
		
		String[] cardGame = {"노예","시민","귀족","왕"};// new String[4];
		Scanner sc = new Scanner(System.in);
		int score1 = 0;
		int score2 = 0;

		for(int i=0;i<4;i++) {
			System.out.println("카드 : {1.노예, 2.시민, 3.귀족, 4.왕}");
			System.out.print("플레이어 1 : ");
			int player1 = sc.nextInt();
			System.out.print("플레이어 2 : ");
			int player2 = sc.nextInt();
			
			if((player1 ==1 && player2 ==4) || (player1 ==4 && player2 ==1)){
				System.out.println("노예와 왕이 만났습니다.");
				if(player1 ==1) {
					score1 += 4;
				}else {
					score2 +=4;
				}
				break;
			}
			else if(player1>player2) {
				score1++;
			}else if(player2>player1) {
				score2++;
			}
			
			
			if(score1 > score2) {
				System.out.println("player 1 이 승리하였습니다.");
			}else if(score1 < score2) {
				System.out.println("player 2가 승리하였습니다.");
			}else {
				System.out.println("무승부입니다.");
			}
		}
		
		

	}

}
