
public class Dog extends Animals{
	// 이름은 다르게 설정하는게 덜 헷갈림 ( 명확하게 다른 이름으로)
	// 불러올 때 전역변수로 부모에게서 가지고 옴
	// 상송받았을 경우, 부모의 것들을 자식클래스가 마음대로 사용가능.
	
	String species;
	String name; // 자식 클래스를 먼저 찾아보고, 자실 클래스에 없으면 부모클래스를 찾아본다.
	int age ;
	
	Dog(){
		this.name = "포포"; //this.name =전역변수
		this.age = 0;
		this.species ="??";
	}
	
	Dog(String name, int age, String species){
		super(name,age,species);
//		super.species;
		
	}
	
	void speak() {
		super.speak();
		System.out.println("안녕안녕");
	}
	
	void wlk(){
		System.out.println(this.name + "가 산책 갑니다.");
	}
	
	void trt() {
		super.trt();
	}
	
	void slp() {
		super.slp();
		System.out.println(name + "가 웅크리며 잔다.");
	}
}
