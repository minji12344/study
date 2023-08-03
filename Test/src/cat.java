
public class cat extends Animals{
	String species;
	String name;
	int age ;
	
	cat(String name, int age, String species){
		super(name,age,species);
	}
	
	void speak() {
		super.speak();
	}
	void wlk(){
		System.out.println(name + "가 높은 곳에 올라갑니다.");
	}
	void trt() {
		super.trt();
	}
	
	void slp() {
		super.slp();
	}
}
