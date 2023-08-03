
public class bird extends Animals{
	String species;
	String name;
	int age ;
	
	bird(String name, int age, String species){
		super(name,age,species);
//		this.species=species;
//		this.name=name;
//		this.age = age;
	}
	
	void speak() {
		super.speak();
	}
	
	void wlk(){
		System.out.println(name + "가 종이를 뜯어 몸을 치장합니다.");
	}
	void trt() {
		super.trt();
	}
	
	void slp() {
		super.slp();
	}
}
