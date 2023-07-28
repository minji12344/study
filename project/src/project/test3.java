package project;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// 3. 점수 5개를 입력받는다. 최고점을 출력.
		Scanner scan = new Scanner(System.in);
		int highest = 0;
		

		System.out.print("점수를 입력하세요:");
		int a = scan.nextInt();		
		if(a>highest) {
			highest = a;
		}
		
		System.out.print("점수를 입력하세요:");
		int b = scan.nextInt();
		if(b>highest) {
			highest = b;
		}
		
		System.out.print("점수를 입력하세요:");
		int c = scan.nextInt();
		if(c>highest) {
			highest = c;
		}
		
		System.out.print("점수를 입력하세요:");
		int d = scan.nextInt();
		if(d>highest) {
			highest = d;
		}
		
		System.out.print("점수를 입력하세요:");
		int e = scan.nextInt();
		if(e>highest) {
			highest = e;
		}
		
		System.out.println("최고점은 " + highest + "입니다.");

	
		
		
	}

}
