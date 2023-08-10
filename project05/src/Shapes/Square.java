package Shapes;
// 사각형
public class Square extends Shapes{
	public static int Height; // 높이
	
	Square(int Height){
		this.Height = Height;
	}
	
	Square(int Length, int Height){
		super(Length);
		this.Height = Height;
	}
	
	void Shapes() {
		System.out.println("사각형의 넓이 : " + Length*Length);
	}
	
	public String toString() {
		return "사각형 높이는 : " + Length*Length;
	}
	
}
