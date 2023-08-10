package Shapes;
// 도형
public class Shapes {
	public static int Length; // 길이
	
	Shapes(){
	}
	
	Shapes(int Length){
		this.Length = Length;
	}
	
	void Shapes(int Length) {
		System.out.println(Length);
	}
	
	void printShapes() {
		System.out.println("길이 :"  + Length);
	}
	
	
}
