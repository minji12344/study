package project04;

import java.util.ArrayList;

import Animal.Animal;
import Animal.Cat;
import Animal.Dog;
import Food.American;
import Food.Japanese;
import Food.Korean;
import Food.Restaurant;

public class pro2 {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Dog dog = new Dog("강아지", 4);
//		Cat cat = new Cat("고양이", 5);
//		
//		dog.eat();
//		dog.sleep();
//		System.out.println(dog.name + " " + dog.age);
//		cat.eat();
//		cat.sleep();
//		System.out.println(cat.name + " "+ cat.age);
//		
//		animal.eat();
//		animal.sleep();
//		System.out.println(animal.name + " "+ animal.age);

		Store02 store02 = new Store02("ㅇㅇ", 20390, 10);
		
		store02.food();
		System.out.println(store02.name);
		store02.roomname();
		System.out.println(store02.pay);
		store02.scor();
		System.out.println(store02.scor);
		
		Store03 store03 = new Store03("**", 22, 10);
		
		store03.food();
		System.out.println(store02.name);
		store03.roomname();
		System.out.println(store02.pay);
		store03.scor();
		System.out.println(store02.scor);
		
		System.out.println("=========Restaurant===Korean====Japanese====American===========");
//		
//		Restaurant res = new Restaurant();
//		res.printRes();
//		
//		Korean korean = new Korean();
//		korean.printRes();
//		
//		Japanese jap = new Japanese();
//		jap.printRes();
//				
//		American ame = new American();
//		ame.printRes();
//		
//		Korean kor2 = new Korean ( "대한민국","한식당", 5, "백반", 5000);
//		kor2.printRes();
//		
//		String[] menu = {"초밥", "라멘", "우동"};
//		int[] price = {10000,8000,6000};
//		Japanese jsp2 = new Japanese("일본", "일식당", 4, menu, price);
//		jsp2.printRes();
//		
//		jsp2.setPoint(1);
//		jsp2.setPoint(1);
//		jsp2.setPoint(1);
//		jsp2.setPoint(1);
//		jsp2.setPoint(1);
//		jsp2.setPoint(1);
//		jsp2.printRes();
//		
//		//Korean[] korea = new Korean[5];
//		ArrayList<Korean> koreaList = new ArrayList<>();
//		System.out.println("size : " + koreaList.size());
//		koreaList.add(korean);
//		System.out.println("size : " + koreaList.size());
//		koreaList.add(kor2);
//		System.out.println("size : " + koreaList.size());
//		
//		Korean kor3 = new Korean("대한민국", "국밥", 3, "국밥", 6000);
//		koreaList.add(kor3);
//		
//		koreaList.add(new Korean("대한민국", "김밥", 4, "김밥", 4000));
//		
//		
//		koreaList.add(new Korean("대한민국", "돼지", 6, "삼겹살" , 15000));
//		
//		
//		System.out.println(koreaList.get(2).name); //arr[2] = ArrayList.get(2).name
//		koreaList.remove(2);
//		
//		koreaList.get(2).printRes();
//		
//		System.out.println("size : " + koreaList.size());
//
//		koreaList.get(0).printRes();
//		koreaList.get(1).printRes();
//		koreaList.get(3).printRes();
//		
//
//		for(int i =0; i<koreaList.size(); i++) {
//			koreaList.get(i).printRes();
//			
//		}
//	
		
		
	}
	
	

}


// 상속(inheritance) -> 자식에게 물려주는 것.

// 부모 클래스(parent class), 기반 클래스(bass class)
// 부모 클래스는 보통 자식 클래스가 공통적으로 가지는 필드와 메서드를 정의할 때 사용한다.
// 부모클래스명 {}

// 자식 클래스(child class), 파생 클래스(derived class)
// 자식 클래스는 보통 부모 클래스에게 상속을 받아 새로운 클래스를 만드는 것. 속성, 메서드 들을 물려받을 수 있다.
// 자식클래스명 extends 부모클래스명{}
// 자식클래스에서 부모클래스에게 상속을 받아 속성과 메소드를 사용하려면 super 키워드를 사용해야 한다.


// 객체는 배열에 못넣나?
// String[] -> 객체 배열 

// 배열(Array) List
// ArratList
// 객체 밖에 못 넣는다.
// 배열의 단점 : 사이즈를 지정해줘야 한다.
// ArrayList는 사이즈가 유동적이다.

// ArrayList<객체> 어레이리스트명 = new ArrayList<>();

