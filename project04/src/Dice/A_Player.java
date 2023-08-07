package Dice;

public class A_Player {
	int dice;
	String name;
	
	A_Player(){
		dice = rollDice();
		name = "알 수 없음";
	}
	
	A_Player(String name){
		dice = rollDice();
		this.name = name;
	}
	
	String play(A_Player player) {
		String winner;
		if(this.dice > player.dice) {
			winner = this.name;			
		}
		else if(this.dice < player.dice) {
			winner = player.name;			

		}
		else {
			winner = "무승부";
		}

		return winner;
	}
	
	String play3(A_Player player1, A_Player player2) {
		String winner = player1.play(player2);
		if(winner.equals(player1.name)) {
			winner = this.play(player1);
			// 자기자신과 플레이어1 무승부?
			if(winner.equals("무승부")) {
				player1.dice = rollDice();
				this.dice = rollDice();
				winner = this.rematch(this ,player1);
			}
		}
		else if(winner.equals(player2.name)) {
			winner = player2.play(this);
			// 자기자신과 플레이어2 무승부?
			if(winner.equals("무승부")) {
				winner = this.rematch(this ,player2);
			}
		}
		else {
			// 플레이어 1,2 무승부
			winner = player1.play(this);
			// 자기자신도 무승부
			if(winner.equals("무승부")) {
				player1.dice = this.rollDice();
				player2.dice = rollDice();
				this.dice = rollDice();
				System.out.println("무승부입니다. 재경기합니다.");
				this.play3(player1, player2); //재귀함수 -> 함수 안에서 다시 함수 호출
			}
			else if(winner.equals(player1.name)) {
				winner = this.rematch(player1, player2);
			}
		}
		
		player1.dice = this.rollDice();
		player2.dice = rollDice();
		this.dice = rollDice();
		
		return winner;
	}
	
	int rollDice() {
		return (int) (Math.random()*6+1);
	}
	
	String rematch(A_Player player1, A_Player player2) {
		System.out.println("무승부입니다. 재경기합니다.");
		String winner = player1.play(player2);
		while(winner.equals("무승부")) {
			System.out.println(player1.dice + player2.dice);
			System.out.println("무승부입니다. 재경기합니다.");
			player1.dice =rollDice();
			player2.dice =rollDice();
			winner = player1.play(player2);
		}
		return winner;
	}
}





