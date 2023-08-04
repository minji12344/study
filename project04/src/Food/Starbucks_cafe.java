package Food;

public class Starbucks_cafe extends Cafe{
	String[] Juice; // = new String[3];
	int[] money;// = new int[3];
	
	Starbucks_cafe() {
		setting();
	}
	
	Starbucks_cafe(String name, int point){
		super(name, point);
		this.setting();
	}
	
	Starbucks_cafe(String name, int point, String Juice, int money){
		super(name, point);

		setting();
		this.Juice[0] = Juice;
		this.money[0] = money;
	}
	
	
	Starbucks_cafe(String name, int point, String[] Juice, int[] money){
		super(name, point);
		this.Juice = Juice;
		this.money = money;
	}
	
	Starbucks_cafe(String nation,String type, String name, int point, String[] Juice, int[] money){
		super(nation,type,name, point);
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
	void printRes() {
		super.printRes();
		for(int i=0; i<Juice.length;i++) {
			System.out.println("메뉴 : " + Juice[i] + ", 가격 : " + money[i]);
		}
	}
	
}
