package A_Student;

public class Student20 extends Student{
	static final int num = 20;
	static int number = 1;
	int stuNum;
	
	Student20(String name, int age, int num){
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
