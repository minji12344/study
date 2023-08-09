package A_Student;

public class Student {
	private String name;
	private int age;
	private int num;
	private int Korean = 1000;
	private int English = 2000;
	private int Math = 3000;
	
	Student(String name,int age, int num){
		this.name = name;
		this.age = age;
		this.num = num;
	}
	
	void Student(){
		System.out.println("이름 : " + name + ", 나이 : " + age);

		if(num > Korean) {
			System.out.println("학과 : 국문과");
		}
		else if(num > English) {
			System.out.println("학과 : 영문과");
		}
		else if(num > Math) {
			System.out.println("학과 : 수학과");
		}	
	}
	

	
	String getName() {
		return name;
	}
}
