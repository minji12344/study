package Shapes;
// 사각형 => 사다리꼴
public class Trapezoidal extends Square{

	public static int upper; // 윗변
	public static int lower;// 아랫변
	
	Trapezoidal(int Height, int upper, int lower){
		super(Height);
		this.upper = upper;
		this.lower = lower;
	}
	
	void Shapes() {
		super.Shapes(Height);
		System.out.println("윗변 : " + upper + ", 아랫변 : " + lower + ", 높이 : " + Height);
		System.out.println("사다리꼴 넓이는 : " +(this.upper+this.lower)*Height/2);
	}
}
