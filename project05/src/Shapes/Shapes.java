package Shapes;

public class Shapes {
	public static int Height;
	public static int base;
	
	Shapes(int Height, int base){
		this.Height = Height;
		this.base = base;
	}
	
	void Area() {
		System.out.println("높이 : " + Height + ", 밑변 :" + base);
	}
}
