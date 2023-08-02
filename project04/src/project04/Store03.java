package project04;

public class Store03 extends Store01{
	String name;
	int pay;
	int scor;
	
	Store03(String name, int pay, int scor){
		this.name = name;
		this.pay = pay;
		this.scor = scor;
	}
	void food() {
		System.out.println("별별식당");
	}
	void roomname() {
		System.out.println(203060);
	}
	void scor() {
		System.out.println("5");
	}
	
}
