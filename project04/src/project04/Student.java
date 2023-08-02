package project04;

public class Student {
	String name;
	int age;
	String number;
	int num;
	
	
	
	Student(){
		name = "name";
		age = 0;
		number = "0";
		num = 0;
		
		
	}
	Student(String str){// String 하나를 매개변수로 받는 생성자
		name = str;
		age = 0;
		number = "0";
		num = 0;
		
		if(str.charAt(0)<58) {
			number = str;
			name =  "name";
		}else {
			name = str;
			number = "0";
		}
	}
	
	
//	Student(String str){// String 하나를 매개변수로 받는 생성자
//		name = "name";
//		age = 0;
//		number = str;
//		num = 0;
//	}
	

	Student(String str, int a){
		name =str;
		age = a;
		number = "0";
		num = 0;
	}
	Student(String str, int a, String b){
		// this(); 클래스 내부 (생성자 내부)에서 기본 생성자를 호출
		this(str);
		
	}
	Student(String name, int age, String number, int num){
		this.name = name;
		this.age = age;
		this.number = number;
		this.num =num;
		
	}
	void printStudent() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 연락처 : " + number + " 학번 : " + num);
	}
	
}
// this => 클래스 내부를 가르킨다. (this.인스턴스변수)
// Student.printStudent(); 단,this -> 해당 객체
// this() -> 메소드, 생성자 -> s1(); 
// 생성자 부분에서 다른 생성자를 불러오는 것.
// 생성자 가장 첫번째 줄에 나와야한다.