package project04;

public class Store01 {
	String name;
	int pay;
	int scor;
	
	Store01(){
		name = "???";
		pay = 0;
		scor = 0;
	}
	
	Store01(String name, int pay, int scor){
		this.name = name;
		this.pay = pay;
		this.scor = scor;
	}
	
	void food() {
		System.out.println("식당이름? ");
	}
	void roomname() {
		System.out.println("금액은?");
	}
	void scor() {
		System.out.println("평점");
	}
}
