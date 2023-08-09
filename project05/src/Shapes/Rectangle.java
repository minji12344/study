package Shapes;

public class Rectangle extends Square{

	Rectangle(int Height, int base){
		super(Height,base);
	}
	
	@Override
	void Area() {
		System.out.println("정 사각형의 넓이는 : " + Height*base);
	}
}
