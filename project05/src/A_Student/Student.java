package A_Student;

public class Student {
	String name;
	int age;
	String gender;
	
	Student(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
//	Student(String name, int age ,String gender){
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}
	
	void Student(){
		System.out.println("이름 : " + name + " 나이 : " + age + " 성별 : " + gender);
	}
	
	void Student(String name, int age, String gender){
		System.out.println("이름 : " + name + " 나이 : " + age + " 성별 : " + gender);
	}
	
}
