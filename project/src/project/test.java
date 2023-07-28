package project;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;

		
		System.out.print("금액을 넣어주세요 : ");
		a = scan.nextInt();
		
//		b = scan.nextInt();
//		String str = scan.next();

		// 1. 자판기 만들기
		// 금액을 넣어주세요 : (입력)
		// 메뉴를 선택해주세요 : (메뉴1 -> 가격),(메뉴2 -> 가격) ...(입력) 메뉴선택
		// 잔액이 부족합니다. or 메뉴가 나왔습니다. 거스름돈 ?원이 나왔습니다.
		
		
			System.out.println("메뉴를 선택해주세요 : " + "1.콜라 = 500" + ", 2.사이다 = 1000");
		int str = scan.nextInt();
		if (str == 1) {
			if(a>=500) {
			System.out.println("콜라가 나왔습니다. 거스름돈은 " + (a-500)+"입니다.");
			}
		}
		else if(str == 2){
			if(a>=1000) {
			System.out.println("사이다가 나왔습니다. 거스름돈은 " + (a-1000) + "입니다.");
		} 
		}else {
			System.out.println("잔액 부족");

		}
			
		int money;
		String menu;
		
		System.out.print("금액을 입력하세요 : ");
		money = scan.nextInt();
		System.out.print("메뉴를 입력하세요: ");
		menu = scan.next();
		
		System.out.println("1.콜라:1000원, 2. 사이다 :1200원, 3.제로: 1500원");
		switch(menu) {
			case "콜라":
				if(money >= 1000){
					System.out.println("콜라가 나왔습니다. 거스름 돈은" + (money-1000)+ "입니다.");
				}else {
					System.out.println("잔액이 부족합니다.");
					break;
				}
			case "사이다":
				if(money >= 1200){
					System.out.println("사이다가 나왔습니다. 거스름 돈은" + (money-1200)+ "입니다.");
				}else {
					System.out.println("잔액이 부족합니다.");
				}	break;
				case "제로":
					if(money >= 1500){
						System.out.println("제로가 나왔습니다. 거스름 돈은" + (money-1500)+ "입니다.");
					}else {
						System.out.println("잔액이 부족합니다.");
						break;
					}
		
			
		}
		
	}

}

// 1. 자판기 만들기
// 금액을 넣어주세요 : (입력)
// 메뉴를 선택해주세요 : (메뉴1 -> 가격),(메뉴2 -> 가격) ...(입력) 메뉴선택
// 잔액이 부족합니다. or 메뉴가 나왔습니다. 거스름돈 ?원이 나왔습니다.

// 2. 점수 하나 입력 -> 학점을 A,B,C,D,F (90 80 70 60 50)
// 3. 점수 5개를 입력받는다. 최고점을 출력.
// 4. int a= 10, int b =20, int c= 30, if문을 가지고 -> C가 가장크다라고 출력하기
// ( 단, 3가지 방법)

