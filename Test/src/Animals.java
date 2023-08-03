
public class Animals {
	String species;
	String name;
	int age;
	
	Animals(){
		name ="이름";
		age = 0;
		species = "동물";
	}
	
	Animals(String name, int age,String species){
		this.name = name;
		this.age = age;
		this.species = species;
	}
	void speak() {
		System.out.println("이름 : " + name + ", 나이 :" + age + ", 종류 :" + species);
	}
	
	void slp() {
		System.out.println(name + "가 잠을 잡니다.");
	}
	void trt() {
		System.out.println(name + "가 먹습니다.");
	}
}
