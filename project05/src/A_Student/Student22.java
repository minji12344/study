package A_Student;

public class Student22 extends Student{
	static final int num = 22;
	static int number = 1;
	int stuNum;
	
	Student22(String name, int age, int num){
		super(name, age, num);
		number += 1;
		stuNum = number;
	}
	
	@Override
	void Student(){
		super.Student();
		System.out.println("'" + super.getName() + "' 의 학번 : " + this.num  + stuNum);
	}
}
