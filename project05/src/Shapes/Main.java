package Shapes;

import project_0809.Math;

public class Main {

	public static void main(String[] args) {
			
		Circle ci = new Circle(5);
		ci.Shapes();
		
		Square sss = new Square(3);
		sss.Shapes();

		Rectangle rec = new Rectangle(4);
		rec.Shapes();

		Trapezoidal tr = new Trapezoidal(10,50,6);
		tr.Shapes();
		
		Rectangle rrr = new Rectangle(10);
		System.out.println(rrr);

		//		Square squ = new Trapezoidal(3,4,5); //부모 자식
//		squ.Shapes();
		
//		Shapes sh = new Shapes(1);
//		Rectangle re = (Rectangle) sh;
//		re = (Rectangle) sh;
			
		

	}

}
