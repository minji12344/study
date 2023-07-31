package project03;

public class pro03 {
	public static int a = 1;
	public static int b = 1;
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a++);
		System.out.println(b++);
		func1();
		System.out.println("1. a : " + a + ", b : " + b);
		func2(a, b);
		System.out.println("2. a : " + a + ", b : " + b);
		func3();
		System.out.println("3. a : " + a + ", b : " + b);
		func4();
		func5();
		System.out.println("4. a : " + a + ", b : " + b);
		func6();
		func7();
		System.out.println("5. a : " + a + ", b : " + b);
		
	}
	
	public static void func1() {
	    a++;
	    b++;
	}
	
	public static void func2(int a, int b) {
	    a++;
	    b++;
	}
	
	public static void func3() {
	    int a = -1;
	    int b = -2;
	}
	
	public static int func4() {
	    return a;
	}
	
	public static int func5() {
	    return b;
	}
	
	public static int func6() {
	    return a;
	}
	public static int func7() {
	    return b;
	}

}
