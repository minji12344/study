package Cardgame;


public class A_Card {
	String[] cardGame = {"거지", "시민", "귀족", "왕"};
	int[] arr = new int[4];
	
	A_Card() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
	}
}
