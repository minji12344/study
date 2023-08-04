package project04;

import java.util.Scanner;

public class Dice01 {
	
	String name;
	
	
	Dice01(String name){
		this.name = name;
	}
	void play () {
	Scanner scan = new Scanner(System.in);

	for(int i = 0; i<=10; i++) {
		System.out.println("주사위를 굴립니다 1.y 2.n");
		String a = scan.nextLine();
		}
	}
	
	void game(int a, int play1) {
		
		if(a==0) {
			int num = (int)(Math.random()*5)+1;
			play1 = num; 
			System.out.println(name + "님의 숫자는 " + num +" 입니다.");
		
		}else {
			System.out.println("종료합니다.");
		}
	}
	void Result(int play1,int play2) {
		if(play1>play2) {
			System.out.println("play1이 이겼습니다.");
		}else if(play1<play2) {
			System.out.println("plat2가 이겼습니다.");
		}else{
			System.out.println("무승부 입니다.");
			}
	}
	
}