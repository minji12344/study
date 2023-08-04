package Food;

public class Food {
	String nation;
	String type;

	Food(){
		nation = "";
		type = "";
		
	}
	
	Food(String nation,String type){
		this.nation = nation;
		this.type = type;
	}
	
	
	
	void printRes() {
		System.out.println("나라: " + nation + ", 종류: " + type);
	}
	
	
	
}
