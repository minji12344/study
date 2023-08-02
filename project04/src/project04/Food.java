package project04;

public class Food {
	String food;
	String dessert;

	Food(){
		food = "";
		dessert = "";
	}
	
	Food(String food,String deesert){
		this.food = food;
		this.dessert = dessert;
	}
	
	
	void Food() {
		System.out.println("음식: " + food + " 디저트: " + dessert);
	}
	
	
	
}
