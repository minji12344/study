package Food;

public class Japanese extends Restaurant{
	String[] menu; // = new String[3];
	int[] price;// = new int[3];
	
	Japanese() {
		setting();
	}
	
	Japanese(String name, int point){
		super(name, point);
		this.setting();
	}
	
	Japanese(String name, int point, String menu, int price){
		super(name, point);

		setting();
		this.menu[0] = menu;
		this.price[0] = price;
	}
	
	
	Japanese(String name, int point, String[] menu, int[] price){
		super(name, point);
		this.menu = menu;
		this.price = price;
	}
	
	Japanese(String nation,String type, String name, int point, String[] menu, int[] price){ // 메인 객체
		super(nation,type, name, point);
		
		this.menu = menu;
		this.price = price;
	}
	
	void setting() {
		menu = new String[3];
		price = new int[3];
		
		for(int i = 0; i < menu.length; i++) {
			menu[i] = "SOLD OUT";
			price[i] = 0;
		}
	}
	void printRes() {
		//super.Food();
		super.printRes();
		for(int i=0; i<menu.length;i++) {
			System.out.println("메뉴 : " + menu[i] + ", 가격 : " + price[i]);
		}
	}
	
	
}
