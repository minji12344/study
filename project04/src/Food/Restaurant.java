package Food;

public class Restaurant extends Food{
	String name;
	int point = 0;
	int count = 0;
	
	Restaurant(){
		name = "";
	}
	
	Restaurant(String nation, String type,String name, int point){
		super(nation, type);
		this.name = name;
		this.point += point;
		count++;
	}
	
	Restaurant(String nation, String type){
		super(nation, type);
		
	}
	
	Restaurant(String nation, String type, int point, String name){
		super(nation, type);
		this.name = name;
		this.point = point;
	}
	
//	Restaurant(Food food, int point, String name){
//		super(food.nation, food.type);
//		this.name = name;
//		this.point = point;
//	}
	
	Restaurant(String name, int point){
		this.name = name;
		this.point = point;
	}
	
	void setPoint(int point) {
		this.point += point;
		count++;
	}

	void printRes() {
		super.printRes();
		if(count == 0) {
			System.out.println("가게이름 : " + name + ", 평점 : 0");
		}
		else {
			System.out.println("가게이름 : " + name + ", 평점 : " +point/count);			
		}
	}
}
