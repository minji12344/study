package project03;

public class pro04 {

	public static void main(String[] args) {
		person lee = new person("Lee",21);
		
		lee.sayHello();
		System.out.println(lee.name);
		System.out.println(lee.age);
		
		person kim = new person("kim", 20);
		kim.sayHello();
		System.out.println(kim.name);
		System.out.println(kim.age);
		
		Dog dog1 = new Dog();
		dog1.age = 5;
		dog1.name = "푸들";
		dog1.sayHello();
		
		Dog dog2 = new Dog();
		dog2.age = 2;
		dog2.name = "치와와";
		dog2.sayHello();
		
		Car car1 = new Car();
		car1.name = "벤츠";
		car1.age = 2023;
		car1.sayHello();
		
		Car car2 = new Car();
		car2.name = "아반떼";
		car2.age = 2021;
		car2.sayHello();
		
	}

}



// 객체와 클래스 <- 객체 개념
// 자바 <객체지향언어>


// 클래스 (설계도)
// 객체 (설계도를 통해 만들어진 것)

// [접근제어자] class 클래스명 {
// 인스턴스 변수
// 자료형 변수명1;
// 자료형 변수명2;...

// 생성자
// 클래스명(매개변수1, 매개변수2...)

// 메소드
// 자료형 함수명(매개변수1, 매개변수2...){
// 코드
// 반환값
//}



// 자동차 클래스, 인스턴스 변수, 메소드
