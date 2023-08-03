package project04;

public class Edlya_coffee extends coffee{
	String[] Juice; // = new String[3];
	int[] money;// = new int[3];
	
	Edlya_coffee() {
		setting();
	}
	
	Edlya_coffee(String nation, String name, int point){
		super(nation, name, point);
		this.setting();
	}
	
	Edlya_coffee(String nation, String name, int point, String Juice, int money){
		super(nation, name, point);

		setting();
		this.Juice[0] = Juice;
		this.money[0] = money;
	}
	
	
	Edlya_coffee(String nation, String name, int point, String[] Juice, int[] money){
		super(nation, name, point);
		this.Juice = Juice;
		this.money = money;
	}
	
	void setting() {
		Juice = new String[3];
		money = new int[3];
		
		for(int i = 0; i < Juice.length; i++) {
			Juice[i] = "SOLD OUT";
			money[i] = 0;
		}
	}
	void printcoffee() {
		super.printcoffee();
		for(int i=0; i<Juice.length;i++) {
			System.out.println("메뉴 : " + Juice[i] + ", 가격 : " + money[i]);
		}
	}
}
