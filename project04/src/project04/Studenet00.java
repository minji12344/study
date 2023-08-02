package project04;

public class Studenet00 {
	public static void main(String[] args) {
		
		int num = 1;
		Student stu = new Student("Min", 20, "010-1234", num++);
		stu.printStudent();
		
		Student stu1 = new Student("ji", 30, "1222-322", num++);
		stu1.printStudent();
		
		Student stu2 = new Student("kim", 40, "1234-5678", num++);
		stu2.printStudent();
		
		Student stu3 = new Student("123-456123");
		System.out.println(stu3.number);
		
		System.out.println();
	}
}
