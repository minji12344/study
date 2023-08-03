package project04;

public class coffee extends Food{
	String nation;
	String name;
	int point = 0;
	int count = 0;
	
	coffee(){
		nation ="";
		name = "";
	}
	
	coffee(String nation, String name, int point){
		this.nation= nation;
		this.name = name;
		this.point += point;
		count++;
	}
	void printcoffee() {
		if(count == 0) {
			System.out.println("국가 : " +nation + ", 가게이름 : " + name + ", 평점 : 0");
		}
		else {
			System.out.println("국가 : " +nation + ", 가게이름 : " + name + ", 평점 : " +point/count);			
		}
	}
	
	void setPoint(int point) {
		this.point += point;
		count++;
	}

}
