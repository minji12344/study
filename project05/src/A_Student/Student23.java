package A_Student;

public class Student23 extends Student{
	final int num = 23;
	
	Student23(String name, int age, String gender){
		super(name, age, gender);
	}

	void Student23(int num){
		super.Student();
		System.out.println(name + " 의 학번 : " + this.num  + num );
	}
	
	void Student(){
		super.Student();
		System.out.println(name + " 의 학번 : " + this.num  + num );
	}
	
}
