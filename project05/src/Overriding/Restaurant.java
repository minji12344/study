package Overriding;

public class Restaurant {
	private String nation;
	private String menu;
	
	Restaurant() { //숨겨진 코드
		super();
		menu = "없음";
	}
	
	Restaurant(String nation, String menu) {
		this.menu = menu;
	}
	
	void printMenu() {
		System.out.println("저희의 메인 메뉴는 " + menu + "입니다.");
	}
	
	String getnation() {
		return nation;
	}
	String getmenu() {
		return menu;
	}
	void setnation() {
		this.nation = nation;
	}
	void setmenu() {
		this.menu = menu;
	}
}
