package Shapes;

public class Square extends Shapes{
	
	Square(int Height, int base){
		super(Height,base);
	}
	
	@Override
	void Area() {
		super.Area();
		System.out.println("넓이는 : " + Height*base);
	}
}
