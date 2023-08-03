
public class class07_01 {
	public static void main(String[] args) {
		class07_People a = new class07_People("개", 13 ,"의사", "독서");
		class07_People b = new class07_People("돼지", 8, "변호사" , "맛집탐험");
		class07_People c = new class07_People("하마", 5, "프로게이머", "게임");
	
		a.me();
		a.work();
		a.play();
		
		b.me();
		b.work();
		b.play();

		c.me();
		c.work();
		c.play();
		
	}

}