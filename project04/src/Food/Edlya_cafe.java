package Food;

public class Edlya_cafe extends Cafe{
	String[] Juice; // = new String[3];
	int[] money;// = new int[3];
	
	Edlya_cafe() {
		setting();
	}
	
	Edlya_cafe(String name, int point){
		super(name, point);
		this.setting();
	}
	
	Edlya_cafe(String name, int point, String Juice, int money){
		super(name, point);

		setting();
		this.Juice[0] = Juice;
		this.money[0] = money;
	}
	
	
	Edlya_cafe(String name, int point, String[] Juice, int[] money){
		super(name, point);
		this.Juice = Juice;
		this.money = money;
	}
	
	Edlya_cafe(String nation, String type,String name, int point, String[] Juice, int[] money){
		super(nation, type,name, point);
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
