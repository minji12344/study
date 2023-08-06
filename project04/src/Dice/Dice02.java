package Dice;

import java.util.Scanner;

public class Dice02 {
	
	int play2;
	String a;
	
	
	void play () {
	Scanner scan = new Scanner(System.in);

	for(int i = 0; i<=10; i++) {
		System.out.println("주사위를 굴립니다");
		a = scan.nextLine();

		if(a.equals("")){
			int num = (int)(Math.random()*5)+1;
			play2 = num; 
			System.out.println("play2의 숫자는 " + num + " 입니다.");
		}else{
			System.out.println("종료합니다.");
			break;
			}
		}
	}
	
}