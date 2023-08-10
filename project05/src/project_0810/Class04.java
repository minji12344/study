package project_0810;

public class Class04 {

}

abstract class Animal1{
	abstract void speak(); 
}

class Dog1 extends Animal1{
	@Override
	public void speak() {
		System.out.println("멍멍");
	}
}

class Cat1 extends Animal1{
	@Override
	public void speak() {
		System.out.println("야옹");
	}
}

class Tiger1 extends Cat1{
	
}

// 부모는 한명밖에 없다. extends는 하나밖에 받을 수 없다.
// 추상 클래스 vs 일반클래스








