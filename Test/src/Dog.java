
public class Dog extends Animals{
	// 이름은 다르게 설정하는게 덜 헷갈림
	// 불러올 때 전역변수로 부모에게서 가지고 옴
	
	String species;
	String name;
	int age ;
	
	Dog(){
		this.name = "포포";
		this.age = 0;
		this.species ="??";
	}
	
	Dog(String name, int age, String species){
		super(name,age,species);
//		super.species;
		
	}
	
	void speak() {
		super.speak();
		System.out.println("dd");
	}
	
	void wlk(){
		System.out.println(this.name + "가 산책 갑니다.");
	}
	
	void trt() {
		super.trt();
	}
	
	void slp() {
		super.slp();
	}
}
