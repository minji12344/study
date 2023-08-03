package project04;

public class Main {

	public static void main(String[] args) {
		// 1. 요식업 - (식당, 카페) - (나라별 가게)
		// 2. 주사위 게임하는 사람들 - 객체가 생성되면 랜덤한 주사위 값(1~6)을 가지고 있다. 다른 객체와 주사위 값을 가지고 승부한다. 
		// 누가 이겼는지 판단을 하고, 게임 할 때마다 주사위 값이 바뀌어야 한다.
		// 3. 카드게임 -> 객체화
		// 컴퓨터, 사람를 객체화한다. 컴퓨터VS컴퓨터, 컴퓨터VS사람, 사람VS사람
		// 4. 마름모 0으로 만들기
		
		
		// 음식
		Restaurant res = new Restaurant();
		Korean korean = new Korean();
		Japanese jap = new Japanese();
		American ame = new American();
		
		String [] menu = {"백반", "국밥", "삼겹살"};
		int [] price = {6000,8000,15000};
		Korean kor2 = new Korean ( "대한민국","한식당", 5, menu, price);
		kor2.printRes();
		System.out.println();
		
		String[] menu1 = {"초밥", "라멘", "우동"};
		int[] price1 = {10000,8000,6000};
		Japanese jsp2 = new Japanese("일본", "일식당", 4, menu1, price1);
		jsp2.printRes();
		System.out.println();

		
		String[] menu3 = {"햄버거", "피자", "치킨"};
		int[] price3 = {6500,1200,17000};
		American ame1 = new American("미국", "양식당", 7, menu3, price3);
		ame1.printRes();
		System.out.println();

		
		//디저트
		coffee co = new coffee();
		Starbucks_coffee sta = new Starbucks_coffee();
		Edlya_coffee edy = new Edlya_coffee();
		
		String[] Juice = {"아메리카노", "라떼", "마끼야또"};
		int[] money = {6500,1200,17000};
		Starbucks_coffee sta1 = new Starbucks_coffee("전세계", "스타벅스", 2, Juice, money);
		sta1.printcoffee();
		System.out.println();

		String[] Juice1 = {"쥬스", "스무디", "플랫치노"};
		int[] money1 = {6500,1200,17000};
		Edlya_coffee edy1 = new Edlya_coffee("영국", "이디야", 6, Juice1, money1);
		edy1.printcoffee();
		
		
		
		
//		
//		coffee co = new coffee("대한민국", "스벅");
//		co.printcoffee();
//				
//		coffee02 co2 = new coffee02("딸기", 1000);
//		co2.printcoffee();
//		
//		coffee02 co3 = new coffee02("바나나",1500);
//		co3.printcoffee();
//		
//		Food fo = new Food("밥", "아이스크림");
//		fo.Food();
	}

}
