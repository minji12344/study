package project_0807;

public class Class01 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		Class01 class01 = new Class01();
		
		animal.makeSound();
		cat.makeSound();
	}
}

class Animal{
	void makeSound() {
		System.out.println("동물이 울음소리를 낸다.");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("야옹~");
	}
}

// 오버라이딩(method overriding)
// 부모 클래스의 메서드를 자식 클래스에서 재정의하는 것.
// 부모 클래스의 동작을 자기 동작으로 바꾼다.

// 굳이 부모 클래스를 수정하지 않고, 자식 클래스에서 메서드 기능을 변경할 수 있다.


// 주석 -> 컴퓨터가 읽지 못하는 메모

//컴퓨터가 읽을 수 있는 메모 @Override

// 오버라이딩 할 메서드는 접근지정자(public), 반환 자료형, 이름, 매개변수 개수, 자료형이 부모 클래스와 일치해야한다.

// 영화(제목, 상영시간) 1.영화제목, 상영시간 출력 2. 영화장르 출력
// 영화장르 2~3개 영화장르 출력-> 메인에서 출력