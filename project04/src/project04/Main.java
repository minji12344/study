package project04;

public class Main {

	public static void main(String[] args) {
		// 1. 요식업 - (식당, 카페) - (나라별 가게)
		// 2. 주사위 게임하는 사람들 - 객체가 생성되면 랜덤한 주사위 값(1~6)을 가지고 있다. 다른 객체와 주사위 값을 가지고 승부한다. 
		// 누가 이겼는지 판단을 하고, 게임 할 때마다 주사위 값이 바뀌어야 한다.
		// 3. 카드게임 -> 객체화
		// 컴퓨터, 사람를 객체화한다. 컴퓨터VS컴퓨터, 컴퓨터VS사람, 사람VS사람
		
		coffee co = new coffee("대한민국", "스벅");
		co.printcoffee();
				
		coffee02 co2 = new coffee02("딸기", 1000);
		co2.printcoffee();
		
		coffee02 co3 = new coffee02("바나나",1500);
		co3.printcoffee();
		
		Food fo = new Food("밥", "아이스크림");
		fo.Food();
	}

}
