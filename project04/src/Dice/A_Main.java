package Dice;

public class A_Main {

	public static void main(String[] args) {
		A_Player player1 = new A_Player("플레이어1");
		A_Player player2 = new A_Player("플레이어2");
		A_Player player3 = new A_Player("플레이어3");

//		System.out.println("player1 : " + player1.dice);
//		System.out.println("player2 : " + player2.dice);

		String winner = player1.play(player2);
//		while(winner.equals("무승부")) {
//			System.out.println("무승부입니다. 재경기합니다.");
//			winner = player1.play(player2);
//		}
//		System.out.println("승자는 " + winner + " 입니다.");
//		
		winner = player1.play3(player2, player3);
		System.out.println("세명 중 승자는 " + winner + " 입니다.");
	}

}
