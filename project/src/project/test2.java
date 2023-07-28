package project;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		// 2. 점수 하나 입력 -> 학점을 A,B,C,D,F (90 80 70 60 50)
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		
		System.out.print("점수를 입력하세요: ");
		a = scan.nextInt();
		
		if(a>=90) {
			System.out.println("학점이 A 입니다.");
		}else if(a>=80) {
			System.out.println("학점이 B 입니다.");
		}else if(a>=70) {
			System.out.println("학점이 C 입니다.");
		}else if(a>=60) {
			System.out.println("학점이 D 입니다.");
		}else {
			System.out.println("학점이 F입니다.");
		}
		
	}

}
