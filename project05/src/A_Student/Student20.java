package A_Student;

public class Student20 extends Student{
	final int num = 20;
	
	Student20(String name, int age, String gender){
		super(name, age, gender);
	}

	void Student20(int num){
		super.Student();
		System.out.println(name + " 의 학번 : " + this.num  + num );
	}
	
	void Student(){
		super.Student();
		System.out.println(name + " 의 학번 : " + this.num  + num );
	}
	
}
