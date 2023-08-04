package Food;

public class Cafe extends Food{
	
	String name;
	int point = 0;
	int count = 0;
	
	Cafe(){
		nation ="";
		name = "";
	}
	
	Cafe(String nation, String type, String name, int point){
		super(nation,type);
		
		this.name = name;
		this.point += point;
		count++;
	}
	
	Cafe(String name, int point){
		this.name= name;
		this.point =point;
	}
	
	Cafe(String nation, String type){
		super(nation,type);
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
