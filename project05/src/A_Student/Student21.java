package A_Student;

public class Student21 extends Student{
	static final int num = 21;
	
	Student21(String name, int age, String gender){
		super(name, age, gender);
	}

	void Student21(int num){
		super.Student();
		System.out.println(name + " 의 학번 : " + this.num  + num );
	}
	
}
