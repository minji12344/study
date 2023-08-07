package Cardgame;

public class A_Main {
	public static void main(String[] args) {
		int score1 = 0;
		int score2 = 0;
		int hr1 = 0;
		
		A_Computer player1 = new A_Computer("com1");
		A_Computer player2 = new A_Computer("com2");

		for(int i=0; i<4; i++) {	
			int card1 = player1.inputComputer();
			int card2 = player2.inputComputer();
			
			if((card1 == 1 && card2 == 4) || (card1 == 4 && card2 == 1)) {
				System.out.println("노예와 왕이 만났습니다!");
				if(card1 == 1) {
					score1 += 4;
					hr1 = 1;
				} else {
					score2 += 4;
					hr1 = 2;
				}
				break;
			}
			else if(card1 > card2) {
				score1++;
			} else if(card2 > card1) {
				score2++;
			}
		}
		
		if(hr1 == 1) {
			System.out.println(player1.name+"이 히든 룰로 승리하였습니다.");
		}
		else if(hr1 == 2) {
			System.out.println(player2.name+"가 히든 룰로 승리하였습니다.");
		}
		else if(score1 > score2) {
			System.out.println(player1.name+"이 승리하였습니다.");
		} else if(score1 < score2) {
			System.out.println(player2.name+"가 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
	}
}
