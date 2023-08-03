// 사람 설계도 (객체)
public class Person {
	String name;
	int age;
	
	Person(){ //첨부파일이 없다. = 기본 생성자

	}
	
	Person(String name, int age){
		// Person = this 
		this.name = name;
		this.age = age;
	}
	
	void speak() {
		System.out.println("이름 : " + name +", 나이 : " + age);
	}
	
	void run() {
		System.out.println(name + "이(가) 달려갑니다.");
	}
	void eat() {
		System.out.println(name + "이(가) 밥을 먹습니다.");
	}
}
