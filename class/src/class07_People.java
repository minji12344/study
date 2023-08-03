
public class class07_People {
	String name; //인스턴스 변수
	int age;//인스턴스 변수
	String job;//인스턴스 변수
	String hobby;//인스턴스 변수
	
	class07_People(String name, int age, String job, String hobby){//생성자
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
	}
	
	void me() {//메소드
		System.out.println("저는 " + name + " 입니다. 그리고 나이는 " + age + "입니다.");
	}
		
	void work() {//메소드
		System.out.println(name + "의 직업은 " + job + "입니다.");	
	}
	
	void play() {//메소드
		System.out.println(name + "의 취미는 "+ hobby + "입니다.");
		System.out.println();
	}
	
}
