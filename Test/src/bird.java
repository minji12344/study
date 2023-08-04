
public class bird extends Animals{
	boolean wings;
	String sings;
	
	bird(){
		//super();
		this.wings = false;
		this.sings = " - - - ";
	}
	
	bird(String name, int age, String species){
		super(name,age,species);
		this.wings = false;
		this.sings = " - - - ";
//		this.species=species;
//		this.name=name;
//		this.age = age;
	}
	bird(String name, int age, String species,boolean wings,String sings){
		super(name,age,species);
		this.wings = wings;
		this.sings = sings;
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
	
	void fly() {
		System.out.println(name + "이(가) 날아다닌다~");
	}
	
	void song() {
		System.out.println(name + "이(가) 부릅니다. => " + sings);
	}
	
	void songTo(String sings) {
		System.out.println(name + "이(가) 다른 새와 함께 부릅니다. => " + sings + this.sings);
	}
	
	void songToge(String name,String sings) {
		System.out.println(this.name + "이(가) "+ name +"(이)와 함께 부릅니다. => " + sings + this.sings);
	}
	
	void songTogether(String name, int age, boolean wings, String sings) {
		birdInfo(name, age , wings, sings);
		birdInfo(this.name, this.age , this.wings, this.sings);
	}
	
	void songWith(bird bird) {
		birdInfo2(bird);  //name, bird.age, bird.wings, bird.sings);
		birdInfo2(this); //.name, this.age , this.wings, this.sings);
	}
	
	void birdInfo2(bird bird) {
		System.out.println("이름 : " + bird.name + ", 나이 : " + bird.age );
		if(wings) {
			System.out.println("저는 날 수 있습니다");
		}else {
			System.out.println("저는 날 수 없습니다");
		}
		System.out.println("노래 시작" + bird.sings);
	}
	
	
	void birdInfo(String name, int age, boolean wings, String sings) {
		System.out.println("이름 : " + name + ", 나이 : " + age );
		if(wings) {
			System.out.println("저는 날 수 있습니다");
		}else {
			System.out.println("저는 날 수 없습니다");
		}
		System.out.println("노래 시작" + sings);
	}
}
	
