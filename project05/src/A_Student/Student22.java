package A_Student;

public class Student22 extends Student{
	final int num = 22;
	
	Student22(String name, int age, String gender){
		super(name, age, gender);
	}

	void Student22(int num){
		super.Student();
		System.out.println(name + " 의 학번 : " + this.num  + num );
	}
	
	void Student(){
		super.Student();
		System.out.println(name + " 의 학번 : " + this.num  + num );
	}
	
}
