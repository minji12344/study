package project04;

public class coffee02 extends coffee{
	String menu;
	int price;
	
	coffee02(String menu, int price){
		menu = "";
		price= 0;
	}
	
	void printcoffee() {
		super.printcoffee();
		System.out.println("메뉴 : " + menu + ", 가격 : " + price);
	}
	
}
