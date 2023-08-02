package project04;

public class coffee extends Food{
	
	String nation;
	String name;
	String menu;
	int price;
	
	coffee(){
		nation = "";
		name = "";
	}
	
	coffee(String nation, String name){
		nation = "";
		name = "";
	}
	
	coffee(String nation, String name, String nation2, String name2){
		nation = "";
		name = "";
	}
	
	void printcoffee() {
		
		System.out.println( "국가 : " + nation +", 이름 : " + name);
	}
	
	
	
}
