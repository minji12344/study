package Shapes;
// 원
public class Circle extends Shapes{

	Circle(int Length){
		super(Length);
	}
	
	void Shapes() {
//		super.Shapes(Length);
		System.out.println("반지름 : " + Length);
		System.out.println("원 넓이는 : " + Length * Length* 3.14);
	}
}
