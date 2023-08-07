package Dice;

import java.util.Scanner;

public class Dice01 {
	
//	String name;
	
//	Dice01(String name){
//		this.name = name;
//	}
	int play1;
	int play2;
	String a;
	
	void play () {
	Scanner scan = new Scanner(System.in);

	for(int i = 0; i<=10; i++) {
		System.out.println("주사위를 굴립니다(엔터를 누르세요)");
		a = scan.nextLine();

		if(a.equals("")){
			int num = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			play1 = num;
			play2 = num2;
			System.out.println("play1의 숫자는 " + num + " 입니다.");
			System.out.println("play2의 숫자는 " + num2 + " 입니다.");
		}else{
			System.out.println("종료합니다.");
			break;
			}
			Result();
		}
	}
	void Result() {
		if(play1>play2) {
			System.out.println("play1이 이겼습니다.");
		}else if(play1<play2) {
			System.out.println("play2가 이겼습니다.");
		}else if(play1==play2) {
			System.out.println("무승부입니다.");
		}
	}
	
}