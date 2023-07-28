package project;

import java.util.Scanner;

public class project3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a; //변수 선언
		double b = 123.456; //변수 선언과 초기화
//		a = 12; // 변수 초기화
//		a =a + 100; // 초기화 이전엔 쓰레기 값이 들어가있다.
//		
//		a = scan.nextInt();
//		System.out.println("a : " +a);
//		
//		b = scan.nextDouble();
//		System.out.println("b : "+ b);
//		
//		String str;
//		str = scan.next();
//		System.out.println("str : " + str);
//		
//		scan.nextLine();
//		str =scan.nextLine();
//		System.out.println("str :" + str);
//		

		// 실수 2개를 입력받고, 2개의 합을 출력
		double x;
		double y;
		
		x = scan.nextDouble();
//		System.out.println("x: " + x);
		
		
		y = scan.nextDouble();
//		System.out.println("y: " + y);
		
		System.out.println("x: " + x + " y: " + y + " 합계: " + (x+y));
//		System.out.println( x+y+" 합계: ");  앞의 숫자는 더해짐
//		double x,y;
//		System.out.println("실수 2개를 입력하세요 :");
//		x = scan.nextDouble();
//		y = scan.nextDouble();
//		System.out.println("두 수의 합 : " + (x+y) );
		
		
		System.out.println("---------------------------");
		// 사용자 둘에게 점수를 입력받아서 100점 넘으면 ture, 넘지않으면 false
		
		int num_1;
		int num_2;
		
		num_1 = scan.nextInt();
//		System.out.println("철수: " + num_1);
		
		num_2 = scan.nextInt();
//		System.out.println("영희: " + num_2);
		
		System.out.println("철수: " + num_1 + "점, 영희: " + num_2 + "점, 성공여부: " + (num_1>=100 &&  num_2>=100));
		
		
		
		
	}

}
// nextLine : 띄워쓰기 상관없이 모두 표기, next : 띄워쓰기 하면 뒷부분이 안나옴 
// 출력 - System.out
// 입력 - System.in