package Shapes;
// 사각형 => 정사각형
public class Rectangle extends Square{

	Rectangle(int Length){
		super(Length);
	}
	
	void Shapes() {
		System.out.println("정사각형의 길이 : " + Length);
		System.out.println("정사각형의 넓이는 : " + Length*Length);
	}
	
	public String toString() {
		return "정사각형의 넓이는 : " + Height*Height;
	}
}
